/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetopi2;

import com.mycompany.projetopi2.views.TelaInicial;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author tiago.rbraz
 */

public class ProjetoPI2 {

    public static void main(String[] args) {

        //Define o padrão das janelas
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(ProjetoPI2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        TelaInicial tela = new TelaInicial();
        // tela.setExtendedState(tela.MAXIMIZED_BOTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
