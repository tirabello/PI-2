package com.mycompany.projetopi2.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ldss1
 */
public class Produto {
    private String nome;
	private int cod_produto;
	private String categoria;
	private double preco;
	private String tipoProduto;
	private String unidadeVenda;
	private int quantidade;
	private String descricao;


	public Produto() {
	}


	public Produto(String nome, int cod_produto, String categoria, double preco, String tipoProduto,
			String unidadeVenda, int quantidade, String descricao) {
		this.nome = nome;
		this.cod_produto = cod_produto;
		this.categoria = categoria;
		this.preco = preco;
		this.tipoProduto = tipoProduto;
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


	public int getCod_produto() {
		return cod_produto;
	}


	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getTipoProduto() {
		return tipoProduto;
	}


	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
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

	

	




}
