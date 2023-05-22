/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import conexoes.MySQL;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.Cliente;

/**
 *
 * @author DELL
 */
public class InterfaceUsuario2 extends javax.swing.JFrame {
MySQL conectar = new MySQL();
Cliente novoCliente = new Cliente();

    
       
    /**
     * Creates new form interfaceUsuario2
     */
    public InterfaceUsuario2() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        BtnPesquisarCPF = new javax.swing.JButton();
        BtnAtualizarSenha = new javax.swing.JButton();
        BtnExcluirConta = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        BtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo cadastrar login.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");

        jPanel6.setBackground(new java.awt.Color(239, 239, 239));

        BtnPesquisarCPF.setBackground(new java.awt.Color(72, 107, 91));
        BtnPesquisarCPF.setFont(new java.awt.Font("Amarillo", 0, 18)); // NOI18N
        BtnPesquisarCPF.setForeground(new java.awt.Color(255, 255, 255));
        BtnPesquisarCPF.setText("Pesquisar CPF");
        BtnPesquisarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarCPFActionPerformed(evt);
            }
        });

        BtnAtualizarSenha.setBackground(new java.awt.Color(72, 107, 91));
        BtnAtualizarSenha.setFont(new java.awt.Font("Amarillo", 0, 18)); // NOI18N
        BtnAtualizarSenha.setForeground(new java.awt.Color(255, 255, 255));
        BtnAtualizarSenha.setText("Atualizar Senha");
        BtnAtualizarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarSenhaActionPerformed(evt);
            }
        });

        BtnExcluirConta.setBackground(new java.awt.Color(72, 107, 91));
        BtnExcluirConta.setFont(new java.awt.Font("Amarillo", 0, 18)); // NOI18N
        BtnExcluirConta.setForeground(new java.awt.Color(255, 255, 255));
        BtnExcluirConta.setText("Excluir Conta");
        BtnExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirContaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Amarillo", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Bem-vindo");

        BtnSair.setBackground(new java.awt.Color(72, 107, 91));
        BtnSair.setFont(new java.awt.Font("Amarillo", 0, 18)); // NOI18N
        BtnSair.setForeground(new java.awt.Color(255, 255, 255));
        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtualizarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(BtnAtualizarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BtnExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void BtnPesquisarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarCPFActionPerformed
        MySQL mysql = new MySQL();
        mysql.conectaBanco();
        
        ResultSet resultSet = mysql.consultarCPFs();
        
        StringBuilder cpfList = new StringBuilder();
        try {
            while (resultSet.next()) {
                String cpf = resultSet.getString("cpf");
                cpfList.append(cpf).append("\n");
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        
        mysql.fechaBanco();
        
        JOptionPane.showMessageDialog(null, cpfList.toString(), "Lista de CPFs", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnPesquisarCPFActionPerformed

    private void BtnAtualizarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarSenhaActionPerformed
   

    }//GEN-LAST:event_BtnAtualizarSenhaActionPerformed

    private void BtnExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirContaActionPerformed
    MySQL sql = new MySQL ();
        sql.excluirContaUsuarioLogado();
    }//GEN-LAST:event_BtnExcluirContaActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        // MÃAAAAAAAAAAAAAAAAAAAAAAAAAO TOOOOOOOOOOOOOOOOOOOCCCCCCCCCCCCCCCCCCAAAAAAAAAAAAAAAAR
    }//GEN-LAST:event_BtnSairActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUsuario2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizarSenha;
    private javax.swing.JButton BtnExcluirConta;
    private javax.swing.JButton BtnPesquisarCPF;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
