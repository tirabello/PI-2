package com.mycompany.projetopi2.views;

import java.awt.Color;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import com.mycompany.projetopi2.dao.ClienteDAO;
import com.mycompany.projetopi2.models.Cliente;

/**
 *
 * @author tiago.rbraz
 */
public class CLI_AdicionarCliente extends javax.swing.JFrame {

    Cliente objCli;

    public CLI_AdicionarCliente() {
        initComponents();
        ImageIcon icone = new ImageIcon(getClass().getResource("/8673597_ic_fluent_person_add_filled_icon.png"));
        this.setIconImage(icone.getImage());
    }

    public CLI_AdicionarCliente(Cliente objCli) {
        initComponents();
        setTitle("Atualizar Cliente");
        ImageIcon icone = new ImageIcon(getClass().getResource("/8673546_ic_fluent_person_edit_filled_icon.png"));
        this.setIconImage(icone.getImage());
        btn_InserirCliente.setText("Atualizar");
        // btn_InserirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-editar-20.png")));
        btn_InserirCliente.setToolTipText("Atualizar Dados do Cliente");

        txtNome.setText(String.valueOf(objCli.getNome()));
        txtCPF.setText(String.valueOf(objCli.getCpf()));
        jdc_DataNascimento.setDate(objCli.getDataNascimento());
        txtTelefone.setText(String.valueOf(objCli.getTelefone()));
        txtEmail.setText(String.valueOf(objCli.getEmail()));
        txtEndereco.setText(String.valueOf(objCli.getEndereco()));
        cmb_EstadoCivil.setSelectedItem(String.valueOf(objCli.getEstadoCivil()));
        switch (objCli.getSexo()) {
            case "Masculino":
                rbnMasculino.setSelected(true);
                break;
            case "Feminino":
                rbnFeminino.setSelected(true);
                break;
            default:
                rbnOutros.setSelected(true);
                break;
        }

        this.objCli = objCli;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btn_InserirCliente = new javax.swing.JButton();
        cmb_EstadoCivil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        rbnOutros = new javax.swing.JRadioButton();
        rbnFeminino = new javax.swing.JRadioButton();
        rbnMasculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lbl_Alerta = new javax.swing.JLabel();
        jdc_DataNascimento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setAlwaysOnTop(true);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("NOME *");

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        btn_InserirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8673597_ic_fluent_person_add_filled_icon.png"))); // NOI18N
        btn_InserirCliente.setText("Inserir");
        btn_InserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirClienteActionPerformed(evt);
            }
        });

        cmb_EstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SOLTEIRO", "CASADO", "SEPARADO", "DIVORCIADO", "VIÚVO" }));
        cmb_EstadoCivil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ESTADO CIVIL *");

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome1.setText("DATA NASC. *");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setText("");
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setText("CPF *");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CELULAR *");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("E-MAIL *");

        buttonGroup1.add(rbnOutros);
        rbnOutros.setText("Não-Binario");
        rbnOutros.setBorderPainted(true);
        rbnOutros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        buttonGroup1.add(rbnFeminino);
        rbnFeminino.setText("Feminino");
        rbnFeminino.setBorderPainted(true);
        rbnFeminino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        buttonGroup1.add(rbnMasculino);
        rbnMasculino.setText("Masculino");
        rbnMasculino.setBorderPainted(true);
        rbnMasculino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("SEXO *");

        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEndereco.setText("ENDEREÇO *");

        lbl_Alerta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_Alerta.setForeground(java.awt.Color.red);

        jdc_DataNascimento.setDateFormatString("dd/MM/yyyy");
        jdc_DataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CLI_AdicionarCliente.this.focusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jdc_DataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_EstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefone))))
                    .addComponent(txtEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbnFeminino, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rbnMasculino, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(rbnOutros)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_InserirCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbnMasculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnFeminino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnOutros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdc_DataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_InserirCliente)
                    .addComponent(lbl_Alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirClienteActionPerformed

        boolean validacao = false;
        boolean retorno = false;

        if (objCli == null) {

            String nome = txtNome.getText();
            String CPF = txtCPF.getText();

            Date dataNascimento = jdc_DataNascimento.getDate();// (Date) -> CAST (CONVERTER)
            String estadoCivil = cmb_EstadoCivil.getSelectedItem().toString();
            String telefone = txtTelefone.getText();
            String endereco = txtEndereco.getText();
            String email = txtEmail.getText();
            String sexo = "";

            System.out.println(telefone);

            if (rbnFeminino.isSelected()) {
                sexo = rbnFeminino.getText();
            } else if (rbnMasculino.isSelected()) {
                sexo = rbnMasculino.getText();
            } else if (rbnOutros.isSelected()) {
                sexo = rbnOutros.getText();
            } else {
                rbnFeminino.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                rbnMasculino.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                rbnOutros.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if ("".equals(nome)) {
                txtNome.setBorder(BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if (CPF.isBlank()) {
                txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if ("".equals(endereco)) {
                txtEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if (telefone.isBlank()) {
                txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if ("".equals(email)) {
                txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if (estadoCivil == "SELECIONE") {
                cmb_EstadoCivil.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if (dataNascimento == null) {
                jdc_DataNascimento.setBorder(BorderFactory.createLineBorder(Color.red));
                validacao = true;
            }

            if (validacao) {
                lbl_Alerta.setText("Verifique os campos em vermelho!");
            } else {
                lbl_Alerta.setText("");
                Cliente objCli = new Cliente(nome, sexo, dataNascimento, estadoCivil, CPF, telefone, email, endereco);

                //Adicionar à tabela -> iMPEMENTAR DAO
                retorno = ClienteDAO.adicionarCliente(objCli);

                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha!");
                }
            }

        } else if (objCli != null && objCli.getId_cliente() > 0) {

            String nome = txtNome.getText();
            String CPF = txtCPF.getText();
            Date dataNascimento = jdc_DataNascimento.getDate(); // (Date) -> CAST (CONVERTER)
            String estadoCivil = cmb_EstadoCivil.getSelectedItem().toString();
            String telefone = txtTelefone.getText();
            String endereco = txtEndereco.getText();
            String email = txtEmail.getText();
            String sexo = "";
            if (rbnFeminino.isSelected()) {
                sexo = rbnFeminino.getText();
            } else if (rbnMasculino.isSelected()) {
                sexo = rbnMasculino.getText();
            } else if (rbnOutros.isSelected()) {
                sexo = rbnOutros.getText();
            }

            objCli.setNome(nome);
            objCli.setSexo(sexo);
            objCli.setDataNascimento(dataNascimento);
            objCli.setEstadoCivil(estadoCivil);
            objCli.setCpf(CPF);
            objCli.setTelefone(telefone);
            objCli.setEndereco(endereco);
            objCli.setEmail(email);

            //Adicionar à tabela -> iMPEMENTAR DAO
            retorno = ClienteDAO.atualizarCliente(objCli);

            if (retorno) {
                this.dispose();
                JOptionPane.showMessageDialog(rootPane, "Sucesso!");
                CLI_ConsultaClientes.carregarClientes();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha!");
            }
        }

        if (!validacao || retorno) {
            // Apos de inserir no BD - LIMPE OS CAMPOS
            txtNome.setText("");
            txtCPF.setText("");
            txtEndereco.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");
            jdc_DataNascimento.setDate(null);
            cmb_EstadoCivil.setSelectedIndex(0);
            rbnFeminino.setSelected(false);
            rbnMasculino.setSelected(false);
            rbnOutros.setSelected(false);
            objCli = null;
            lbl_Alerta.setText("");

        }


    }//GEN-LAST:event_btn_InserirClienteActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void focusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGained
        ((JComponent) evt.getComponent()).setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLUE));
    }//GEN-LAST:event_focusGained

    private void focusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLost
        ((JComponent) evt.getComponent()).setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
    }//GEN-LAST:event_focusLost

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CLI_AdicionarCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLI_AdicionarCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLI_AdicionarCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLI_AdicionarCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLI_AdicionarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InserirCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_EstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdc_DataNascimento;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lbl_Alerta;
    private javax.swing.JRadioButton rbnFeminino;
    private javax.swing.JRadioButton rbnMasculino;
    private javax.swing.JRadioButton rbnOutros;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
