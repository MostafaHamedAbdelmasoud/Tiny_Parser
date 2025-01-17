/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;



public class GUIForm extends javax.swing.JFrame {

    private Parser parser;

    /**
     * Creates new form GUIForm
     */
    public GUIForm() {
        initComponents();
        imgContainer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        programLocationTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        parseButton = new javax.swing.JButton();
        imgContainer = new javax.swing.JScrollPane();
        imgPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        browseButton = new javax.swing.JButton();

        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents(*.txt)", "txt");
        fileChooser.setFileFilter(filter);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 107, 255));
        setExtendedState(6);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        programLocationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programLocationTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("fileChooser");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);

        parseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parser/edit.png"))); // NOI18N
        parseButton.setText("Generate");
        parseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parseButton)
                            .addComponent(programLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(programLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parseButton)
                .addGap(6, 6, 6))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 76, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        imgPanel.setLayout(new java.awt.BorderLayout());
        imgContainer.setViewportView(imgPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 535;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 15, 0);
        getContentPane().add(imgContainer, gridBagConstraints);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parser/save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new java.awt.GridBagConstraints());
        saveButton.setVisible(false);

        browseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parser/add.png"))); // NOI18N
        browseButton.setText("Open File");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(browseButton, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            fileChooser.setCurrentDirectory(fileChooser.getSelectedFile().getParentFile());
            programLocationTextField.setText(filePath);
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void parseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parseButtonActionPerformed
       try{
           String programLocation = programLocationTextField.getText();
           if(programLocation == null || programLocation.isEmpty()){
               JOptionPane.showMessageDialog(this, "Please Specify a file", "Notice",JOptionPane.WARNING_MESSAGE);
               return;
           }
           parser = new Parser(programLocation);
           parser.start("png");
           byte[] imgBytes = parser.getTree().getImg("png");
           ImageIcon img = new ImageIcon(imgBytes);
           JLabel label = new JLabel("", img, JLabel.CENTER);
           imgPanel.removeAll();
           imgPanel.add( label, BorderLayout.CENTER );
           imgContainer.setVisible(true);
           saveButton.setVisible(true);
           this.revalidate();
       }catch(SyntaxErrorException e){
           JOptionPane.showMessageDialog(this, e.getMessage(), "Syntax Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_parseButtonActionPerformed

    private void programLocationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programLocationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programLocationTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        parser.getTree().outputToFile("SyntaxTree.png");
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JScrollPane imgContainer;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton parseButton;
    private javax.swing.JTextField programLocationTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
