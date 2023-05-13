/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author ldss1
 */
public class Venda {

    private int idVenda;
    private int idCliente;
    private int qntItens;
    private double vlrTotal;
    private LocalDateTime DataHora;
    private ArrayList<ItemVenda> listaProdutos;

    public Venda() {
    }

    public Venda(int idVenda, int idProduto, int idCliente, int qntItens, double vlrTotal, LocalDateTime DataHora, ArrayList<ItemVenda> listaProdutos) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.qntItens = qntItens;
        this.vlrTotal = vlrTotal;
        this.DataHora = DataHora;
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

    public LocalDateTime getDataHora() {
        return DataHora;
    }

    public void setDataHora(LocalDateTime DataHora) {
        this.DataHora = DataHora;
    }

    public ArrayList<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

}
