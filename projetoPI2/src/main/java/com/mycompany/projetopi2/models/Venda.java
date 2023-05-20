/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ldss1
 */
public class Venda {

    private int idVenda;
    private int idCliente;
    private int qntItens;
    private double vlrTotal;
    private Date DataVenda;
    private ArrayList<ItemVenda> listaProdutos;

    public Venda() {
    }

    public Venda(int idVenda, int idProduto, int idCliente, int qntItens, double vlrTotal, Date DataVenda, ArrayList<ItemVenda> listaProdutos) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.qntItens = qntItens;
        this.vlrTotal = vlrTotal;
        this.DataVenda = DataVenda;
        this.listaProdutos = listaProdutos;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getQntItens() {
        return qntItens;
    }

    public void setQntItens(int qntItens) {
        this.qntItens = qntItens;
    }

    public double getValorTotal() {
        return vlrTotal;
    }

    public void setValorTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public Date getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(Date DataVenda) {
        this.DataVenda = DataVenda;
    }

    public ArrayList<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

}
