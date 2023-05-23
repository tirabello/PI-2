/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi2.views;

import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mycompany.projetopi2.dao.ClienteDAO;
import com.mycompany.projetopi2.models.Cliente;

/**
 *
 * @author tiago.rbraz
 */
public class CLI_ConsultaClientes extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaClientes
     */
    TelaInicial objTelaInicial;
    private boolean selecionado = false;

    /**
     *
     */
    public CLI_ConsultaClientes() {
        initComponents();
        btn_Selecionado.setVisible(false);
        ImageIcon icone = new ImageIcon(getClass().getResource("/8673477_ic_fluent_people_search_filled_icon.png"));
        this.setIconImage(icone.getImage());
        carregarClientes();
        btn_AdicionarCliente.requestFocus();
    }
    
    public CLI_ConsultaClientes(TelaInicial objTela) {
        initComponents();
        ImageIcon icone = new ImageIcon(getClass().getResource("/8673477_ic_fluent_people_search_filled_icon.png"));
        this.setIconImage(icone.getImage());
        btn_Selecionado.setVisible(true);
        btn_Selecionado.requestFocus();
        carregarClientes();
        this.objTelaInicial = objTela;
        selecionado = true;

    }

    public static void carregarClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.listarClientes();
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);

        for (Cliente cliente : clientes) {
            modelo.addRow(
                    new String[]{
                        String.valueOf(cliente.getId_cliente()),
                        String.valueOf(cliente.getNome()),
                        String.valueOf(cliente.getSexo()),
                        String.valueOf(cliente.getDataNascimento()),
                        String.valueOf(cliente.getEstadoCivil()),
                        String.valueOf(cliente.getCpf()),
                        String.valueOf(cliente.getTelefone()),
                        String.valueOf(cliente.getEndereco()),
                        String.valueOf(cliente.getEmail()),}
            );
        }
    }

    public void editarCliente() {
        int linhaSelecionada = tblClientes.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
            return;
        } else {
            int id = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
            String nome = modelo.getValueAt(linhaSelecionada, 1).toString();
            String sexo = modelo.getValueAt(linhaSelecionada, 2).toString();
            Date dataNascimento = Date.valueOf(modelo.getValueAt(linhaSelecionada, 3).toString());
            String estadoCivil = modelo.getValueAt(linhaSelecionada, 4).toString();
            String cpf = modelo.getValueAt(linhaSelecionada, 5).toString();
            String telefone = modelo.getValueAt(linhaSelecionada, 6).toString();
            String endereco = modelo.getValueAt(linhaSelecionada, 7).toString();
            String email = modelo.getValueAt(linhaSelecionada, 8).toString();

            Cliente objCli = new Cliente(id, nome, sexo, dataNascimento, estadoCivil, cpf, telefone, email, endereco);

            CLI_AdicionarCliente editarCliente = new CLI_AdicionarCliente(objCli);
            editarCliente.setVisible(true);
            editarCliente.setLocationRelativeTo(null);
            editarCliente.setAlwaysOnTop(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txt_BuscarCliente = new javax.swing.JTextField();
        btn_AdicionarCliente = new javax.swing.JButton();
        btn_RemoverClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Selecionado = new javax.swing.JButton();
        btn_EditarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Cliente");
        setAlwaysOnTop(true);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "SEXO", "DATA NASCIMENTO", "ESTADO CIVIL", "CPF", "TELEFONE", "ENDEREÇO", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.getTableHeader().setReorderingAllowed(false);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setResizable(false);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(2);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(15);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(15);
        }

        txt_BuscarCliente.setForeground(new java.awt.Color(153, 153, 153));
        txt_BuscarCliente.setText("Digite o CPF ou Informe o Nome do Cliente");
        txt_BuscarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_BuscarClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_BuscarClienteFocusLost(evt);
            }
        });
        txt_BuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarClienteKeyTyped(evt);
            }
        });

        btn_AdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673597_ic_fluent_person_add_filled_icon.png"))); // NOI18N
        btn_AdicionarCliente.setToolTipText("Adicionar Cliente");
        btn_AdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarClienteActionPerformed(evt);
            }
        });

        btn_RemoverClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673507_ic_fluent_person_delete_filled_icon.png"))); // NOI18N
        btn_RemoverClientes.setToolTipText("Remover Cliente");
        btn_RemoverClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverClientesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673694_ic_fluent_search_filled_icon.png"))); // NOI18N

        btn_Selecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673492_ic_fluent_person_available_filled_icon.png"))); // NOI18N
        btn_Selecionado.setToolTipText("Selecionar Cliente");
        btn_Selecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelecionadoActionPerformed(evt);
            }
        });

        btn_EditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673546_ic_fluent_person_edit_filled_icon.png"))); // NOI18N
        btn_EditarCliente.setToolTipText("Editar Cliente");
        btn_EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_RemoverClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Selecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_RemoverClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Selecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addComponent(txt_BuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            if (selecionado == false) {
                editarCliente();
            } else {
                selecionarCliente();
            }
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void selecionarCliente() {
        int linhaSelecionada = tblClientes.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();

        if (linhaSelecionada >= 0) {

            Cliente obj = new Cliente();

            int id = Integer.parseInt(
                    tblClientes.getValueAt(linhaSelecionada, 0).toString()
            );
            String nome = tblClientes.getValueAt(linhaSelecionada, 1).toString();
            String cpf = tblClientes.getValueAt(linhaSelecionada, 5).toString();

            obj.setId_cliente(id);
            obj.setNome(nome);
            obj.setCpf(cpf);

            objTelaInicial.atualizarObjCliente(obj);

            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btn_SelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelecionadoActionPerformed
        selecionarCliente();
    }//GEN-LAST:event_btn_SelecionadoActionPerformed

    private void btn_EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarClienteActionPerformed
        editarCliente();
    }//GEN-LAST:event_btn_EditarClienteActionPerformed

    private void txt_BuscarClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarClienteFocusGained
        if (txt_BuscarCliente.getText().equals("Digite o CPF ou Informe o Nome do Cliente")) {
            txt_BuscarCliente.setText("");
            txt_BuscarCliente.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_BuscarClienteFocusGained

    private void txt_BuscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarClienteFocusLost
        if (txt_BuscarCliente.getText().equals("")) {
            txt_BuscarCliente.setText("Digite o CPF ou Informe o Nome do Cliente");
            txt_BuscarCliente.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txt_BuscarClienteFocusLost

    private void btn_AdicionarClienteActionPerformed(
            java.awt.event.ActionEvent evt
    ) {
        CLI_AdicionarCliente nCli = new CLI_AdicionarCliente();
        nCli.setVisible(true);
        nCli.setLocationRelativeTo(null);
        nCli.setAlwaysOnTop(true);
    }

    private void btn_RemoverClientesActionPerformed(
            java.awt.event.ActionEvent evt
    ) { // GEN-FIRST:event_btn_RemoverClientesActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = tblClientes.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();

        // Remover do banco
        int idCliente = Integer.parseInt(
                tblClientes.getValueAt(linhaSelecionada, 0).toString()
        );

        boolean removido = ClienteDAO.removerCliente(idCliente);

        if (removido) {
            // Remover da tabela
            model.removeRow(linhaSelecionada);
            JOptionPane.showMessageDialog(
                    this,
                    "Cliente removido com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Não foi possível remover o cliente",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    } // GEN-LAST:event_btn_RemoverClientesActionPerformed

    private void txt_BuscarClienteKeyTyped(java.awt.event.KeyEvent evt) { // GEN-FIRST:event_txt_BuscarClienteKeyTyped
        // TODO add your handling code here:

        String nome = txt_BuscarCliente.getText();
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);

        ArrayList<Cliente> clientes = ClienteDAO.buscarCliente(nome);

        for (Cliente cliente : clientes) {
            modelo.addRow(
                    new String[]{
                        String.valueOf(cliente.getId_cliente()),
                        String.valueOf(cliente.getNome()),
                        String.valueOf(cliente.getSexo()),
                        String.valueOf(cliente.getDataNascimento()),
                        String.valueOf(cliente.getEstadoCivil()),
                        String.valueOf(cliente.getCpf()),
                        String.valueOf(cliente.getTelefone()),
                        String.valueOf(cliente.getEndereco()),
                        String.valueOf(cliente.getEmail()),}
            );
        }
    } // GEN-LAST:event_txt_BuscarClienteKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger
                    .getLogger(CLI_ConsultaClientes.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger
                    .getLogger(CLI_ConsultaClientes.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger
                    .getLogger(CLI_ConsultaClientes.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger
                    .getLogger(CLI_ConsultaClientes.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {
            public void run() {
                new CLI_ConsultaClientes().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdicionarCliente;
    private javax.swing.JButton btn_EditarCliente;
    private javax.swing.JButton btn_RemoverClientes;
    private javax.swing.JButton btn_Selecionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblClientes;
    private javax.swing.JTextField txt_BuscarCliente;
    // End of variables declaration//GEN-END:variables
}
