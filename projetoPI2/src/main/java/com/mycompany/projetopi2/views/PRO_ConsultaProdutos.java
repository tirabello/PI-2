/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi2.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mycompany.projetopi2.dao.ProdutoDAO;
import com.mycompany.projetopi2.models.Produto;

/**
 *
 * @author joser
 */
public class PRO_ConsultaProdutos extends javax.swing.JFrame {

    public PRO_ConsultaProdutos() {
        initComponents();
        btn_AdicionarProduto.requestFocus();
        carregarProdutos(ProdutoDAO.listarProdutos());
    }

    private static void carregarProdutos(ArrayList<Produto> produtos) {

        DefaultTableModel modelo = (DefaultTableModel) tbl_ConsultaProduto.getModel();

        modelo.setNumRows(0);

        for (Produto produto : produtos) {
            modelo.addRow(new String[]{
                produto.getCodProduto(),
                produto.getNome(),
                produto.getCategoria(),
                produto.getUnidadeVenda(),
                Double.toString(produto.getValor()),
                Integer.toString(produto.getQuantidade())
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaProduto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_Pesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbx_Categoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_AdicionarProduto = new javax.swing.JButton();
        btn_RemoverProduto = new javax.swing.JButton();
        btn_EditarProduto = new javax.swing.JButton();
        pnl_Descricao = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Descricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Produto");
        setAlwaysOnTop(true);

        tbl_ConsultaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD.", "NOME", "CATEGORIA", "TIPO", "VALOR", "QTD ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ConsultaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ConsultaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ConsultaProduto);
        if (tbl_ConsultaProduto.getColumnModel().getColumnCount() > 0) {
            tbl_ConsultaProduto.getColumnModel().getColumn(0).setResizable(false);
            tbl_ConsultaProduto.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbl_ConsultaProduto.getColumnModel().getColumn(1).setResizable(false);
            tbl_ConsultaProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txt_Pesquisar.setForeground(new java.awt.Color(153, 153, 153));
        txt_Pesquisar.setText("Informe o nome do produto");
        txt_Pesquisar.setToolTipText("");
        txt_Pesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_PesquisarFocusLost(evt);
            }
        });
        txt_Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PesquisarKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673694_ic_fluent_search_filled_icon.png"))); // NOI18N

        cbx_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Medicamento", "Higiene", "Cosméticos", "Acessórios", "Suplementos e Vitaminicos" }));
        cbx_Categoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_CategoriaItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CATEGORIA:");

        btn_AdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8672681_ic_fluent_box_filled_icon.png"))); // NOI18N
        btn_AdicionarProduto.setToolTipText("Adicionar Produto");
        btn_AdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarProdutoActionPerformed(evt);
            }
        });

        btn_RemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8672940_ic_fluent_box_dismiss_filled_icon.png"))); // NOI18N
        btn_RemoverProduto.setToolTipText("Remover Produto");
        btn_RemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverProdutoActionPerformed(evt);
            }
        });

        btn_EditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8672904_ic_fluent_box_edit_filled_icon.png"))); // NOI18N
        btn_EditarProduto.setToolTipText("Editar Produto");
        btn_EditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbx_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_RemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_EditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_RemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_AdicionarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_Categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Pesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pnl_Descricao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txt_Descricao.setEditable(false);
        txt_Descricao.setColumns(20);
        txt_Descricao.setRows(5);
        jScrollPane2.setViewportView(txt_Descricao);

        javax.swing.GroupLayout pnl_DescricaoLayout = new javax.swing.GroupLayout(pnl_Descricao);
        pnl_Descricao.setLayout(pnl_DescricaoLayout);
        pnl_DescricaoLayout.setHorizontalGroup(
            pnl_DescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        pnl_DescricaoLayout.setVerticalGroup(
            pnl_DescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarProdutoActionPerformed
        PRO_AdicionarProdutos proAdd = new PRO_AdicionarProdutos();
        proAdd.setVisible(true);
        proAdd.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_AdicionarProdutoActionPerformed

    private void tbl_ConsultaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ConsultaProdutoMouseClicked
        exibirDescricao();
        if (evt.getClickCount() == 2) {
            editarProduto();
        }
    }//GEN-LAST:event_tbl_ConsultaProdutoMouseClicked

    private void cbx_CategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_CategoriaItemStateChanged

        String categoria = cbx_Categoria.getSelectedItem().toString();

        if (categoria.equals("Todas")) {
            carregarProdutos(ProdutoDAO.listarProdutos());
        } else {
            ArrayList<Produto> listaProdutos = ProdutoDAO.pesquisarPorCategoria(categoria);
            carregarProdutos(listaProdutos);
        }
    }//GEN-LAST:event_cbx_CategoriaItemStateChanged

    private void txt_PesquisarKeyTyped(java.awt.event.KeyEvent evt) {
        String busca = txt_Pesquisar.getText();
        String categoria = cbx_Categoria.getSelectedItem().toString();

        if (categoria.equals("Todas")) {
            ArrayList<Produto> listaProdutos = ProdutoDAO.pesquisarPorNome(busca);
            carregarProdutos(listaProdutos);
        } else {
            ArrayList<Produto> listaProdutos = ProdutoDAO.pesquisarPorNomeECategoria(busca, categoria);
            carregarProdutos(listaProdutos);
        }

    }

    private void btn_RemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverProdutoActionPerformed
        int linha = tbl_ConsultaProduto.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para remover!");
        } else {
            String codigo = tbl_ConsultaProduto.getValueAt(linha, 0).toString();
            String nome = tbl_ConsultaProduto.getValueAt(linha, 1).toString();

            int opcao = JOptionPane.showConfirmDialog(this, "Deseja remover o produto " + nome + "?");

            if (opcao == 0) {
                boolean sucesso = ProdutoDAO.removerProduto(codigo);
                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
                    carregarProdutos(ProdutoDAO.listarProdutos());
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao remover produto!");
                }
            }
        }

    }//GEN-LAST:event_btn_RemoverProdutoActionPerformed

    private void btn_EditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarProdutoActionPerformed
        editarProduto();
    }//GEN-LAST:event_btn_EditarProdutoActionPerformed

    private void txt_PesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PesquisarFocusGained
        if (txt_Pesquisar.getText().equals("Informe o nome do produto")) {
            txt_Pesquisar.setText("");
            txt_Pesquisar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_PesquisarFocusGained

    private void txt_PesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PesquisarFocusLost
        if (txt_Pesquisar.getText().equals("")) {
            txt_Pesquisar.setText("Informe o nome do produto");
            txt_Pesquisar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_PesquisarFocusLost

    private void exibirDescricao() {

        int linha = tbl_ConsultaProduto.getSelectedRow();
        String codigo = tbl_ConsultaProduto.getValueAt(linha, 0).toString();

        String descricao = ProdutoDAO.exibirDescricao(codigo);

        txt_Descricao.setText(descricao);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRO_ConsultaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdicionarProduto;
    private javax.swing.JButton btn_EditarProduto;
    private javax.swing.JButton btn_RemoverProduto;
    private javax.swing.JComboBox<String> cbx_Categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl_Descricao;
    private static javax.swing.JTable tbl_ConsultaProduto;
    private javax.swing.JTextArea txt_Descricao;
    private javax.swing.JTextField txt_Pesquisar;
    // End of variables declaration//GEN-END:variables

    public static void atualizarTabela() {
        carregarProdutos(ProdutoDAO.listarProdutos());
    }

    private void editarProduto() {
        int linhaSelecionada = tbl_ConsultaProduto.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");
            return;
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tbl_ConsultaProduto.getModel();

            String codigo = modelo.getValueAt(linhaSelecionada, 0).toString();
            String nome = modelo.getValueAt(linhaSelecionada, 1).toString();
            String categoria = modelo.getValueAt(linhaSelecionada, 2).toString();
            String tipo = modelo.getValueAt(linhaSelecionada, 3).toString();
            String preco = modelo.getValueAt(linhaSelecionada, 4).toString();
            String quantidade = modelo.getValueAt(linhaSelecionada, 5).toString();
            String descricao = txt_Descricao.getText();

            Produto objPro = new Produto(nome, codigo, Double.parseDouble(preco), categoria, tipo, Integer.parseInt(quantidade), descricao);
            PRO_AdicionarProdutos proAdd = new PRO_AdicionarProdutos(objPro);
            proAdd.setVisible(true);
            proAdd.setLocationRelativeTo(null);
        }
    }
}
