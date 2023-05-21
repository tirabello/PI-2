package com.mycompany.projetopi2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GerenciadorConexao {

    private static String status = "Não conectado...";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC";
    private static String usuario = "root";
    private static String senha = "m60a36";

    private static Connection conexao = null;

    // Abre a conexão com o banco de dados

    /**
     *
     * @return Connection - Objeto do tipo Connection
     * @throws ClassNotFoundException - caso a classe do driver não seja encontrada
     * @throws SQLException - caso ocorra algum erro na conexão
     */
    public static Connection abrirConexao()
            throws ClassNotFoundException, SQLException {
        // Verifica se a conexão existe

        if (conexao == null) {
            try {
                //Carrega a classe responsável pelo driver
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);

                if (conexao != null) {
                    status = "Conexão realizada com sucesso!";
                } else {
                    status = "Não foi possivel realizar a conexão";
                }
            } catch (ClassNotFoundException e) { //Driver não encontrado
                throw new ClassNotFoundException(
                        "O driver expecificado nao foi encontrado."
                );
            } catch (SQLException e) { //Erro ao estabelecer a conexão (Ex: login ou senha errados)
                //Outra falha de conexão
                throw new SQLException(
                        "Erro ao estabelecer a conexão (Ex: login ou senha errados)."
                );
            }
        } else {
            try {
                //Se a conexão estiver fechada, reabro a conexão
                if (conexao.isClosed()) {
                    conexao = DriverManager.getConnection(url, usuario, senha);
                }
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return conexao;
    }
}
