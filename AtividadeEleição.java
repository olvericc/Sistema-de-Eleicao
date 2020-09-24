package ATIVIDADES.AtividadeEleição;

public class AtividadeEleição extends javax.swing.JFrame {

    public AtividadeEleição() {
        initComponents();
        btnApuracao.setEnabled(false);
        btnFimVotacao.setEnabled(false);
        btnCandidato1.setEnabled(false);
        btnCandidato2.setEnabled(false);
        btnCandidato3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        btnCandidato1 = new javax.swing.JButton();
        btnCandidato2 = new javax.swing.JButton();
        btnCandidato3 = new javax.swing.JButton();
        btnIniciarEleicao = new javax.swing.JButton();
        btnFimVotacao = new javax.swing.JButton();
        btnApuracao = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATIVIDADES/AtividadeEleição/imagem(voto).jpeg"))); // NOI18N

        btnCandidato1.setBackground(new java.awt.Color(255, 255, 51));
        btnCandidato1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCandidato1.setText("CANDIDATO 1");
        btnCandidato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato1ActionPerformed(evt);
            }
        });

        btnCandidato2.setBackground(new java.awt.Color(255, 255, 51));
        btnCandidato2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCandidato2.setText("CANDIDATO 2");
        btnCandidato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato2ActionPerformed(evt);
            }
        });

        btnCandidato3.setBackground(new java.awt.Color(255, 255, 51));
        btnCandidato3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCandidato3.setText("CANDIDATO 3");
        btnCandidato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidato3ActionPerformed(evt);
            }
        });

        btnIniciarEleicao.setBackground(new java.awt.Color(255, 255, 51));
        btnIniciarEleicao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIniciarEleicao.setText("INICIAR ELEIÇÃO");
        btnIniciarEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarEleicaoActionPerformed(evt);
            }
        });

        btnFimVotacao.setBackground(new java.awt.Color(255, 255, 51));
        btnFimVotacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFimVotacao.setText("FIM DA VOTAÇÃO");
        btnFimVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFimVotacaoActionPerformed(evt);
            }
        });

        btnApuracao.setBackground(new java.awt.Color(255, 255, 51));
        btnApuracao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnApuracao.setText("APURAÇÃO");
        btnApuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApuracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIniciarEleicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnCandidato1)
                                .addGap(41, 41, 41)
                                .addComponent(btnCandidato2)
                                .addGap(38, 38, 38)
                                .addComponent(btnCandidato3))
                            .addComponent(lblImagem))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnApuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFimVotacao)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblImagem)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarEleicao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCandidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCandidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCandidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFimVotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(lblMsg)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int votoCandidato1 = 0;
    int votoCandidato2 = 0;
    int votoCandidato3 = 0;
    
    private void btnIniciarEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarEleicaoActionPerformed
        btnIniciarEleicao.setEnabled(true);
        btnApuracao.setEnabled(true);
        btnFimVotacao.setEnabled(true);
        btnCandidato1.setEnabled(true);
        btnCandidato2.setEnabled(true);
        btnCandidato3.setEnabled(true);
        
        votoCandidato1 = 0;
        votoCandidato2 = 0;
        votoCandidato3 = 0;
    }//GEN-LAST:event_btnIniciarEleicaoActionPerformed
    
    private void btnCandidato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidato1ActionPerformed
        votoCandidato1 ++;
    }//GEN-LAST:event_btnCandidato1ActionPerformed
    
    private void btnCandidato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidato2ActionPerformed
        votoCandidato2 ++;
    }//GEN-LAST:event_btnCandidato2ActionPerformed

    private void btnCandidato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidato3ActionPerformed
        votoCandidato3 ++;
    }//GEN-LAST:event_btnCandidato3ActionPerformed

    private void btnFimVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFimVotacaoActionPerformed
        btnIniciarEleicao.setEnabled(true);
        btnApuracao.setEnabled(true);
        btnFimVotacao.setEnabled(false);
        btnCandidato1.setEnabled(false);
        btnCandidato2.setEnabled(false);
        btnCandidato3.setEnabled(false);
    }//GEN-LAST:event_btnFimVotacaoActionPerformed

    private void btnApuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApuracaoActionPerformed
        String resultado = "";
        
        //GANHADOR DA ELEIÇÃO
        
        if (votoCandidato1>votoCandidato2 && votoCandidato1>votoCandidato3){
            resultado = "CANDIDATO 1 GANHOU!";
        }else if (votoCandidato2>votoCandidato1 && votoCandidato2>votoCandidato3){
            resultado = "CANDIDATO 2 GANHOU!";
        }else if (votoCandidato3>votoCandidato1 && votoCandidato3>votoCandidato2){
            resultado = "CANDIDATO 3 GANHOU!";
        }
        
        //EMPATE ENTRE CANDIDATOS
        
        else if (votoCandidato2 == votoCandidato1 && votoCandidato2 > votoCandidato3 && votoCandidato1 > votoCandidato3){
            resultado = "HOUVE EMPATE ENTRE O CANDIDATO 1 E O CANDIDATO 2";
        }
        
        else if (votoCandidato3 == votoCandidato2 && votoCandidato3 > votoCandidato1 && votoCandidato2 > votoCandidato1){
            resultado = "HOUVE EMPATE ENTRE O CANDIDATO 2 E O CANDIDATO 3";
        }
        
        else if (votoCandidato3 == votoCandidato1 && votoCandidato3 > votoCandidato2 && votoCandidato1 > votoCandidato2){
            resultado = "HOUVE EMPATE ENTRE O CANDIDATO 3 E O CANDIDATO 1";
        }
        
        //EMPATE GERAL
        
        else if (votoCandidato1==votoCandidato2 && votoCandidato2==votoCandidato3){
            resultado = "NENHUM DOS CANDIDATOS VENCEU NA ELEIÇÃO!";
        }
        lblMsg.setText("Resultado da Eleição: " + resultado);
    }//GEN-LAST:event_btnApuracaoActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtividadeEleição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtividadeEleição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtividadeEleição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtividadeEleição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtividadeEleição().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApuracao;
    private javax.swing.JButton btnCandidato1;
    private javax.swing.JButton btnCandidato2;
    private javax.swing.JButton btnCandidato3;
    private javax.swing.JButton btnFimVotacao;
    private javax.swing.JButton btnIniciarEleicao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables
}
