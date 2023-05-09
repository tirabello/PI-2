/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi2.views;

import com.mycompany.projetopi2.dao.PedidoDAO;
import com.mycompany.projetopi2.dao.ProdutoDAO;
import com.mycompany.projetopi2.models.Cliente;
import com.mycompany.projetopi2.models.Pedido;
import com.mycompany.projetopi2.models.Produto;

import java.awt.Color;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ldss1
 */
public class TelaInicial extends javax.swing.JFrame {

    Cliente objCli;
    private double valorTotal = 0;
    
    
    public TelaInicial() {
        initComponents();
    }

    
    // public TelaInicial(Cliente obj) {
    //     initComponents();
    //     this.objCli = obj;
        
    //     this.lbl_Cliente.setText(obj.getNome());
        
    // }
    
    // public void definirCliente(Cliente obj){
    //     this.objCli = obj;
        
    //     this.lbl_Cliente.setText(obj.getNome());
    // }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Produtos = new javax.swing.JTable();
        txt_BuscarProduto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Carrinho = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbl_ValorTotal = new javax.swing.JLabel();
        btn_FinalizarCompra = new javax.swing.JButton();
        btn_RemoverCarrinho = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        spn_QuantProduto = new javax.swing.JSpinner();
        btn_AdicionarCarrinho = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_SelecionarCliente = new javax.swing.JButton();
        lbl_Cliente = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lbl_CPF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FARMÁCIA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTO", "PRECO UNI", "DISPONIVEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Produtos);
        if (tbl_Produtos.getColumnModel().getColumnCount() > 0) {
            tbl_Produtos.getColumnModel().getColumn(0).setResizable(false);
            tbl_Produtos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_Produtos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 510, 320));

        txt_BuscarProduto.setText("Digite o nome do produto");
        txt_BuscarProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_BuscarProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_BuscarProdutoFocusLost(evt);
            }
        });
        txt_BuscarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarProdutoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_BuscarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 16, 407, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1211, 30, -1, 502));

        tbl_Carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTO", "PREÇO UNI", "QNT.", "PREÇO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Carrinho);
        if (tbl_Carrinho.getColumnModel().getColumnCount() > 0) {
            tbl_Carrinho.getColumnModel().getColumn(0).setResizable(false);
            tbl_Carrinho.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_Carrinho.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 130, 670, 260));

        jLabel2.setText("VALOR TOTAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 135, 36));

        lbl_ValorTotal.setText("R$ 000,00");
        jPanel1.add(lbl_ValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 71, -1));

        btn_FinalizarCompra.setText("FINALIZAR COMPRA");
        btn_FinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinalizarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btn_FinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 440, 170, 35));

        btn_RemoverCarrinho.setText("REMOVER");
        btn_RemoverCarrinho.setToolTipText("Remover Item do Carrinho");
        btn_RemoverCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverCarrinhoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_RemoverCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 100, 35));

        jLabel6.setText("QUANT:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 50, 22));

        spn_QuantProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel1.add(spn_QuantProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 60, 35));

        btn_AdicionarCarrinho.setText("ADICIONAR >>");
        btn_AdicionarCarrinho.setToolTipText("Colocar no carrinho");
        btn_AdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarCarrinhoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AdicionarCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 120, 35));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673694_ic_fluent_search_filled_icon.png"))); // NOI18N
        jLabel7.setAlignmentY(0.0F);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("INFO"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 510, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));

        btn_SelecionarCliente.setText("SELECIONAR CLIENTE");
        btn_SelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelecionarClienteActionPerformed(evt);
            }
        });

        lbl_Cliente.setText("NOME");

        lbl_ID.setText("ID");

        lbl_CPF.setText("CPF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_CPF)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cliente)
                            .addComponent(lbl_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(btn_SelecionarCliente)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_SelecionarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Cliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 460, 100));

        jLabel4.setText("CARRINHO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, 20));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673588_ic_fluent_people_team_filled_icon.png"))); // NOI18N
        jMenu1.setMnemonic('c');
        jMenu1.setText("CLIENTES");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673597_ic_fluent_person_add_filled_icon.png"))); // NOI18N
        jMenuItem1.setText("Add Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673477_ic_fluent_people_search_filled_icon.png"))); // NOI18N
        jMenuItem2.setText("Consultar Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6989154_pill_pharmacy_medicine_medical_painkiller_icon.png"))); // NOI18N
        jMenu2.setMnemonic('p');
        jMenu2.setText("PRODUTOS");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6549572_capsule_drug_medical_medication_medicine_icon.png"))); // NOI18N
        jMenuItem3.setText("Adicinar Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673694_ic_fluent_search_filled_icon.png"))); // NOI18N
        jMenuItem4.setText("Consultar Produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1564531_chart_business_graph_statistics_icon.png"))); // NOI18N
        jMenu3.setMnemonic('r');
        jMenu3.setText("RELATORIO");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Sintético");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CLI_ConsultaClientes cc = new CLI_ConsultaClientes();
        cc.setVisible(true);
        cc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        PRO_ConsultaProdutos cp = new PRO_ConsultaProdutos();
        cp.setVisible(true);
        cp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PRO_AdicionarProdutos proAdd = new PRO_AdicionarProdutos();
        proAdd.setVisible(true);
        proAdd.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CLI_AdicionarCliente cliAdd = new CLI_AdicionarCliente();
        cliAdd.setVisible(true);
        cliAdd.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        REL_SINTETICO relSin = new REL_SINTETICO();
        relSin.setVisible(true);
        relSin.setLocationRelativeTo(null);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void txt_BuscarProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarProdutoFocusLost
        if (txt_BuscarProduto.getText().equals("")) {
            txt_BuscarProduto.setText("Digite o nome do produto");
            txt_BuscarProduto.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txt_BuscarProdutoFocusLost

    private void txt_BuscarProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarProdutoFocusGained
        if (txt_BuscarProduto.getText().equals("Digite o nome do produto")) {
            txt_BuscarProduto.setText("");
            txt_BuscarProduto.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_BuscarProdutoFocusGained

    private void btn_RemoverCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverCarrinhoActionPerformed
        // limpa a tabela
        DefaultTableModel model = (DefaultTableModel) tbl_Carrinho.getModel();
        int[] rows = tbl_Carrinho.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
        
    }//GEN-LAST:event_btn_RemoverCarrinhoActionPerformed

    private void btn_FinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinalizarCompraActionPerformed
        // TODO VERIFICAR SE O CARRINHO ESTA VAZIO
        if(tbl_Carrinho.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Carrinho vazio!");
        } else if( lbl_ID.getText().equals("ID")){
            JOptionPane.showMessageDialog(this, "Selecione um cliente!", "Selecione um cliente!", JOptionPane.ERROR_MESSAGE);
        } else{
            
            Pedido objPed = new Pedido();
            objPed.setIdCliente(Integer.parseInt(lbl_ID.getText().toString()));
            objPed.setValorTotal(Double.parseDouble(lbl_ValorTotal.getText().toString()));
            objPed.setData(new Date());
            objPed.setHora(new Time(new Date().getTime()));
            objPed.setQuantidade(tbl_Carrinho.getRowCount());
            objPed.setValorTotal(Double.parseDouble(lbl_ValorTotal.getText().toString()));

            ArrayList<Produto> listaItem = new ArrayList<Produto>();

            for (int i = 0; i < tbl_Carrinho.getRowCount(); i++) {

                Produto objProd = new Produto();

                objProd.setIdProduto(Integer.parseInt(tbl_Carrinho.getValueAt(i, 0).toString()));
                objProd.setNome(tbl_Carrinho.getValueAt(i, 1).toString());
                objProd.setValor(Double.parseDouble(tbl_Carrinho.getValueAt(i, 2).toString()));
                objProd.setQuantidade(Integer.parseInt(tbl_Carrinho.getValueAt(i, 3).toString()));

                listaItem.add(objProd);
            }

            objPed.setListaProdutos(listaItem);


            // Salvar pedido no banco de dados
            boolean retorno = PedidoDAO.salvarPedido(objPed);

            if (retorno) {
                JOptionPane.showMessageDialog(this, "Pedido salvo com sucesso!", "Pedido salvo!", JOptionPane.INFORMATION_MESSAGE);
                // Limpar carrinho
                DefaultTableModel model = (DefaultTableModel) tbl_Carrinho.getModel();
                model.setRowCount(0);
                lbl_ValorTotal.setText("0.0");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar pedido!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }




        }
    }//GEN-LAST:event_btn_FinalizarCompraActionPerformed

    private void btn_SelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelecionarClienteActionPerformed
        // TODO add your handling code here:
        CLI_ConsultaClientes cli = new CLI_ConsultaClientes(objCli);
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);


        // Label para mostrar o nome do cliente selecionado
        // lbl_Cliente.setText(objCli.getNome());
        
    }//GEN-LAST:event_btn_SelecionarClienteActionPerformed

    private void txt_BuscarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarProdutoKeyTyped
        // TODO add your handling code here:
        String busca = txt_BuscarProduto.getText();
        ArrayList<Produto> listaProdutos = ProdutoDAO.pesquisarPorNome(busca);
        carregarProdutos(listaProdutos);
    }//GEN-LAST:event_txt_BuscarProdutoKeyTyped

    private void btn_AdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarCarrinhoActionPerformed
        // TODO add your handling code here:
        
        int linha = tbl_Produtos.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(this, "Selecione um produto!", "Carrinho vazio!", JOptionPane.ERROR_MESSAGE);
        } else{
            DefaultTableModel model = (DefaultTableModel) tbl_Carrinho.getModel();
            
            String id = tbl_Produtos.getValueAt(linha, 0).toString();
            String nome = tbl_Produtos.getValueAt(linha, 1).toString();
            double preco =  Double.parseDouble(tbl_Produtos.getValueAt(linha, 2).toString());
            int quantidade = Integer.parseInt(spn_QuantProduto.getValue().toString());
            double subtotal = preco * quantidade;

            valorTotal += subtotal;
            lbl_ValorTotal.setText(String.valueOf(valorTotal));

            model.addRow(new String []{id, nome, String.valueOf(preco), String.valueOf(quantidade), String.valueOf(subtotal)});
        }
    }//GEN-LAST:event_btn_AdicionarCarrinhoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AdicionarCarrinho;
    private javax.swing.JButton btn_FinalizarCompra;
    private javax.swing.JButton btn_RemoverCarrinho;
    private javax.swing.JButton btn_SelecionarCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lbl_CPF;
    public static javax.swing.JLabel lbl_Cliente;
    public static javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_ValorTotal;
    private javax.swing.JSpinner spn_QuantProduto;
    private javax.swing.JTable tbl_Carrinho;
    private javax.swing.JTable tbl_Produtos;
    private javax.swing.JTextField txt_BuscarProduto;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutos(ArrayList<Produto> produtos) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_Produtos.getModel();
        modelo.setNumRows(0);

        for (Produto produto : produtos) {
            modelo.addRow(new String[]{
                produto.getCodProduto(),
                produto.getNome(),
                Double.toString(produto.getValor()),
                Integer.toString(produto.getQuantidade())
            });
        }
    }
}
