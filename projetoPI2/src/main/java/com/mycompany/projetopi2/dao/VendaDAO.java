/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mycompany.projetopi2.models.Venda;
import com.mycompany.projetopi2.models.ItemVenda;
import com.mycompany.projetopi2.utils.GerenciadorConexao;

/**
 *
 * @author ldss1
 */
public class PedidoDAO {

    private static boolean status = false;
    private static Connection conexao = null;
    private static PreparedStatement instrucaoSQL = null;
    private static String query;

    public static boolean salvarPedido(Venda venda) {

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "INSERT INTO Pedido (fk_IDCliente, DataHora, QntItens, ValorTotal) VALUES (?, ?, ?, ?)";

            instrucaoSQL = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setInt(1, venda.getIdCliente());
            instrucaoSQL.setDate(2, java.sql.Date.valueOf(venda.getDataHora().toLocalDate()));
            instrucaoSQL.setInt(3, venda.getQntItens());
            instrucaoSQL.setDouble(4, venda.getValorTotal());

            instrucaoSQL.executeUpdate();

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                ResultSet rs = instrucaoSQL.getGeneratedKeys();

                if (rs.next()) {
                    int idVenda = rs.getInt(1);
                    System.out.println("ID Venda: " + idVenda);

                    // fOR EACH
                    query = "INSERT INTO ItemPedido (fk_IDPedido, NumItem, fk_IDProduto, ValorUnitario, Quantidade) VALUES (?, ?, ?, ?, ?)";

                    for (ItemVenda item : venda.getListaProdutos()) {

                        instrucaoSQL = conexao.prepareStatement(query);

                        instrucaoSQL.setInt(1, idVenda);
                        instrucaoSQL.setInt(2, item.getNumItem());

                        instrucaoSQL.setInt(3, item.getIdProduto());
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

    // Adicionar Venda
    // Buscar Venda
    // Listar Venda
}
