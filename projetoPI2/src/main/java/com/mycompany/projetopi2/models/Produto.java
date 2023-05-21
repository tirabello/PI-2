package com.mycompany.projetopi2.models;

public class Produto {

    private int idProduto;
    private String nome;
    private String codProduto;
    private double valor;
    private String categoria;
    private String unidadeVenda;
    private int quantidade;
    private String descricao;

    public Produto() {
    }

    public Produto(String nome, String codProduto, double valor, String categoria,
            String unidadeVenda, int quantidade, String descricao) {
        this.nome = nome;
        this.codProduto = codProduto;
        this.valor = valor;
        this.categoria = categoria;
        this.unidadeVenda = unidadeVenda;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUnidadeVenda() {
        return unidadeVenda;
    }

    public void setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

}
