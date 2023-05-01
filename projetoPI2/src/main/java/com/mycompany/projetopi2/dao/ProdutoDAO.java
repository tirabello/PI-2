/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public static ArrayList<Produto> listarProdutos() {
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "SELECT * FROM Produto";
			instrucaoSQL = conexao.prepareStatement(query);
			ResultSet rs = instrucaoSQL.executeQuery();


			while (rs.next()) {
				Produto produto = new Produto();
				produto.setNome(rs.getString("Nome"));
				produto.setCodProduto(rs.getString("CodProduto"));
				produto.setValor(rs.getDouble("Valor"));
				produto.setCategoria(rs.getString("Categoria"));
				produto.setUnidadeVenda(rs.getString("UnidadeVenda"));
				produto.setQuantidade(rs.getInt("Quantidade"));
				produto.setDescricao(rs.getString("Descricao"));

				listaProdutos.add(produto);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaProdutos;
	}

	// Exibir Descrição do Produto

	public static String exibirDescricao(String codProduto) {
		String descricao = null;
		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "SELECT Descricao FROM Produto WHERE CodProduto = ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setString(1, codProduto);
			ResultSet rs = instrucaoSQL.executeQuery();

			while (rs.next()) {
				descricao = rs.getString("Descricao");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return descricao;
	}

	public static ArrayList<Produto> pesquisarPorCategoria(String categoria) {
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "SELECT * FROM Produto WHERE Categoria = ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setString(1, categoria);
			ResultSet rs = instrucaoSQL.executeQuery();

			while (rs.next()) {
				Produto produto = new Produto();
				produto.setNome(rs.getString("Nome"));
				produto.setCodProduto(rs.getString("CodProduto"));
				produto.setValor(rs.getDouble("Valor"));
				produto.setCategoria(rs.getString("Categoria"));
				produto.setUnidadeVenda(rs.getString("UnidadeVenda"));
				produto.setQuantidade(rs.getInt("Quantidade"));
				produto.setDescricao(rs.getString("Descricao"));

				listaProdutos.add(produto);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return listaProdutos;
	}
    
}
