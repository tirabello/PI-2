/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi2.views;

import com.mycompany.projetopi2.dao.ProdutoDAO;
import com.mycompany.projetopi2.models.Produto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author joser
 */
public class PRO_AdicionarProdutos extends javax.swing.JFrame {

    Produto objPro;

    public PRO_AdicionarProdutos() {
        initComponents();

    }

    public PRO_AdicionarProdutos(Produto objPro) {
        initComponents();

        setTitle("Atualizar Produto");
        btn_InserirProduto.setText("Atualizar");

        txt_Nome.setText(objPro.getNome());
        txtCodigoProduto.setText(String.valueOf(objPro.getCodProduto()));
        txtValor.setText(String.valueOf(objPro.getValor()));

        switch (objPro.getCategoria()) {
            case "Medicamento":
                rbo_Medicamento.setSelected(true);
                break;
            case "Higiene":
                rbo_Higiene.setSelected(true);
                break;
            case "Cosméticos":
                rbo_Cosmeticos.setSelected(true);
                break;
            case "Acessórios":
                rbo_Acessorios.setSelected(true);
                break;
            case "Suplementos e Vitaminicos":
                rbo_Suplementos.setSelected(true);
                break;
        }

        if (objPro.getUnidadeVenda().equals("Unidade")) {
            rbo_Unidade.setSelected(true);
        } else {
            rbo_Caixa.setSelected(true);
        }

        spn_Quantidade.setValue(objPro.getQuantidade());
        txtDescricao.setText(objPro.getDescricao());

        this.objPro = objPro;

    }

