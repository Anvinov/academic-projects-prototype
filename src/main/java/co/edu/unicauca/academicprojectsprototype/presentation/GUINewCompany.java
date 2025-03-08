/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Sector;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.validateCompany;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;
import javax.swing.JFrame;

/**
 *
 * @author anvig
 */
public class GUINewCompany extends javax.swing.JFrame {
    private ICompanyService companyService;
    
    /**
     * Creates new form GUINewCompany
     */
    public GUINewCompany(ICompanyService service) {
        this.companyService = service;
        initComponents();
        fillSectors();
    }

    
    private void fillSectors(){
        jCBSectorCompany.removeAllItems();
        for(Sector sector: Sector.values()){
            jCBSectorCompany.addItem(sector.toString());
        }
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
        jLTittleNewCompany = new javax.swing.JLabel();
        jPContent = new javax.swing.JPanel();
        jLNitCompany = new javax.swing.JLabel();
        jFieldNitCompany = new javax.swing.JTextField();
        jLNameCompany = new javax.swing.JLabel();
        jFieldNameCompany = new javax.swing.JTextField();
        jLTelCompany = new javax.swing.JLabel();
        jFieldTelCompany = new javax.swing.JTextField();
        jLWebCompany = new javax.swing.JLabel();
        jFieldWebCompany = new javax.swing.JTextField();
        jLSectorCompany = new javax.swing.JLabel();
        jCBSectorCompany = new javax.swing.JComboBox<>();
        jLEmailCompany = new javax.swing.JLabel();
        jFieldEmailCompany = new javax.swing.JTextField();
        jLPasswordCompany = new javax.swing.JLabel();
        jFieldPassWordCompany = new javax.swing.JPasswordField();
        jBtnSaveCompany = new javax.swing.JButton();
        jCheckSeePass = new javax.swing.JCheckBox();
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

        jLTittleNewCompany.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTittleNewCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleNewCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleNewCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NewUser.png"))); // NOI18N
        jLTittleNewCompany.setText("Nueva Empresa");
        jLTittleNewCompany.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPTittleNewUser.add(jLTittleNewCompany);

        jPContent.setBackground(new java.awt.Color(236, 230, 240));
        jPContent.setForeground(new java.awt.Color(0, 0, 0));
        jPContent.setLayout(new java.awt.GridBagLayout());

        jLNitCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLNitCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNitCompany.setText("*NIT:");
        jLNitCompany.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLNitCompany.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLNitCompany, gridBagConstraints);

