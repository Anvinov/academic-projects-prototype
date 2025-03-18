/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Admin;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICoordinatorService;
import co.edu.unicauca.academicprojectsprototype.domain.services.IStudentService;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;

/**
 *
 * @author anvig
 */
public class GUILogIn extends javax.swing.JFrame {

    private ICompanyService companyService;
    private IStudentService studentService;
    private ICoordinatorService coordiService;

    /**
     * Creates new form GUILogIn
     */
    public GUILogIn(ICompanyService serviceCompany, IStudentService studentService, ICoordinatorService coordiService) {
        this.companyService = serviceCompany;
        this.studentService = studentService;
        this.coordiService = coordiService;
        initComponents();
    }

    private String cargarRepositorioRol() {
        String rol = jCBRol.getSelectedItem().toString();
        System.out.println("Se seleccinó el rol de" + rol);
        return rol;
    }

    private boolean authenticateStudent(String id, String pass) {
        Student student = studentService.Search(id);
        if (student != null) {
            if (student.getPassword().equals(pass)) {
                System.out.println("El estudiante " + student.getName() + " sí existe en el sistema");
                return true;
            }
            Messages.showMessageDialog("Clave incorrecta", "Clave incorrecta");
        } else {
            Messages.showMessageDialog("Estudiante no registrado en el sistema", "Estudiante no encontrado");
        }
        return false;
    }

    private boolean authenticateCoordinator(String id, String pass) {
        Coordinator coordinator = coordiService.Search(id);
        if (coordinator != null) {
            if (coordinator.getPassword().equals(pass)) {
                System.out.println("El coordinador " + coordinator.getName() + " sí existe en el sistema");
                return true;
            }
            Messages.showMessageDialog("Clave incorrecta", "Clave incorrecta");
        } else {
            Messages.showMessageDialog("Coordinador no registrado en el sistema", "Coordinador no encontrado");
        }
        return false;
    }

    private boolean authenticateCompany(String id, String pass) {
        Company company = companyService.search(id);
        if (company != null) {
            if (company.getPassword().equals(pass)) {
                System.out.println("La empresa " + company.getName() + " sí existe en el sistema");
                return true;
            }
            Messages.showMessageDialog("Clave incorrecta", "Clave incorrecta");
        } else {
            Messages.showMessageDialog("Empresa no registrada en el sistema", "Empresa no encontrada");
        }
        return false;
    }
    
