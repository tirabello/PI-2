/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import com.mycompany.projetopi2.models.ItemVenda;
import com.mycompany.projetopi2.models.RelatorioAnalitico;
import com.mycompany.projetopi2.models.RelatorioSintetico;
import com.mycompany.projetopi2.models.Venda;
import com.mycompany.projetopi2.utils.GerenciadorConexao;

/**
 *
 * @author ldss1
 * @see com.mycompany.projetopi2.models.Venda
 * @see com.mycompany.projetopi2.models.ItemVenda
 * @see com.mycompany.projetopi2.models.RelatorioAnalitico
 * @see com.mycompany.projetopi2.models.RelatorioSintetico
 * @see com.mycompany.projetopi2.utils.GerenciadorConexao
 * @since 20-05-2023
 * @version 1.0
 *
 */
public class VendaDAO {

    private static boolean status = false;
    private static Connection conexao = null;
    private static PreparedStatement instrucaoSQL = null;
    private static String query;

    // Adicionar Venda (Finalizar Venda)
    /**
     * @param venda - Objeto do tipo Venda
     * @return boolean - true: sucesso , false:falha
     */
    public static boolean finalizarVenda(Venda venda) {

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "INSERT INTO Venda (IDCliente, DataHora, QntItens, VlrTotal) VALUES (?, ?, ?, ?)";

            instrucaoSQL = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setInt(1, venda.getIdCliente());
            instrucaoSQL.setDate(2, new java.sql.Date(venda.getDataVenda().getTime()));
            instrucaoSQL.setInt(3, venda.getQntItens());
            instrucaoSQL.setDouble(4, venda.getValorTotal());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                ResultSet rs = instrucaoSQL.getGeneratedKeys();

                if (rs.next()) {
                    int codProduto = rs.getInt(1);
                    query = "INSERT INTO ItemVenda (IDVenda, NumItem, CodProduto, VlrUnitario, Quantidade) VALUES (?, ?, ?, ?, ?)";

                    for (ItemVenda item : venda.getListaProdutos()) {
                        instrucaoSQL = conexao.prepareStatement(query);
                        instrucaoSQL.setInt(1, codProduto);
                        instrucaoSQL.setInt(2, item.getNumItem());
                        instrucaoSQL.setInt(3, item.getCodProduto());
                        instrucaoSQL.setDouble(4, item.getVlrUnitario());
                        instrucaoSQL.setInt(5, item.getQntProduto());
                        instrucaoSQL.executeUpdate();
                    }
                }
                status = true;

            } else {
                System.out.println("Erro ao cadastrar venda!");
            }

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar venda: " + e.getMessage());
        }
        return status;
    }

    // Buscar Venda por período (em Dias)
    /**
     * @param dia - int com a quantidade de dias para buscar as vendas
     * @return Um ArrayList do tipo RelatorioSintetico com as vendas do período
     */
    public static ArrayList<RelatorioSintetico> buscarVendas(int dia) {
        ArrayList<RelatorioSintetico> listaVendas = new ArrayList<>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "SELECT * FROM Vendas WHERE DataVenda BETWEEN DATE_SUB(NOW(), INTERVAL ? DAY) AND NOW()";

            instrucaoSQL = conexao.prepareStatement(query);
            instrucaoSQL.setInt(1, (dia + 1));

            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                RelatorioSintetico venda = new RelatorioSintetico();
                venda.setNumVenda(rs.getInt("NumVenda"));
                venda.setDataVenda(rs.getDate("DataVenda"));
                venda.setNomeCliente(rs.getString("NomeCliente"));
                venda.setQtdProdutos(rs.getInt("QntItens"));
                venda.setVlrTotal(rs.getDouble("VlrTotalVenda"));
                listaVendas.add(venda);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar vendas: " + e.getMessage());
        }

        return listaVendas;
    }

    // Buscar Venda por período (Data Inicial e Data Final)
    /**
     * @param dataInicial - Date com a data inicial para buscar as vendas
     * @param dataFinal - Date com a data final para buscar as vendas
     * @return Um ArrayList do tipo RelatorioSintetico com as vendas do período
     */
    public static ArrayList<RelatorioSintetico> buscarVendas(Date dataInicial, Date dataFinal) {
        ArrayList<RelatorioSintetico> listaVendas = new ArrayList<>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "SELECT * FROM Vendas WHERE DataVenda BETWEEN ? AND ?";

            instrucaoSQL = conexao.prepareStatement(query);
            instrucaoSQL.setDate(1, java.sql.Date.valueOf(dataInicial.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()));
            instrucaoSQL.setDate(2, java.sql.Date.valueOf(dataFinal.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()));

            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                RelatorioSintetico venda = new RelatorioSintetico();
                venda.setNumVenda(rs.getInt("NumVenda"));
                venda.setDataVenda(rs.getDate("DataVenda"));
                venda.setNomeCliente(rs.getString("NomeCliente"));
                venda.setQtdProdutos(rs.getInt("QntItens"));
                venda.setVlrTotal(rs.getDouble("VlrTotalVenda"));
                listaVendas.add(venda);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar vendas: " + e.getMessage());
        }
        return listaVendas;
    }

    // Listar Venda
    /**
     * @param NumVenda - int com o número da venda
     * @return Um ArrayList do tipo RelatorioAnalitico com os itens da venda
     */
    public static ArrayList<RelatorioAnalitico> buscarItensVenda(int NumVenda) {
        ArrayList<RelatorioAnalitico> listaItensVenda = new ArrayList<>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "SELECT * FROM ItensVenda WHERE NumVenda = ?";

            instrucaoSQL = conexao.prepareStatement(query);
            instrucaoSQL.setInt(1, NumVenda);

            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                RelatorioAnalitico itemVenda = new RelatorioAnalitico();
                itemVenda.setNumItem(rs.getInt("NumItem"));
                itemVenda.setProduto(rs.getString("Produto"));
                itemVenda.setVlrUnitario(rs.getDouble("VlrUnitario"));
                itemVenda.setQtdVendida(rs.getInt("QntVendida"));
                itemVenda.setVlrTotal(rs.getDouble("VlrTotalProd"));
                listaItensVenda.add(itemVenda);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar itens da venda: " + e.getMessage());
        }
        return listaItensVenda;
    }
}
