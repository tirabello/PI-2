/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mycompany.projetopi2.models.Venda;
import com.mycompany.projetopi2.models.Produto;
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

    public static boolean salvarPedido(Venda objPed) {

        try {
            conexao = GerenciadorConexao.abrirConexao();
            query = "INSERT INTO Pedido (fk_IDCliente, DataPedido, HoraPedido, Quantidade, ValorTotal) VALUES (?, ?, ?, ?, ?)";

            instrucaoSQL = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            instrucaoSQL.setInt(1, objPed.getIdCliente());
            instrucaoSQL.setDate(2, new java.sql.Date(objPed.getData().getTime()));
            instrucaoSQL.setTime(3, new java.sql.Time(objPed.getHora().getTime()));
            instrucaoSQL.setInt(4, objPed.getQntItens());
            instrucaoSQL.setDouble(5, objPed.getValorTotal());

            instrucaoSQL.executeUpdate();

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {

                ResultSet rs = instrucaoSQL.getGeneratedKeys();

                if (rs.next()) {
                    int idPedido = rs.getInt(1);
                    int IDVenda = rs.getInt(1);
                    System.out.println("ID Venda: " + IDVenda);

                    // fOR EACH
                    query = "INSERT INTO ItemPedido (fk_IDPedido, NumItem, fk_IDProduto, Preco, Quantidade) VALUES (?, ?, ?, ?, ?)";
                    int i = 0;
                    for (Produto item : objPed.getListaProdutos()) {

                        instrucaoSQL = conexao.prepareStatement(query);

                        instrucaoSQL.setInt(1, IDVenda);
                        instrucaoSQL.setInt(2, i++);

                        instrucaoSQL.setInt(3, item.getIdProduto());
                        instrucaoSQL.setDouble(4, item.getValor());
                        instrucaoSQL.setInt(5, item.getQuantidade());

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
