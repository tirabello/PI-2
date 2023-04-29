/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi2.dao;

import com.mycompany.projetopi2.models.Cliente;
import com.mycompany.projetopi2.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ldss1
 */
public class ClienteDAO {

  private static boolean status = false;
  private static Connection conexao = null;
  private static PreparedStatement instrucaoSQL = null;
  private static String query;

  // Adicionar Cliente
  public static boolean adicionarCliente(Cliente objCli) {
    try {
      conexao = GerenciadorConexao.abrirConexao();

      query =
        "INSERT INTO cliente ( Nome, Sexo, DataNascimento, EstadoCivil, CPF, Telefone, Email, Endereco ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

      instrucaoSQL = conexao.prepareStatement(query);

      instrucaoSQL.setString(1, objCli.getNome());
      instrucaoSQL.setString(2, objCli.getSexo());
      instrucaoSQL.setDate(
        3,
        new java.sql.Date(objCli.getDataNascimento().getTime())
      );
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

      query =
        "UPDATE cliente SET Nome = ?, Sexo = ?, DataNascimento = ?, EstadoCivil = ?, CPF = ?, Telefone = ?, Email = ?, Endereco = ? WHERE IDCliente = ?";

      instrucaoSQL = conexao.prepareStatement(query);

      instrucaoSQL.setString(1, objCli.getNome());
      instrucaoSQL.setString(2, objCli.getSexo());
      instrucaoSQL.setDate(
        3,
        new java.sql.Date(objCli.getDataNascimento().getTime())
      );
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

  // Listar Cliente
  public static ArrayList<Cliente> listarClientes() {
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    try {
      conexao = GerenciadorConexao.abrirConexao();

      query = "SELECT * FROM cliente";

      instrucaoSQL = conexao.prepareStatement(query);

      ResultSet rs = instrucaoSQL.executeQuery();

      if (rs != null) {
        while (rs.next()) {
          Cliente objCli = new Cliente();
          objCli.setId_cliente(rs.getInt("IDCliente"));
          objCli.setNome(rs.getString("Nome"));
          objCli.setSexo(rs.getString("Sexo"));
          objCli.setDataNascimento(rs.getDate("DataNascimento"));
          objCli.setEstadoCivil(rs.getString("EstadoCivil"));
          objCli.setCpf(rs.getString("CPF"));
          objCli.setTelefone(rs.getString("Telefone"));
          objCli.setEmail(rs.getString("Email"));
          objCli.setEndereco(rs.getString("Endereco"));

          listaClientes.add(objCli);
        }
      }
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return listaClientes;
  }

  // Excluir Cliente
  public static boolean removerCliente(int idCliente) {
    try {
      conexao = GerenciadorConexao.abrirConexao();

      query = "DELETE FROM cliente WHERE IDCliente = ?";
      instrucaoSQL = conexao.prepareStatement(query);

      instrucaoSQL.setInt(1, idCliente);

      int linhasAfetadas = instrucaoSQL.executeUpdate();

      if (linhasAfetadas > 0) {
        status = true;
      }
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    return status;
  }

  // Buscar Cliente por CPF / NOME

  public static ArrayList<Cliente> buscarCliente(String busca) {
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    try {
      conexao = GerenciadorConexao.abrirConexao();

      query = "SELECT * FROM cliente WHERE Nome LIKE ? OR CPF LIKE ?";

      instrucaoSQL = conexao.prepareStatement(query);

      instrucaoSQL.setString(1, "%" + busca + "%");
      instrucaoSQL.setString(2, "%" + busca + "%");

      ResultSet rs = instrucaoSQL.executeQuery();

      if (rs != null) {
        while (rs.next()) {
          Cliente objCli = new Cliente();
          objCli.setId_cliente(rs.getInt("IDCliente"));
          objCli.setNome(rs.getString("Nome"));
          objCli.setSexo(rs.getString("Sexo"));
          objCli.setDataNascimento(rs.getDate("DataNascimento"));
          objCli.setEstadoCivil(rs.getString("EstadoCivil"));
          objCli.setCpf(rs.getString("CPF"));
          objCli.setTelefone(rs.getString("Telefone"));
          objCli.setEmail(rs.getString("Email"));
          objCli.setEndereco(rs.getString("Endereco"));

          listaClientes.add(objCli);
        }
      }
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return listaClientes;
  }
  // Buscar Cliente por CPF

  // Buscar Cliente por NOME

}
