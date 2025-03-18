/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

import co.edu.unicauca.academicprojectsprototype.domain.services.ICompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICoordinatorService;
import co.edu.unicauca.academicprojectsprototype.domain.services.IStudentService;

/**
 *
 * @author anvig
 */
public class GUIHomeWithoutLog extends javax.swing.JFrame {

    private ICompanyService companyService;
    private IStudentService studentService;
    private ICoordinatorService coordiService;
    /**
     * Creates new form GUIMenuWithoutLog
     */
    public GUIHomeWithoutLog(ICompanyService serviceCompany,IStudentService studentService,ICoordinatorService coordiService) {
        this.companyService = serviceCompany;
        this.studentService = studentService;
        this.coordiService = coordiService;
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
        jPOpcLogin = new javax.swing.JPanel();
        jBtnNewUser = new javax.swing.JButton();
        jBtnLoginU = new javax.swing.JButton();
        lbNewUser = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        jPSearchBar = new javax.swing.JPanel();
        jCBSelecFilter = new javax.swing.JComboBox<>();
        jFieldSearchProyect = new javax.swing.JTextField();
        jBtnSearch = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jPContent = new javax.swing.JPanel();
        jLTittleProjects = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProjects = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema GPACA");
        setBackground(new java.awt.Color(236, 230, 240));

        jPHead.setBackground(new java.awt.Color(236, 230, 240));
        jPHead.setForeground(new java.awt.Color(0, 0, 0));
        jPHead.setLayout(new javax.swing.BoxLayout(jPHead, javax.swing.BoxLayout.LINE_AXIS));

        lbTitleProyect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbTitleProyect.setText("Sistema gestor de proyectos academicos");
        jPHead.add(lbTitleProyect);

        jPOpcLogin.setBackground(new java.awt.Color(236, 230, 240));
        jPOpcLogin.setForeground(new java.awt.Color(0, 0, 0));
        jPOpcLogin.setLayout(new java.awt.GridLayout(2, 2, 10, 0));

        jBtnNewUser.setBackground(new java.awt.Color(236, 230, 240));
        jBtnNewUser.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jBtnNewUser.setForeground(new java.awt.Color(0, 0, 0));
        jBtnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NewUser.png"))); // NOI18N
        jBtnNewUser.setToolTipText("");
        jBtnNewUser.setBorder(null);
        jBtnNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnNewUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnNewUser.setOpaque(true);
        jBtnNewUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBtnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewUserActionPerformed(evt);
            }
        });
        jPOpcLogin.add(jBtnNewUser);

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

        lbNewUser.setBackground(new java.awt.Color(101, 85, 153));
        lbNewUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbNewUser.setForeground(new java.awt.Color(255, 255, 255));
        lbNewUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNewUser.setText("¿ Nuevo usuario ?");
        lbNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNewUser.setOpaque(true);
        jPOpcLogin.add(lbNewUser);

        lbLogin.setBackground(new java.awt.Color(101, 85, 153));
        lbLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Iniciar Sesion");
        lbLogin.setOpaque(true);
        jPOpcLogin.add(lbLogin);

        jPHead.add(jPOpcLogin);

        jPSearchBar.setBackground(new java.awt.Color(236, 230, 240));
        jPSearchBar.setForeground(new java.awt.Color(0, 0, 0));
        jPSearchBar.setLayout(new java.awt.GridBagLayout());

        jCBSelecFilter.setBackground(new java.awt.Color(236, 230, 240));
        jCBSelecFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro 1", "Filtro 2", "Filtro3" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPSearchBar.add(jCBSelecFilter, gridBagConstraints);

        jFieldSearchProyect.setBackground(new java.awt.Color(236, 230, 240));
        jFieldSearchProyect.setText("Ingrese un proyecto a buscar...");
        jFieldSearchProyect.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        jFieldSearchProyect.setMinimumSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 300;
        jPSearchBar.add(jFieldSearchProyect, gridBagConstraints);

        jBtnSearch.setBackground(new java.awt.Color(236, 230, 240));
        jBtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        jBtnSearch.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPSearchBar.add(jBtnSearch, gridBagConstraints);

        jSeparator.setBackground(new java.awt.Color(236, 230, 240));
        jSeparator.setForeground(new java.awt.Color(204, 204, 204));

        jPContent.setBackground(new java.awt.Color(236, 230, 240));
        jPContent.setForeground(new java.awt.Color(0, 0, 0));
        jPContent.setLayout(null);

        jLTittleProjects.setBackground(new java.awt.Color(236, 230, 240));
        jLTittleProjects.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLTittleProjects.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleProjects.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleProjects.setText("Proyectos disponibles");
        jLTittleProjects.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPContent.add(jLTittleProjects);
        jLTittleProjects.setBounds(0, 0, 840, 70);

        jTableProjects.setBackground(new java.awt.Color(255, 255, 255));
        jTableProjects.setForeground(new java.awt.Color(0, 0, 0));
        jTableProjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProjects);

        jPContent.add(jScrollPane1);
        jScrollPane1.setBounds(2, 60, 860, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHead, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
            .addComponent(jPSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPHead, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewUserActionPerformed
        // TODO add your handling code here:
        //GUISelectRegistUser selecU = new GUISelectRegistUser(companyService);
        GUIRegisteredUser selecU = new GUIRegisteredUser(companyService,studentService,coordiService);
        selecU.setVisible(true);
        this.dispose();
        
 
    }//GEN-LAST:event_jBtnNewUserActionPerformed

    private void jBtnLoginUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnLoginUActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLoginU;
    private javax.swing.JButton jBtnNewUser;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JComboBox<String> jCBSelecFilter;
    private javax.swing.JTextField jFieldSearchProyect;
    private javax.swing.JLabel jLTittleProjects;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPOpcLogin;
    private javax.swing.JPanel jPSearchBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTable jTableProjects;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbNewUser;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables
}
