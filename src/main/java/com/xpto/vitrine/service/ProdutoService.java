package com.xpto.vitrine.service;

import com.xpto.vitrine.model.Produto;
import com.xpto.vitrine.model.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> buscarProdutos() {
        return produtoRepository.findAll();
    }
}
