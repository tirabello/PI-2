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
 * @see com.mycompany.projetopi2.models.Produto
 * @see com.mycompany.projetopi2.utils.GerenciadorConexao
 * 
 */
public class ProdutoDAO {

	private static boolean status = false;
	private static Connection conexao = null;
	private static PreparedStatement instrucaoSQL = null;
	private static String query;

	// Adicionar Produto

    /**
     *
     * @param novoProduto - Objeto Produto com os dados a serem inseridos
     * @return Boolean - true: sucesso , false:falha
     */
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

    /**
     *
     * @return ArrayList com todos os produtos cadastrados
     */
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

    /**
     *
     * @param codProduto - String com o código do produto
     * @return String com a descrição do produto
     */

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

    /**
     *
     * @param categoria - String com a categoria do produto
     * @return ArrayList com os produtos da categoria informada
     */
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

    /**
     *
     * @param busca - String com o nome do produto a ser pesquisado
     * @return ArrayList com os produtos que contém a String informada
     */
    public static ArrayList<Produto> pesquisarPorNome(String busca) {

		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "SELECT * FROM Produto WHERE Nome LIKE ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setString(1, "%" + busca + "%");
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

    /**
     *
     * @param busca - String com o nome do produto a ser pesquisado
     * @param categoria - String com a categoria do produto a ser pesquisado
     * @return ArrayList com os produtos que contém a String informada e que pertencem a categoria informada
     */
    public static ArrayList<Produto> pesquisarPorNomeECategoria(String busca, String categoria) {
	
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "SELECT * FROM Produto WHERE Nome LIKE ? AND Categoria = ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setString(1, "%" + busca + "%");
			instrucaoSQL.setString(2, categoria);
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

    /**
     *
     * @param codigo - String com o código do produto a ser pesquisado
     * @return Boolean false se falhar e true se for bem sucedido
	 */
    public static boolean removerProduto(String codigo) {

		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "DELETE FROM Produto WHERE CodProduto = ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setString(1, codigo);
			
			int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                status = true;
            }
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return status;

	}

    /**
     *
     * @param objPro - Objeto do tipo Produto a ser atualizado
     * @param codOriginal - String com o código original do produto a ser atualizado
     * @return Boolean false se falhar e true se for bem sucedido
     */
    public static Boolean atualizar(Produto objPro, String codOriginal) {
		try {
			conexao = GerenciadorConexao.abrirConexao();

			query = "UPDATE Produto SET Nome = ?, CodProduto = ?, Valor = ?, Categoria = ?, UnidadeVenda = ?, Quantidade = ?, Descricao = ? WHERE CodProduto = ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setString(1, objPro.getNome());
			instrucaoSQL.setString(2, objPro.getCodProduto());
			instrucaoSQL.setDouble(3, objPro.getValor());
			instrucaoSQL.setString(4, objPro.getCategoria());
			instrucaoSQL.setString(5, objPro.getUnidadeVenda());
			instrucaoSQL.setInt(6, objPro.getQuantidade());
			instrucaoSQL.setString(7, objPro.getDescricao());
			instrucaoSQL.setString(8, codOriginal);
			
			int linhasAfetadas = instrucaoSQL.executeUpdate();

			if (linhasAfetadas > 0) {
				status = true;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return status;
	}

    /**
     *
     * @param codProduto - String com o código do produto a ser pesquisado
     * @return Objeto do tipo Produto
     */
    public Produto consultarProduto(int codProduto) {
		Produto produto = new Produto();
		try {
			conexao = GerenciadorConexao.abrirConexao();
			query = "SELECT * FROM Produto WHERE CodProduto = ?";
			instrucaoSQL = conexao.prepareStatement(query);
			instrucaoSQL.setInt(1, codProduto);
			ResultSet rs = instrucaoSQL.executeQuery();

			while (rs.next()) {
				produto.setNome(rs.getString("Nome"));
				produto.setCodProduto(rs.getString("CodProduto"));
				produto.setValor(rs.getDouble("Valor"));
				produto.setCategoria(rs.getString("Categoria"));
				produto.setUnidadeVenda(rs.getString("UnidadeVenda"));
				produto.setQuantidade(rs.getInt("Quantidade"));
				produto.setDescricao(rs.getString("Descricao"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

		return produto;
	}
    
}
