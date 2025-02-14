package com.example.api_reserva_mesa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItensEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Gera automaticamente o valor do id
    private Long id;
    private String nome;
    private int quantidade;
    private double precoUnitario;
    private double precoTotal;
    private String descricao;

    // Construtor
    public ItensEntity(String nome, int quantidade, double precoUnitario, double precoTotal, String descricao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.precoTotal = precoTotal;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double calcularPrecoUnitario() {
        return precoUnitario * quantidade;
    }

    public double calcularPrecoTotal() {
        return precoTotal * quantidade;
    }

    @Override
    public String toString() {
        return "ItensEntity{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", quantidade=" + quantidade +
               ", preco=" + precoUnitario +
               '}';
    }
}
