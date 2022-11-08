package com.xpto.vitrine.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
@Builder
@Getter
public class Produto {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String descricao;

}