        jFieldNitCompany.setBackground(new java.awt.Color(255, 255, 255));
        jFieldNitCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldNitCompany.setForeground(new java.awt.Color(0, 0, 0));
        jFieldNitCompany.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldNitCompany.setText("123456789");
        jFieldNitCompany.setToolTipText("");
        jFieldNitCompany.setAutoscrolls(false);
        jFieldNitCompany.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jFieldNitCompany, gridBagConstraints);

        jLNameCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLNameCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLNameCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNameCompany.setText("*Nombre Empresa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLNameCompany, gridBagConstraints);

        jFieldNameCompany.setBackground(new java.awt.Color(255, 255, 255));
        jFieldNameCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldNameCompany.setForeground(new java.awt.Color(0, 0, 0));
        jFieldNameCompany.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldNameCompany.setText("Empresas Lopez");
        jFieldNameCompany.setMaximumSize(new java.awt.Dimension(500, 100));
        jFieldNameCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldNameCompanyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jFieldNameCompany, gridBagConstraints);

        jLTelCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLTelCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLTelCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTelCompany.setText("Telefono de contacto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLTelCompany, gridBagConstraints);

        jFieldTelCompany.setBackground(new java.awt.Color(255, 255, 255));
        jFieldTelCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldTelCompany.setForeground(new java.awt.Color(0, 0, 0));
        jFieldTelCompany.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldTelCompany.setText("31232323");
        jFieldTelCompany.setMaximumSize(new java.awt.Dimension(500, 100));
        jFieldTelCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldTelCompanyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jFieldTelCompany, gridBagConstraints);

        jLWebCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLWebCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLWebCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLWebCompany.setText("Pagina web:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLWebCompany, gridBagConstraints);

        jFieldWebCompany.setBackground(new java.awt.Color(255, 255, 255));
        jFieldWebCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldWebCompany.setForeground(new java.awt.Color(0, 0, 0));
        jFieldWebCompany.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldWebCompany.setText("www.lopez.com");
        jFieldWebCompany.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jFieldWebCompany, gridBagConstraints);

        jLSectorCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLSectorCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLSectorCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLSectorCompany.setText("Sector industrial:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLSectorCompany, gridBagConstraints);

        jCBSectorCompany.setBackground(new java.awt.Color(255, 255, 255));
        jCBSectorCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jCBSectorCompany.setForeground(new java.awt.Color(0, 0, 0));
        jCBSectorCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBSectorCompany.setMaximumSize(new java.awt.Dimension(300, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jCBSectorCompany, gridBagConstraints);

        jLEmailCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLEmailCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLEmailCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLEmailCompany.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLEmailCompany, gridBagConstraints);

        jFieldEmailCompany.setBackground(new java.awt.Color(255, 255, 255));
        jFieldEmailCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldEmailCompany.setForeground(new java.awt.Color(0, 0, 0));
        jFieldEmailCompany.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldEmailCompany.setText("lopez@gmail.com");
        jFieldEmailCompany.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jFieldEmailCompany, gridBagConstraints);

        jLPasswordCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLPasswordCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLPasswordCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPasswordCompany.setText("Clave:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jLPasswordCompany, gridBagConstraints);

        jFieldPassWordCompany.setBackground(new java.awt.Color(255, 255, 255));
        jFieldPassWordCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldPassWordCompany.setForeground(new java.awt.Color(0, 0, 0));
        jFieldPassWordCompany.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldPassWordCompany.setText("Clave123.");
        jFieldPassWordCompany.setMaximumSize(new java.awt.Dimension(500, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPContent.add(jFieldPassWordCompany, gridBagConstraints);

        jBtnSaveCompany.setBackground(new java.awt.Color(0, 0, 0));
        jBtnSaveCompany.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jBtnSaveCompany.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSaveCompany.setText("GUARDAR");
        jBtnSaveCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveCompanyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPContent.add(jBtnSaveCompany, gridBagConstraints);

        jCheckSeePass.setText("Mostrar clave");
        jCheckSeePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSeePassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPContent.add(jCheckSeePass, gridBagConstraints);

        jPButtom.setBackground(new java.awt.Color(236, 230, 240));
        jPButtom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jBtnBackSelectUser.setBackground(new java.awt.Color(236, 230, 240));
        jBtnBackSelectUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jBtnBackSelectUser.setBorderPainted(false);
        jBtnBackSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackSelectUserActionPerformed(evt);
            }
        });
        jPButtom.add(jBtnBackSelectUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTittleNewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
            .addComponent(jPButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPHead, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTittleNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFieldNameCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldNameCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldNameCompanyActionPerformed

    private void jFieldTelCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldTelCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldTelCompanyActionPerformed

    private void jBtnSaveCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveCompanyActionPerformed
        // TODO add your handling code here:
        validateCompany validar = new validateCompany();
        
        String nit = jFieldNitCompany.getText();
        if (nit.equals("")){
            Messages.showMessageDialog("Debe agregar el Nit", "Atención");
            jFieldNitCompany.requestFocus();
            return;
        }
      
        
        String nombre = jFieldNameCompany.getText();
        if (nombre.equals("")){
            Messages.showMessageDialog("Debe agregar el Nombre", "Atención");
            jFieldNameCompany.requestFocus();
            return;
        }
        
        String telefono = jFieldTelCompany.getText();
        String pagina = jFieldWebCompany.getText();
        Sector sector = Sector.values()[jCBSectorCompany.getSelectedIndex()];
        
        String email = jFieldEmailCompany.getText().trim();
        if (email.equals("")){
            Messages.showMessageDialog("Debe agregar el Email", "Atención");
            jFieldEmailCompany.requestFocus();
            return;
        }
        
        String pass = jFieldPassWordCompany.getText().trim();
        if (pass.equals("")){
            Messages.showMessageDialog("Debe agregar la Contraseña", "Atención");
            jFieldPassWordCompany.requestFocus();
            return;
        }
        if(!validar.validarClave(pass)){
            validar.mostrarEjemploClave();
        }
        if(validar.validarRegistroEmpresa(nit, email, telefono, pass)){
        companyService.saveCompany(new Company(nit, nombre, telefono, pagina, sector, email, pass));
        Messages.showMessageDialog("Compañia registrada exitosamente", "Atencion");
        GUIHomeCompany hCompany = new GUIHomeCompany();
        hCompany.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jBtnSaveCompanyActionPerformed

    private void jBtnBackSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackSelectUserActionPerformed
        // TODO add your handling code here:
        GUISelectRegistUser selecU = new GUISelectRegistUser(companyService);
        selecU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnBackSelectUserActionPerformed

    private void jCheckSeePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSeePassActionPerformed
        if (jCheckSeePass.isSelected()) {
        jFieldPassWordCompany.setEchoChar((char) 0); // Mostrar la contraseña
    } else {
        jFieldPassWordCompany.setEchoChar('●'); // Ocultar la contraseña con puntos
    }
    }//GEN-LAST:event_jCheckSeePassActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBackSelectUser;
    private javax.swing.JButton jBtnSaveCompany;
    private javax.swing.JComboBox<String> jCBSectorCompany;
    private javax.swing.JCheckBox jCheckSeePass;
    private javax.swing.JTextField jFieldEmailCompany;
    private javax.swing.JTextField jFieldNameCompany;
    private javax.swing.JTextField jFieldNitCompany;
    private javax.swing.JPasswordField jFieldPassWordCompany;
    private javax.swing.JTextField jFieldTelCompany;
    private javax.swing.JTextField jFieldWebCompany;
    private javax.swing.JLabel jLEmailCompany;
    private javax.swing.JLabel jLNameCompany;
    private javax.swing.JLabel jLNitCompany;
    private javax.swing.JLabel jLPasswordCompany;
    private javax.swing.JLabel jLSectorCompany;
    private javax.swing.JLabel jLTelCompany;
    private javax.swing.JLabel jLTittleNewCompany;
    private javax.swing.JLabel jLWebCompany;
    private javax.swing.JPanel jPButtom;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPTittleNewUser;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables
}
