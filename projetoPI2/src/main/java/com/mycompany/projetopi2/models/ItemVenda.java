/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.models;

/**
 *
 * @author ldss1
 */
public class ItemVenda {
    
    private int idVenda;
    private int numItem;
    private int codProduto;
    private int qntProduto;
    
    
    public ItemVenda() {
    }

    public ItemVenda(int idVenda, int numItem, int codProduto, int qntProduto, double vlrUnitario) {
        this.idVenda = idVenda;
        this.numItem = numItem;
        this.codProduto = codProduto;
        this.qntProduto = qntProduto;
        this.vlrUnitario = vlrUnitario;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(int qntProduto) {
        this.qntProduto = qntProduto;
    }

    public double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }
    private double vlrUnitario;

}
