package com.senai.herois.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "herois")
public class Heroi {

    @Id
    @Column(length = 20, nullable = false)
    private String nome;
    @Column(length = 40, nullable = false)
    private String superpoder;
    @Column(nullable = true)
    private Integer idade;
    @Column(length = 80, nullable = true)
    private String cidade;

    @Override
    public String toString() {
        return "Heroi [nome=" + nome + ", superpoder=" + superpoder + ", idade=" + idade + ", cidade=" + cidade + "]";
    }

    public Heroi(String nome, String superpoder, Integer idade, String cidade) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
