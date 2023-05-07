/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mycompany.projetopi2.models.Pedido;
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

	public static boolean salvarPedido(Pedido objPed) {
		
		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "INSERT INTO Pedido (fk_IDCliente, DataPedido, HoraPedido, Quantidade, ValorTotal) VALUES (?, ?, ?, ?, ?)";

			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setInt(1, objPed.getIdCliente());
			instrucaoSQL.setString(2, new java.sql.Date(objPed.getData().getTime()).toString());
			instrucaoSQL.setString(3, new java.sql.Time(objPed.getHora().getTime()).toString());
			instrucaoSQL.setInt(4, objPed.getQuantidade());
			instrucaoSQL.setDouble(5, objPed.getValorTotal());

			instrucaoSQL.executeUpdate();

			int linhasAfetadas = instrucaoSQL.executeUpdate();

			if (linhasAfetadas > 0){

				int IDVenda = instrucaoSQL.getGeneratedKeys().getInt(1);
				System.out.println("ID Venda: " + IDVenda);
				
				for (int i = 0; i < objPed.getListaProdutos().size(); i++) {
					query = "INSERT INTO ItemPedido (fk_IDPedido, NumItem, fk_IDProduto, Preco, Quantidade) VALUES (?, ?, ?, ?, ?)";
					instrucaoSQL = conexao.prepareStatement(query);

					instrucaoSQL.setInt(1, IDVenda);
					instrucaoSQL.setInt(2, i + 1);
					instrucaoSQL.setInt(3, objPed.getListaProdutos().get(i).getIdProduto());
					instrucaoSQL.setDouble(4, objPed.getListaProdutos().get(i).getValor());
					instrucaoSQL.setInt(5, objPed.getListaProdutos().get(i).getQuantidade());

					instrucaoSQL.executeUpdate();
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

	// Adicionar Pedido
	// Buscar Pedido
	// Listar Pedido
    
}
