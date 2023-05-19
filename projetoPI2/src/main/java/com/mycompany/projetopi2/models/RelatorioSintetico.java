/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.projetopi2.models;

import java.util.Date;

/**
 * 
 * @author ldss1
 */
public class RelatorioSintetico {
    
    private int numVenda;
	private Date dataVenda;
	private String nomeCliente;
	private int qtdProdutos;
	private double vlrTotal;


	public RelatorioSintetico() {
	}

	public RelatorioSintetico(int numVenda, Date dataVenda, String nomeCliente, int qtdProdutos, double vlrTotal) {
		this.numVenda = numVenda;
		this.dataVenda = dataVenda;
		this.nomeCliente = nomeCliente;
		this.qtdProdutos = qtdProdutos;
		this.vlrTotal = vlrTotal;
	}
	
	public int getNumVenda() {
		return numVenda;
	}
	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getQtdProdutos() {
		return qtdProdutos;
	}
	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	public double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}


}
