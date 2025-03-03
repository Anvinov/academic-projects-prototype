/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

/**
 *
 * @author anvig
 */
public class GUINewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
    public GUINewStudent() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPHead = new javax.swing.JPanel();
        lbTitleProyect = new java.awt.Label();
        jPTittleNewUser = new javax.swing.JPanel();
        jLTittleNewStudent = new javax.swing.JLabel();
        jPContent = new javax.swing.JPanel();
        jLNameStudent = new javax.swing.JLabel();
        jFieldNameStudent = new javax.swing.JTextField();
        jLCodeStudent = new javax.swing.JLabel();
        jFieldCodeStudent = new javax.swing.JTextField();
        jLTelStudent = new javax.swing.JLabel();
        jTFieldTelStudent = new javax.swing.JTextField();
        jLEmailStudent = new javax.swing.JLabel();
        jFieldEmailStudent = new javax.swing.JTextField();
        jLPasswordStudent = new javax.swing.JLabel();
        jFieldPassWordStudent = new javax.swing.JPasswordField();
        jBtnSaveStudent = new javax.swing.JButton();
        jPButtom = new javax.swing.JPanel();
        jBtnBackSelectUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPHead.setBackground(new java.awt.Color(236, 230, 240));
        jPHead.setForeground(new java.awt.Color(0, 0, 0));
        jPHead.setLayout(new javax.swing.BoxLayout(jPHead, javax.swing.BoxLayout.LINE_AXIS));

        lbTitleProyect.setAlignment(java.awt.Label.CENTER);
        lbTitleProyect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbTitleProyect.setText("Sistema gestor de proyectos academicos");
        jPHead.add(lbTitleProyect);

        jPTittleNewUser.setBackground(new java.awt.Color(255, 255, 255));

        jLTittleNewStudent.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTittleNewStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleNewStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleNewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicauca/academicprojectsprototype/presentation/Icons/NewUser.png"))); // NOI18N
        jLTittleNewStudent.setText("Nuevo estudiante");
        jLTittleNewStudent.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPTittleNewUser.add(jLTittleNewStudent);

        jPContent.setBackground(new java.awt.Color(236, 230, 240));
        jPContent.setForeground(new java.awt.Color(0, 0, 0));
        jPContent.setLayout(new java.awt.GridBagLayout());

        jLNameStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLNameStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLNameStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNameStudent.setText("*Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jLNameStudent, gridBagConstraints);

        jFieldNameStudent.setBackground(new java.awt.Color(255, 255, 255));
        jFieldNameStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldNameStudent.setForeground(new java.awt.Color(0, 0, 0));
        jFieldNameStudent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldNameStudent.setText("Julian Lopez");
        jFieldNameStudent.setMaximumSize(new java.awt.Dimension(500, 100));
        jFieldNameStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldNameStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jFieldNameStudent, gridBagConstraints);

        jLCodeStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLCodeStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLCodeStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCodeStudent.setText("Codigo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jLCodeStudent, gridBagConstraints);

        jFieldCodeStudent.setBackground(new java.awt.Color(255, 255, 255));
        jFieldCodeStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldCodeStudent.setForeground(new java.awt.Color(0, 0, 0));
        jFieldCodeStudent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldCodeStudent.setText("1046123");
        jFieldCodeStudent.setMaximumSize(new java.awt.Dimension(500, 100));
        jFieldCodeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldCodeStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jFieldCodeStudent, gridBagConstraints);

        jLTelStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLTelStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLTelStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTelStudent.setText("Telefono de contacto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jLTelStudent, gridBagConstraints);

        jTFieldTelStudent.setBackground(new java.awt.Color(255, 255, 255));
        jTFieldTelStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTFieldTelStudent.setForeground(new java.awt.Color(0, 0, 0));
        jTFieldTelStudent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFieldTelStudent.setText("317123");
        jTFieldTelStudent.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jTFieldTelStudent, gridBagConstraints);

        jLEmailStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLEmailStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLEmailStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLEmailStudent.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jLEmailStudent, gridBagConstraints);

        jFieldEmailStudent.setBackground(new java.awt.Color(255, 255, 255));
        jFieldEmailStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldEmailStudent.setForeground(new java.awt.Color(0, 0, 0));
        jFieldEmailStudent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldEmailStudent.setText("lopez@gmail.com");
        jFieldEmailStudent.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jFieldEmailStudent, gridBagConstraints);

        jLPasswordStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLPasswordStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLPasswordStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPasswordStudent.setText("Clave:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jLPasswordStudent, gridBagConstraints);

        jFieldPassWordStudent.setBackground(new java.awt.Color(255, 255, 255));
        jFieldPassWordStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldPassWordStudent.setForeground(new java.awt.Color(0, 0, 0));
        jFieldPassWordStudent.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldPassWordStudent.setText("jPasswordField1");
        jFieldPassWordStudent.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jFieldPassWordStudent, gridBagConstraints);

        jBtnSaveStudent.setBackground(new java.awt.Color(0, 0, 0));
        jBtnSaveStudent.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jBtnSaveStudent.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSaveStudent.setText("GUARDAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPContent.add(jBtnSaveStudent, gridBagConstraints);

        jPButtom.setBackground(new java.awt.Color(236, 230, 240));
        jPButtom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jBtnBackSelectUser.setBackground(new java.awt.Color(236, 230, 240));
        jBtnBackSelectUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicauca/academicprojectsprototype/presentation/Icons/back.png"))); // NOI18N
        jBtnBackSelectUser.setBorderPainted(false);
        jPButtom.add(jBtnBackSelectUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTittleNewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
            .addComponent(jPButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPHead, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTittleNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFieldNameStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldNameStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldNameStudentActionPerformed

    private void jFieldCodeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldCodeStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldCodeStudentActionPerformed

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
            java.util.logging.Logger.getLogger(GUINewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBackSelectUser;
    private javax.swing.JButton jBtnSaveStudent;
    private javax.swing.JTextField jFieldCodeStudent;
    private javax.swing.JTextField jFieldEmailStudent;
    private javax.swing.JTextField jFieldNameStudent;
    private javax.swing.JPasswordField jFieldPassWordStudent;
    private javax.swing.JLabel jLCodeStudent;
    private javax.swing.JLabel jLEmailStudent;
    private javax.swing.JLabel jLNameStudent;
    private javax.swing.JLabel jLPasswordStudent;
    private javax.swing.JLabel jLTelStudent;
    private javax.swing.JLabel jLTittleNewStudent;
    private javax.swing.JPanel jPButtom;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPTittleNewUser;
    private javax.swing.JTextField jTFieldTelStudent;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables
}
