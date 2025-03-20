/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

import co.edu.unicauca.academicprojectsprototype.access.Factory;
import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.services.IProjectService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ProjectService;
import javax.swing.JOptionPane;

/**
 *
 * @author anvig
 */
public class GUINewProject extends javax.swing.JFrame {

    Company company;
    ProjectService projectService;
    //IProjectRepository repositoryCompany = Factory.getInstance().getRepositoryProject("ARRAY");
    //IProjectService serviceProject = new ProjectService(repositoryCompany);

    /**
     * Creates new form NewProject
     */
    public GUINewProject(Company company) {
        initComponents();
        this.company = company;
        this.projectService = ProjectService.getInstance(null);
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
        jPOpcLogin = new javax.swing.JPanel();
        jBtnLoginU = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();
        jPTitleNewProject = new javax.swing.JPanel();
        jBtnNewPubli = new javax.swing.JButton();
        jPContent = new javax.swing.JPanel();
        jLTitleProject = new javax.swing.JLabel();
        jFieldTitleProject = new javax.swing.JTextField();
        jLDescriptionProject = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripProject = new javax.swing.JTextArea();
        jBtnPubliProject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPHead.setBackground(new java.awt.Color(236, 230, 240));
        jPHead.setForeground(new java.awt.Color(0, 0, 0));
        jPHead.setLayout(new javax.swing.BoxLayout(jPHead, javax.swing.BoxLayout.LINE_AXIS));

        lbTitleProyect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbTitleProyect.setText("Sistema gestor de proyectos academicos");
        jPHead.add(lbTitleProyect);

        jPOpcLogin.setBackground(new java.awt.Color(236, 230, 240));
        jPOpcLogin.setForeground(new java.awt.Color(0, 0, 0));
        jPOpcLogin.setLayout(new java.awt.GridLayout(2, 2, 10, 0));

        jBtnLoginU.setBackground(new java.awt.Color(236, 230, 240));
        jBtnLoginU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LoginUser2.png"))); // NOI18N
        jBtnLoginU.setBorder(null);
        jBtnLoginU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnLoginU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnLoginU.setIconTextGap(5);
        jBtnLoginU.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBtnLoginU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnLoginU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginUActionPerformed(evt);
            }
        });
        jPOpcLogin.add(jBtnLoginU);

        lbLogin.setBackground(new java.awt.Color(101, 85, 153));
        lbLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Mi User");
        lbLogin.setOpaque(true);
        jPOpcLogin.add(lbLogin);

        jPHead.add(jPOpcLogin);

        jPTitleNewProject.setBackground(new java.awt.Color(236, 230, 240));
        jPTitleNewProject.setForeground(new java.awt.Color(0, 0, 0));

        jBtnNewPubli.setBackground(new java.awt.Color(101, 85, 153));
        jBtnNewPubli.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnNewPubli.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewPubli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newPubli.png"))); // NOI18N
        jBtnNewPubli.setText("Nueva publicación");
        jBtnNewPubli.setBorderPainted(false);
        jBtnNewPubli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnNewPubli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnNewPubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewPubliActionPerformed(evt);
            }
        });
        jPTitleNewProject.add(jBtnNewPubli);

        jPContent.setBackground(new java.awt.Color(236, 230, 240));
        jPContent.setLayout(new java.awt.GridBagLayout());

        jLTitleProject.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLTitleProject.setForeground(new java.awt.Color(0, 0, 0));
        jLTitleProject.setText("Titulo del proyecto:");
        jPContent.add(jLTitleProject, new java.awt.GridBagConstraints());

        jFieldTitleProject.setBackground(new java.awt.Color(255, 255, 255));
        jFieldTitleProject.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jFieldTitleProject.setForeground(new java.awt.Color(0, 0, 0));
        jFieldTitleProject.setText("Mi proyecto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPContent.add(jFieldTitleProject, gridBagConstraints);

        jLDescriptionProject.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLDescriptionProject.setForeground(new java.awt.Color(0, 0, 0));
        jLDescriptionProject.setText("Descripción del proyecto: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        jPContent.add(jLDescriptionProject, gridBagConstraints);

        jTextAreaDescripProject.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDescripProject.setColumns(20);
        jTextAreaDescripProject.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextAreaDescripProject.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDescripProject.setLineWrap(true);
        jTextAreaDescripProject.setRows(5);
        jTextAreaDescripProject.setText("Proyecto enfocado en los sitemas gestores academicos\n");
        jScrollPane1.setViewportView(jTextAreaDescripProject);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPContent.add(jScrollPane1, gridBagConstraints);

        jBtnPubliProject.setBackground(new java.awt.Color(255, 255, 255));
        jBtnPubliProject.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jBtnPubliProject.setForeground(new java.awt.Color(0, 0, 0));
        jBtnPubliProject.setText("PUBLICAR ");
        jBtnPubliProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPubliProjectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPContent.add(jBtnPubliProject, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHead, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPTitleNewProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPHead, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTitleNewProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLoginUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnLoginUActionPerformed

    private void jBtnNewPubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewPubliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnNewPubliActionPerformed

    private void jBtnPubliProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPubliProjectActionPerformed
        String titulo = jFieldTitleProject.getText();
        String descripcion = jTextAreaDescripProject.getText();
        
         try {
            projectService.registerProject(titulo, descripcion, company);
            JOptionPane.showMessageDialog(null, "¡Creado satisfactoriamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
         //System.out.println(projectService.getAllProjects());
    }//GEN-LAST:event_jBtnPubliProjectActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLoginU;
    private javax.swing.JButton jBtnNewPubli;
    private javax.swing.JButton jBtnPubliProject;
    private javax.swing.JTextField jFieldTitleProject;
    private javax.swing.JLabel jLDescriptionProject;
    private javax.swing.JLabel jLTitleProject;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPOpcLogin;
    private javax.swing.JPanel jPTitleNewProject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripProject;
    private javax.swing.JLabel lbLogin;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables
}
