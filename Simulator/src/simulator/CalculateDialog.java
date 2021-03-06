/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

/**
 *
 * @author rzfzr
 */
public class CalculateDialog extends javax.swing.JDialog {

    /**
     * Creates new form CalculateDialog
     */
    public CalculateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel = new javax.swing.JPanel();
        TextInicialRoll = new javax.swing.JTextField();
        TextInicialDices = new javax.swing.JTextField();
        TextFinalRoll = new javax.swing.JTextField();
        TextFinalDices = new javax.swing.JTextField();
        LabelResult = new javax.swing.JLabel();
        ButtonCalculate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TextInicialRoll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextInicialRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInicialRollActionPerformed(evt);
            }
        });

        TextInicialDices.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextInicialDices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInicialDicesActionPerformed(evt);
            }
        });

        TextFinalRoll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TextFinalDices.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFinalDices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFinalDicesActionPerformed(evt);
            }
        });

        LabelResult.setBackground(new java.awt.Color(255, 255, 204));

        ButtonCalculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonCalculate.setText("Calcular");
        ButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jogada Inicial");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jogada Final");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Dados Inicial");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Dados Final");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(64, 64, 64))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TextInicialRoll)
                                            .addComponent(TextFinalRoll))
                                        .addGap(58, 58, 58)))
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(TextInicialDices)
                                    .addComponent(TextFinalDices))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(455, 455, 455))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(ButtonCalculate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextInicialRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextInicialDices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFinalRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFinalDices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonCalculate)
                .addGap(9, 9, 9)
                .addComponent(LabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFinalDicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFinalDicesActionPerformed

    }//GEN-LAST:event_TextFinalDicesActionPerformed

    private void ButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculateActionPerformed

        Calculate();

    }//GEN-LAST:event_ButtonCalculateActionPerformed

    
    public void Calculate(){
        

        //Calculate rolls and dices
        //original
        //((jogfin-jogini)*log10(2))/(log10(dadoini/dadofin));
        double inRoll = Double.parseDouble(TextInicialRoll.getText());
        double inDices = Double.parseDouble(TextInicialDices.getText());

        double finRoll = Double.parseDouble(TextFinalRoll.getText());
        double finDices = Double.parseDouble(TextFinalDices.getText());

        double result = ((finRoll - inRoll) * Math.log10(2)) / (Math.log10(inDices / finDices));

        LabelResult.setText(Double.toString(result));
        
        
        
    }
    private void TextInicialRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInicialRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInicialRollActionPerformed

    private void TextInicialDicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInicialDicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInicialDicesActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculateDialog dialog = new CalculateDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalculate;
    private javax.swing.JLabel LabelResult;
    public javax.swing.JTextField TextFinalDices;
    public javax.swing.JTextField TextFinalRoll;
    public javax.swing.JTextField TextInicialDices;
    public javax.swing.JTextField TextInicialRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
