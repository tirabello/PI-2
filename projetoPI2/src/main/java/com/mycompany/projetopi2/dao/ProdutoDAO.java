/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mycompany.projetopi2.models.Produto;
import com.mycompany.projetopi2.utils.GerenciadorConexao;

/**
 *
 * @author ldss1
 */
public class ProdutoDAO {

	private static boolean status = false;
	private static Connection conexao = null;
	private static PreparedStatement instrucaoSQL = null;
	private static String query;

	// Adicionar Produto
	public static Boolean inserir(Produto novoProduto) {

		try {

			conexao = GerenciadorConexao.abrirConexao();
			query = "INSERT INTO Produto (Nome, CodProduto, Valor, Categoria, UnidadeVenda, Quantidade, Descricao) VALUES (?, ?, ?, ?, ?, ?, ?)";

			instrucaoSQL = conexao.prepareStatement(query);

			instrucaoSQL.setString(1, novoProduto.getNome());
			instrucaoSQL.setString(2, novoProduto.getCodProduto());
			instrucaoSQL.setDouble(3, novoProduto.getValor());
			instrucaoSQL.setString(4, novoProduto.getCategoria());
			instrucaoSQL.setString(5, novoProduto.getUnidadeVenda());
			instrucaoSQL.setInt(6, novoProduto.getQuantidade());
			instrucaoSQL.setString(7, novoProduto.getDescricao());

			int linhasAfetadas = instrucaoSQL.executeUpdate();

			if (linhasAfetadas > 0) {
				status = true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	// Editar Produto
	// Excluir Produto
	// Buscar Produto
	// Listar Produto
    
}