    public void limparCampos() {
        txt_Nome.setText("");
        txtCodigoProduto.setText("");
        txtValor.setText("");
        spn_Quantidade.setValue(0);
        gup_Produto.clearSelection();
        gup_Unidade.clearSelection();
        txtDescricao.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gup_Produto = new javax.swing.ButtonGroup();
        gup_Unidade = new javax.swing.ButtonGroup();
        txtValor = new javax.swing.JTextField();
        labDescricao = new javax.swing.JLabel();
        labValor = new javax.swing.JLabel();
        labQuantidade = new javax.swing.JLabel();
        pnlUnidadeVenda = new javax.swing.JPanel();
        rbo_Caixa = new javax.swing.JRadioButton();
        rbo_Unidade = new javax.swing.JRadioButton();
        txtCodigoProduto = new javax.swing.JTextField();
        labCodigoProduto = new javax.swing.JLabel();
        pnlCategoria = new javax.swing.JPanel();
        rbo_Medicamento = new javax.swing.JRadioButton();
        rbo_Higiene = new javax.swing.JRadioButton();
        rbo_Cosmeticos = new javax.swing.JRadioButton();
        rbo_Acessorios = new javax.swing.JRadioButton();
        rbo_Suplementos = new javax.swing.JRadioButton();
        btn_InserirProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lbl_Alerta = new javax.swing.JLabel();
        spn_Quantidade = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Produto");
        setAlwaysOnTop(true);

        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        labDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labDescricao.setText("DESCRIÇÃO");

        labValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labValor.setText("VALOR *");

        labQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labQuantidade.setText("QUANTIDADE *");

        pnlUnidadeVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidade de Venda *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        pnlUnidadeVenda.setForeground(new java.awt.Color(0, 0, 51));

        gup_Unidade.add(rbo_Caixa);
        rbo_Caixa.setText("Caixa");

        gup_Unidade.add(rbo_Unidade);
        rbo_Unidade.setText("Unidade");

        javax.swing.GroupLayout pnlUnidadeVendaLayout = new javax.swing.GroupLayout(pnlUnidadeVenda);
        pnlUnidadeVenda.setLayout(pnlUnidadeVendaLayout);
        pnlUnidadeVendaLayout.setHorizontalGroup(
            pnlUnidadeVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUnidadeVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbo_Unidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbo_Caixa)
                .addGap(169, 169, 169))
        );
        pnlUnidadeVendaLayout.setVerticalGroup(
            pnlUnidadeVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUnidadeVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUnidadeVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbo_Caixa)
                    .addComponent(rbo_Unidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoProdutoFocusLost(evt);
            }
        });
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyTyped(evt);
            }
        });

        labCodigoProduto.setBackground(new java.awt.Color(182, 182, 255));
        labCodigoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labCodigoProduto.setText("COD *");
        labCodigoProduto.setToolTipText("Código do Produto");

        pnlCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        pnlCategoria.setForeground(new java.awt.Color(0, 0, 51));

        gup_Produto.add(rbo_Medicamento);
        rbo_Medicamento.setText("Medicamento");
        rbo_Medicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gup_Produto.add(rbo_Higiene);
        rbo_Higiene.setText("Higiene");

        gup_Produto.add(rbo_Cosmeticos);
        rbo_Cosmeticos.setText("Cosméticos");

        gup_Produto.add(rbo_Acessorios);
        rbo_Acessorios.setText("Acessórios");

        gup_Produto.add(rbo_Suplementos);
        rbo_Suplementos.setText("Suplementos e Vitaminicos");

        javax.swing.GroupLayout pnlCategoriaLayout = new javax.swing.GroupLayout(pnlCategoria);
        pnlCategoria.setLayout(pnlCategoriaLayout);
        pnlCategoriaLayout.setHorizontalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCategoriaLayout.createSequentialGroup()
                        .addComponent(rbo_Cosmeticos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCategoriaLayout.createSequentialGroup()
                        .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbo_Medicamento)
                            .addComponent(rbo_Suplementos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbo_Acessorios)
                            .addComponent(rbo_Higiene))
                        .addGap(108, 108, 108))))
        );
        pnlCategoriaLayout.setVerticalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbo_Medicamento)
                    .addComponent(rbo_Acessorios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbo_Suplementos)
                    .addComponent(rbo_Higiene))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbo_Cosmeticos))
        );

        btn_InserirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8672677_ic_fluent_add_filled_icon.png"))); // NOI18N
        btn_InserirProduto.setText("Adicionar");
        btn_InserirProduto.setToolTipText("Adicionar Produto");
        btn_InserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("NOME *");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        lbl_Alerta.setForeground(java.awt.Color.red);

        spn_Quantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pnlUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spn_Quantidade))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(labCodigoProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValor))
                                    .addComponent(txt_Nome)))
                            .addComponent(pnlCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_Alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_InserirProduto)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labValor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUnidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spn_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_InserirProduto)
                    .addComponent(lbl_Alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirProdutoActionPerformed
        String aviso = "";
        Boolean retorno = false;

        if (objPro == null) {

            String nome = txt_Nome.getText();
            if ("".equals(nome)) {
                aviso = "Digite o nome do produto!\n";
                txt_Nome.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
            }

            String codigoProduto = txtCodigoProduto.getText();
            if ("".equals(codigoProduto)) {
                aviso += "Digite um código válido!\n";
                txtCodigoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
            }

            double valor = 0;
            String txValor = txtValor.getText();
            if ("".equals(txValor)) {
                aviso += "Digite um valor válido!\n";
                txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
            } else {
                valor = Double.parseDouble(txValor.replace(",", "."));
            }

            String categoria = "";
            if (rbo_Medicamento.isSelected()) {
                categoria = rbo_Medicamento.getActionCommand();
            } else if (rbo_Suplementos.isSelected()) {
                categoria = rbo_Suplementos.getActionCommand();
            } else if (rbo_Cosmeticos.isSelected()) {
                categoria = rbo_Cosmeticos.getActionCommand();
            } else if (rbo_Acessorios.isSelected()) {
                categoria = rbo_Acessorios.getActionCommand();
            } else if (rbo_Higiene.isSelected()) {
                categoria = rbo_Higiene.getActionCommand();
            } else {
                aviso += "Selecione um tipo de produto!\n";
                pnlCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.red), "Categoria *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 51)));
            }
            // categoria = gup_Produto.getSelection().getActionCommand();
            // if(gup_Produto.getSelection() == null){
            //     aviso += "Selecione um tipo de produto!\n";
            //     pnlCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.red), "Categoria *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 51)));
            // }else{
            //     categoria = gup_Produto.getSelection().getActionCommand();
            // }

            String unidadeVenda = "";
            if (rbo_Unidade.isSelected()) {
                unidadeVenda = rbo_Unidade.getActionCommand();
            } else if (rbo_Caixa.isSelected()) {
                unidadeVenda = rbo_Caixa.getActionCommand();
            } else {
                aviso += "Selecione uma unidade de venda!\n";
                pnlUnidadeVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.red), "Unidade de Venda *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 51)));
            }
            // String unidadeVenda = gup_Unidade.getSelection().getActionCommand();
            // if(gup_Unidade.getSelection() == null){
            //     aviso += "Selecione uma unidade de venda!\n";
            //     pnlUnidadeVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.red), "Unidade de Venda *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 51)));
            // }else{
            //     unidadeVenda = gup_Unidade.getSelection().getActionCommand();
            // }

            int quantidade = (int) spn_Quantidade.getValue();
            if (quantidade <= 0) {
                aviso += "Digite uma quantidade válida!\n";
                spn_Quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
            }
            String descricao = txtDescricao.getText();

            if (!"".equals(aviso)) {
                JOptionPane.showMessageDialog(this, aviso, "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                Produto novoProduto = new Produto(nome, codigoProduto, valor, categoria, unidadeVenda, quantidade, descricao);

                retorno = ProdutoDAO.inserir(novoProduto);

                if (retorno) {
                    JOptionPane.showMessageDialog(this, "Produto inserido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir produto!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                this.dispose();
            }

        } else if (objPro != null && objPro.getCodProduto() != null) {

            String codOriginal = objPro.getCodProduto();
            String nome = txt_Nome.getText();
            String codProduto = txtCodigoProduto.getText();
            double valor = Double.parseDouble(txtValor.getText().replace(",", "."));
            String categoria = "";
            if (rbo_Medicamento.isSelected()) {
                categoria = rbo_Medicamento.getActionCommand();
            } else if (rbo_Suplementos.isSelected()) {
                categoria = rbo_Suplementos.getActionCommand();
            } else if (rbo_Cosmeticos.isSelected()) {
                categoria = rbo_Cosmeticos.getActionCommand();
            } else if (rbo_Acessorios.isSelected()) {
                categoria = rbo_Acessorios.getActionCommand();
            } else {
                categoria = rbo_Higiene.getActionCommand();
            }
            String unidadeVenda = "";
            if (rbo_Unidade.isSelected()) {
                unidadeVenda = rbo_Unidade.getActionCommand();
            } else {
                unidadeVenda = rbo_Caixa.getActionCommand();
            }
            int quantidade = (int) spn_Quantidade.getValue();
            String descricao = txtDescricao.getText();

            objPro.setNome(nome);
            objPro.setCodProduto(codProduto);
            objPro.setValor(valor);
            objPro.setCategoria(categoria);
            objPro.setUnidadeVenda(unidadeVenda);
            objPro.setQuantidade(quantidade);
            objPro.setDescricao(descricao);

            System.out.println(codOriginal);

            retorno = ProdutoDAO.atualizar(objPro, codOriginal);

            if (retorno) {
                this.dispose();
                PRO_ConsultaProdutos.atualizarTabela();
                JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar produto!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_InserirProdutoActionPerformed

    private void txtCodigoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.lbl_Alerta.setText("Somente números no Campo Codigo!");
        }
    }//GEN-LAST:event_txtCodigoProdutoKeyTyped

    private void txtCodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoProdutoFocusLost
        this.lbl_Alerta.setText("");
    }//GEN-LAST:event_txtCodigoProdutoFocusLost

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_COMMA)) {
            evt.consume();
            this.lbl_Alerta.setText("Somente números no Campo Valor!");
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        this.lbl_Alerta.setText("");
    }//GEN-LAST:event_txtValorFocusLost

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
            java.util.logging.Logger.getLogger(PRO_AdicionarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRO_AdicionarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRO_AdicionarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRO_AdicionarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRO_AdicionarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InserirProduto;
    private javax.swing.ButtonGroup gup_Produto;
    private javax.swing.ButtonGroup gup_Unidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labCodigoProduto;
    private javax.swing.JLabel labDescricao;
    private javax.swing.JLabel labQuantidade;
    private javax.swing.JLabel labValor;
    private javax.swing.JLabel lbl_Alerta;
    private javax.swing.JPanel pnlCategoria;
    private javax.swing.JPanel pnlUnidadeVenda;
    private javax.swing.JRadioButton rbo_Acessorios;
    private javax.swing.JRadioButton rbo_Caixa;
    private javax.swing.JRadioButton rbo_Cosmeticos;
    private javax.swing.JRadioButton rbo_Higiene;
    private javax.swing.JRadioButton rbo_Medicamento;
    private javax.swing.JRadioButton rbo_Suplementos;
    private javax.swing.JRadioButton rbo_Unidade;
    private javax.swing.JSpinner spn_Quantidade;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txt_Nome;
    // End of variables declaration//GEN-END:variables
}
