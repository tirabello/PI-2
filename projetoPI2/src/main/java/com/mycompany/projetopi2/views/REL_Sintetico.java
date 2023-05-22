/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi2.views;

import java.util.Date;

import javax.swing.JOptionPane;

import com.mycompany.projetopi2.dao.VendaDAO;
import com.mycompany.projetopi2.models.ItemVenda;
import com.mycompany.projetopi2.models.RelatorioAnalitico;
import com.mycompany.projetopi2.models.RelatorioSintetico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ldss1
 */
public class REL_Sintetico extends javax.swing.JFrame {

    /**
     * Creates new form REL_
     */
    public REL_Sintetico() {
        initComponents();
        jPanel2.setVisible(false);
        carregarVendas(VendaDAO.buscarVendas(0));

    }

    private void carregarVendas(ArrayList<RelatorioSintetico> vendas) {
        DefaultTableModel modeloTabela = (DefaultTableModel) tbl_Sintetico.getModel();
        modeloTabela.setNumRows(0);

        double vlrTotal = 0;

        for (RelatorioSintetico venda : vendas) {
            modeloTabela.addRow(new String[]{
                String.valueOf(venda.getNumVenda()),
                String.valueOf(venda.getDataVenda()),
                String.valueOf(venda.getNomeCliente()),
                String.valueOf(venda.getQtdProdutos()),
                String.valueOf(venda.getVlrTotal())
            });
            vlrTotal += venda.getVlrTotal();

        }
        lbl_ValorTotal.setText(String.format("%.2f", vlrTotal));
        lbl_QntVendas.setText(String.valueOf(vendas.size()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Sintetico = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmb_Periodo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_BuscarPeriodoPersonalizado = new javax.swing.JButton();
        jdc_DataInicial = new com.toedter.calendar.JDateChooser();
        jdc_DataFinal = new com.toedter.calendar.JDateChooser();
        btn_AbrirRelatorioAnalitico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_ValorTotal = new javax.swing.JLabel();
        lbl_QntVendas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio Sintetico");
        setAlwaysOnTop(true);

        tbl_Sintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM VENDA", "DATA VENDA", "CLIENTE", "QUANTIDADE", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Sintetico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SinteticoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Sintetico);
        if (tbl_Sintetico.getColumnModel().getColumnCount() > 0) {
            tbl_Sintetico.getColumnModel().getColumn(0).setResizable(false);
            tbl_Sintetico.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_Sintetico.getColumnModel().getColumn(1).setResizable(false);
            tbl_Sintetico.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PERIODO"));
        jPanel1.setPreferredSize(new java.awt.Dimension(585, 65));

        cmb_Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOJE", "ONTEM", "7 DIAS", "14 DIAS", "30 DIAS", "Customizado" }));
        cmb_Periodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_PeriodoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Final");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Inicial");

        btn_BuscarPeriodoPersonalizado.setText("Buscar");
        btn_BuscarPeriodoPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarPeriodoPersonalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdc_DataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdc_DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_BuscarPeriodoPersonalizado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_DataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_DataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(btn_BuscarPeriodoPersonalizado)))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmb_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_AbrirRelatorioAnalitico.setText("Visualizar Analítico");
        btn_AbrirRelatorioAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirRelatorioAnaliticoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("QUANTIDADE DE VENDAS:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("VALOR TOTAL:");

        lbl_ValorTotal.setPreferredSize(new java.awt.Dimension(125, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_QntVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_AbrirRelatorioAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_AbrirRelatorioAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_QntVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_PeriodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_PeriodoItemStateChanged
        if (cmb_Periodo.getSelectedIndex() == 5) {
            jPanel2.setVisible(true);
        } else {
            jPanel2.setVisible(false);
            switch (cmb_Periodo.getSelectedItem().toString()) {
                case "HOJE":
                    carregarVendas(VendaDAO.buscarVendas(0));
                    break;
                case "ONTEM":
                    carregarVendas(VendaDAO.buscarVendas(1));
                    break;
                case "7 DIAS":
                    carregarVendas(VendaDAO.buscarVendas(7));
                    break;
                case "14 DIAS":
                    carregarVendas(VendaDAO.buscarVendas(14));
                    break;
                case "30 DIAS":
                    carregarVendas(VendaDAO.buscarVendas(30));
                    break;
            }
        }
    }//GEN-LAST:event_cmb_PeriodoItemStateChanged

    private void btn_AbrirRelatorioAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirRelatorioAnaliticoActionPerformed
        exibirRelatorioAnalitico();
    }//GEN-LAST:event_btn_AbrirRelatorioAnaliticoActionPerformed

    private void btn_BuscarPeriodoPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarPeriodoPersonalizadoActionPerformed

        if (jdc_DataInicial.getDate() == null || jdc_DataFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Selecione as datas para realizar a busca!");
            return;
        } else if (jdc_DataInicial.getDate().after(jdc_DataFinal.getDate())) {
            JOptionPane.showMessageDialog(this, "A data inicial não pode ser maior que a data final!");
            return;
        } else {

            Date dataInicial = jdc_DataInicial.getDate();
            Date dataFinal = jdc_DataFinal.getDate();
            carregarVendas(VendaDAO.buscarVendas(dataInicial, dataFinal));
        }

    }//GEN-LAST:event_btn_BuscarPeriodoPersonalizadoActionPerformed

    private void exibirRelatorioAnalitico() {
        int linhaSelecionada = tbl_Sintetico.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma venda para exibir o relatório!");
            return;
        } else {
            int idVenda = Integer.parseInt(tbl_Sintetico.getValueAt(linhaSelecionada, 0).toString());
            ArrayList<RelatorioAnalitico> itensVenda = VendaDAO.buscarItensVenda(idVenda);

            REL_Analitico rel = new REL_Analitico(itensVenda);
            rel.lbl_DataCompra.setText(tbl_Sintetico.getValueAt(linhaSelecionada, 1).toString());
            rel.lbl_Cliente.setText(tbl_Sintetico.getValueAt(linhaSelecionada, 2).toString());
            rel.lbl_ValorTotal.setText(tbl_Sintetico.getValueAt(linhaSelecionada, 4).toString());
            rel.setVisible(true);
            rel.setLocationRelativeTo(null);
        }
    }

    private void tbl_SinteticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SinteticoMouseClicked
        if (evt.getClickCount() == 2) {
            exibirRelatorioAnalitico();
        }
    }//GEN-LAST:event_tbl_SinteticoMouseClicked

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
            java.util.logging.Logger.getLogger(REL_Sintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REL_Sintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REL_Sintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REL_Sintetico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REL_Sintetico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AbrirRelatorioAnalitico;
    private javax.swing.JButton btn_BuscarPeriodoPersonalizado;
    private javax.swing.JComboBox<String> cmb_Periodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_DataFinal;
    private com.toedter.calendar.JDateChooser jdc_DataInicial;
    private javax.swing.JLabel lbl_QntVendas;
    private javax.swing.JLabel lbl_ValorTotal;
    private javax.swing.JTable tbl_Sintetico;
    // End of variables declaration//GEN-END:variables
}
