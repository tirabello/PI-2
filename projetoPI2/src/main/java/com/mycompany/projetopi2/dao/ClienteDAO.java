/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.mycompany.projetopi2.models.Cliente;
import com.mycompany.projetopi2.utils.GerenciadorConexao;

/**
 *
 * @author ldss1
 */
public class ClienteDAO {

	private static boolean status = false;
	private static Connection conexao = null;
	private static PreparedStatement instrucaoSQL = null;


	// Adicionar Cliente
	public static boolean adicionarCliente(Cliente objCli) {
		try {
			conexao = GerenciadorConexao.abrirConexao();

			String query = "INSERT INTO cliente ( Nome, Sexo, DataNascimento, EstadoCivil, CPF, Telefone, Email, Endereco ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";


			instrucaoSQL = conexao.prepareStatement(query);

			instrucaoSQL.setString(1, objCli.getNome());
			instrucaoSQL.setString(2, objCli.getSexo());
			instrucaoSQL.setDate(3, new java.sql.Date(objCli.getDataNascimento().getTime()));
			instrucaoSQL.setString(4, objCli.getEstadoCivil());
			instrucaoSQL.setString(5, objCli.getCpf());
			instrucaoSQL.setString(6, objCli.getTelefone());
			instrucaoSQL.setString(7, objCli.getEmail());
			instrucaoSQL.setString(8, objCli.getEndereco());


			int linhasAfetadas = instrucaoSQL.executeUpdate();

			if (linhasAfetadas > 0) {
				status = true;
			} else {
				status = false;
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
	// Editar Cliente

	public static boolean atualizarCliente(Cliente objCli) {
		try {
			conexao = GerenciadorConexao.abrirConexao();

			String query = "UPDATE cliente SET Nome = ?, Sexo = ?, DataNascimento = ?, EstadoCivil = ?, CPF = ?, Telefone = ?, Email = ?, Endereco = ? WHERE id_cliente = ?";

			instrucaoSQL = conexao.prepareStatement(query);

			instrucaoSQL.setString(1, objCli.getNome());
			instrucaoSQL.setString(2, objCli.getSexo());
			instrucaoSQL.setDate(3, new java.sql.Date(objCli.getDataNascimento().getTime()));
			instrucaoSQL.setString(4, objCli.getEstadoCivil());
			instrucaoSQL.setString(5, objCli.getCpf());
			instrucaoSQL.setString(6, objCli.getTelefone());
			instrucaoSQL.setString(7, objCli.getEmail());
			instrucaoSQL.setString(8, objCli.getEndereco());
			instrucaoSQL.setInt(9, objCli.getId_cliente());

			instrucaoSQL.executeUpdate();

			status = true;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                return status;
	}


	// Excluir Cliente
	// Buscar Cliente
	// Listar Cliente

    
}
