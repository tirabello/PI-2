package com.mycompany.projetopi2.models;

public class RelatorioAnalitico {

    private int numVenda;
    private int numItem;
    private String Produto;
    private double vlrUnitario;
    private int qtdVendida;
    private double vlrTotal;

    public RelatorioAnalitico() {
    }

    public RelatorioAnalitico(int numVenda, int numItem, String produto, double vlrUnitario, int qtdVendida, double vlrTotal) {
        this.numVenda = numVenda;
        this.numItem = numItem;
        this.Produto = produto;
        this.vlrUnitario = vlrUnitario;
        this.qtdVendida = qtdVendida;
        this.vlrTotal = vlrTotal;
    }

    public int getNumVenda() {
        return numVenda;
    }

    public void setNumVenda(int numVenda) {
        this.numVenda = numVenda;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

}
