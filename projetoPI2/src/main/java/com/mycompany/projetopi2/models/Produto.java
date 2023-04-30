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

	private int idProduto;
    private String nome;
	private String codProduto;
	private double valor;
    private String tipoProduto;
	private String unidadeVenda;
	private int quantidade;
	private String descricao;


	public Produto() {
	}


	public Produto(String nome, String codProduto, double valor, String tipoProduto,
			String unidadeVenda, int quantidade, String descricao) {
		this.nome = nome;
		this.codProduto = codProduto;
		this.valor = valor;
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


	public String getCodProduto() {
		return codProduto;
	}


	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}


	public double getvalor() {
		return valor;
	}


	public void setvalor(double valor) {
		this.valor = valor;
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

}
