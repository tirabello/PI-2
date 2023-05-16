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

import com.mycompany.projetopi2.models.Venda;
import com.mycompany.projetopi2.models.ItemVenda;
import com.mycompany.projetopi2.utils.GerenciadorConexao;

/**
 *
 * @author ldss1
 */
public class VendaDAO {

    private static boolean status = false;
    private static Connection conexao = null;
    private static PreparedStatement instrucaoSQL = null;
    private static String query;

    // Adicionar Venda (Finalizar Venda)
    public static boolean finalizarVenda(Venda venda) {

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "INSERT INTO Venda (IDCliente, DataHora, QntItens, VlrTotal) VALUES (?, ?, ?, ?)";

            instrucaoSQL = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setInt(1, venda.getIdCliente());
            instrucaoSQL.setDate(2, java.sql.Date.valueOf(venda.getDataHora().toLocalDate()));
            instrucaoSQL.setInt(3, venda.getQntItens());
            instrucaoSQL.setDouble(4, venda.getValorTotal());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                ResultSet rs = instrucaoSQL.getGeneratedKeys();

                if (rs.next()) {
                    int codProduto = rs.getInt(1);

                    // fOR EACH
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
            
            status = true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar venda: " + e.getMessage());
        }
        return status;
    }

    
    // Buscar Venda por período (em Dias)
	public static ArrayList<Venda> buscarVendas(int dia) {
        ArrayList<Venda> listaVendas = new ArrayList<>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "SELECT * FROM Venda WHERE DataHora BETWEEN DATE_SUB(NOW(), INTERVAL ? DAY) AND NOW()";

            instrucaoSQL = conexao.prepareStatement(query);
            instrucaoSQL.setInt(1, (dia + 1 ));

            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();

                venda.setIdVenda(rs.getInt("IDVenda"));
                venda.setIdCliente(rs.getInt("IDCliente"));
                venda.setQntItens(rs.getInt("QntItens"));
                venda.setValorTotal(rs.getDouble("VlrTotal"));
                venda.setDataHora(rs.getTimestamp("DataHora").toLocalDateTime());

                listaVendas.add(venda);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao buscar vendas: " + e.getMessage());
        }
        
        return listaVendas;
    }
    
    
    
    // Buscar Venda por período (Data Inicial e Data Final)
    public static ArrayList<Venda> buscarVendas(Date dataInicial, Date dataFinal) {
        ArrayList<Venda> listaVendas = new ArrayList<>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "SELECT * FROM Venda WHERE DataHora BETWEEN ? AND ?";

            instrucaoSQL = conexao.prepareStatement(query);
            instrucaoSQL.setDate(1, java.sql.Date.valueOf(dataInicial.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()));
            instrucaoSQL.setDate(2, java.sql.Date.valueOf(dataFinal.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()));

            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();

                venda.setIdVenda(rs.getInt("IDVenda"));
                venda.setIdCliente(rs.getInt("IDCliente"));
                venda.setQntItens(rs.getInt("QntItens"));
                venda.setValorTotal(rs.getDouble("VlrTotal"));
                venda.setDataHora(rs.getTimestamp("DataHora").toLocalDateTime());

                listaVendas.add(venda);
            }

        } catch (Exception e){
            System.out.println("Erro ao buscar vendas: " + e.getMessage());
        }
        return listaVendas;
	}
    
    // Listar Venda
	public static ArrayList<ItemVenda> buscarItensVenda(int idVenda) {
        ArrayList<ItemVenda> listaItensVenda = new ArrayList<>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "SELECT * FROM ItemVenda WHERE IDVenda = ?";

            instrucaoSQL = conexao.prepareStatement(query);
            instrucaoSQL.setInt(1, idVenda);

            ResultSet rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                ItemVenda itemVenda = new ItemVenda();

                itemVenda.setNumItem(rs.getInt("NumItem"));
                itemVenda.setCodProduto(rs.getInt("CodProduto"));
                itemVenda.setVlrUnitario(rs.getDouble("VlrUnitario"));
                itemVenda.setQntProduto(rs.getInt("Quantidade"));

                listaItensVenda.add(itemVenda);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar itens da venda: " + e.getMessage());
        }
        return listaItensVenda;
	}
}