    private boolean authenticateAdmin(String id, String pass) {
        Admin admin = Admin.getInstance();
        admin.getPassword();
        
        if (admin.getCodigo().equals(id)) {
            if (admin.getPassword().equals(pass)) {
                System.out.println("El admin " + admin.getNombre() + " sí existe en el sistema");
                return true;
            }
            Messages.showMessageDialog("Clave incorrecta", "Clave incorrecta");
        } else {
            Messages.showMessageDialog("Admin no registrado en el sistema", "Admin no encontrada");
        }
        return false;
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
        iconLoginUser = new javax.swing.JLabel();
        jLTitittleLogin = new javax.swing.JLabel();
        jPContent = new javax.swing.JPanel();
        jPFormUser = new javax.swing.JPanel();
        jLUser = new javax.swing.JLabel();
        jFieldUserName = new javax.swing.JTextField();
        jLPassWord = new javax.swing.JLabel();
        jPasswordUser = new javax.swing.JPasswordField();
        jBtnPassUser = new javax.swing.JButton();
        jBtnPasswordForget = new javax.swing.JButton();
        jBtnNewUser = new javax.swing.JButton();
        jPRol = new javax.swing.JPanel();
        jLTitleRol = new javax.swing.JLabel();
        jCBRol = new javax.swing.JComboBox<>();
        jCheckSeePass = new javax.swing.JCheckBox();
        jPButtom = new javax.swing.JPanel();
        jBtnBackHomeWithLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPHead.setBackground(new java.awt.Color(236, 230, 240));
        jPHead.setLayout(new java.awt.GridBagLayout());

        iconLoginUser.setBackground(new java.awt.Color(101, 85, 153));
        iconLoginUser.setForeground(new java.awt.Color(101, 85, 153));
        iconLoginUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LoginUser3.png"))); // NOI18N
        iconLoginUser.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPHead.add(iconLoginUser, gridBagConstraints);

        jLTitittleLogin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLTitittleLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLTitittleLogin.setText("Inicio de Sesion - Sistema proyectos");
        jLTitittleLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLTitittleLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPHead.add(jLTitittleLogin, gridBagConstraints);

        jPContent.setBackground(new java.awt.Color(236, 230, 240));

        jPFormUser.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {250};
        jPFormUser.setLayout(jPanel1Layout);

        jLUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLUser.setForeground(new java.awt.Color(0, 0, 0));
        jLUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLUser.setText("Codigo de usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 10, 10);
        jPFormUser.add(jLUser, gridBagConstraints);

        jFieldUserName.setBackground(new java.awt.Color(255, 255, 255));
        jFieldUserName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jFieldUserName.setForeground(new java.awt.Color(0, 0, 0));
        jFieldUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFieldUserName.setText("104621....");
        jFieldUserName.setMaximumSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPFormUser.add(jFieldUserName, gridBagConstraints);

        jLPassWord.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLPassWord.setForeground(new java.awt.Color(0, 0, 0));
        jLPassWord.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPassWord.setText("Clave:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPFormUser.add(jLPassWord, gridBagConstraints);

        jPasswordUser.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPasswordUser.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordUser.setText("jPasswordField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        jPFormUser.add(jPasswordUser, gridBagConstraints);

        jBtnPassUser.setBackground(new java.awt.Color(0, 0, 0));
        jBtnPassUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jBtnPassUser.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPassUser.setText("INGRESAR");
        jBtnPassUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPassUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPFormUser.add(jBtnPassUser, gridBagConstraints);

        jBtnPasswordForget.setBackground(new java.awt.Color(255, 255, 255));
        jBtnPasswordForget.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jBtnPasswordForget.setForeground(new java.awt.Color(0, 0, 0));
        jBtnPasswordForget.setText("¿Olvidaste la contraseña?");
        jBtnPasswordForget.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPFormUser.add(jBtnPasswordForget, gridBagConstraints);

        jBtnNewUser.setBackground(new java.awt.Color(236, 230, 240));
        jBtnNewUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jBtnNewUser.setForeground(new java.awt.Color(0, 0, 0));
        jBtnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LoginUser2.png"))); // NOI18N
        jBtnNewUser.setText("¿No tienes cuenta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPFormUser.add(jBtnNewUser, gridBagConstraints);

        jPRol.setBackground(new java.awt.Color(255, 255, 255));
        jPRol.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jLTitleRol.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLTitleRol.setForeground(new java.awt.Color(0, 0, 0));
        jLTitleRol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTitleRol.setText("Soy un:");
        jLTitleRol.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLTitleRol.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPRol.add(jLTitleRol);

        jCBRol.setBackground(new java.awt.Color(255, 255, 255));
        jCBRol.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jCBRol.setForeground(new java.awt.Color(0, 0, 0));
        jCBRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Empresa", "Coordinador", "Admin" }));
        jCBRol.setPreferredSize(new java.awt.Dimension(150, 22));
        jPRol.add(jCBRol);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 10);
        jPFormUser.add(jPRol, gridBagConstraints);

        jCheckSeePass.setBackground(new java.awt.Color(255, 255, 255));
        jCheckSeePass.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jCheckSeePass.setForeground(new java.awt.Color(0, 0, 0));
        jCheckSeePass.setText("Ver clave");
        jCheckSeePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSeePassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        jPFormUser.add(jCheckSeePass, gridBagConstraints);

        jPContent.add(jPFormUser);

        jPButtom.setBackground(new java.awt.Color(236, 230, 240));
        jPButtom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jBtnBackHomeWithLogin.setBackground(new java.awt.Color(236, 230, 240));
        jBtnBackHomeWithLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jBtnBackHomeWithLogin.setBorderPainted(false);
        jBtnBackHomeWithLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackHomeWithLoginActionPerformed(evt);
            }
        });
        jPButtom.add(jBtnBackHomeWithLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHead, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
            .addComponent(jPContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPassUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPassUserActionPerformed
        String rol = cargarRepositorioRol();
        String id = jFieldUserName.getText();
        String pass = jPasswordUser.getText();
        System.out.println("Rol pasado" + rol);

        switch (rol) {
            case "Estudiante":
                if (authenticateStudent(id, pass)) {
                    GUIHomeWithLog Home = new GUIHomeWithLog(rol, id, companyService, studentService, coordiService);
                    Home.setVisible(true);
                    this.dispose();
                }
                break;
            case "Empresa":
                if (authenticateCompany(id, pass)) {
                    GUIHomeWithLog Home = new GUIHomeWithLog(rol, id, companyService, studentService, coordiService);
                    Home.setVisible(true);
                    this.dispose();
                }
                break;
            case "Coordinador":
                if (authenticateCoordinator(id, pass)) {
                    GUIHomeWithLog Home = new GUIHomeWithLog(rol, id, companyService, studentService, coordiService);
                    Home.setVisible(true);
                    this.dispose();
                }
                break;
            case "Admin":
                if (authenticateAdmin(id, pass)) {
                    GUIHomeWithLog Home = new GUIHomeWithLog(rol, id, companyService, studentService, coordiService);
                    Home.setVisible(true);
                    this.dispose();
                }
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_jBtnPassUserActionPerformed

    private void jCheckSeePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSeePassActionPerformed
        if (jCheckSeePass.isSelected()) {
            jPasswordUser.setEchoChar((char) 0); // Mostrar la contraseña
        } else {
            jPasswordUser.setEchoChar('*'); // Ocultar la contraseña con puntos
        }
    }//GEN-LAST:event_jCheckSeePassActionPerformed

    private void jBtnBackHomeWithLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackHomeWithLoginActionPerformed
        GUIHomeWithoutLog HomeSinLogin = new GUIHomeWithoutLog(companyService, studentService, coordiService);
        HomeSinLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnBackHomeWithLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLoginUser;
    private javax.swing.JButton jBtnBackHomeWithLogin;
    private javax.swing.JButton jBtnNewUser;
    private javax.swing.JButton jBtnPassUser;
    private javax.swing.JButton jBtnPasswordForget;
    private javax.swing.JComboBox<String> jCBRol;
    private javax.swing.JCheckBox jCheckSeePass;
    private javax.swing.JTextField jFieldUserName;
    private javax.swing.JLabel jLPassWord;
    private javax.swing.JLabel jLTitittleLogin;
    private javax.swing.JLabel jLTitleRol;
    private javax.swing.JLabel jLUser;
    private javax.swing.JPanel jPButtom;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPFormUser;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPRol;
    private javax.swing.JPasswordField jPasswordUser;
    // End of variables declaration//GEN-END:variables
}
