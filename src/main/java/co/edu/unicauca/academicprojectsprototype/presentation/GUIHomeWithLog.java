/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

import co.edu.unicauca.academicprojectsprototype.access.Factory;
import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Admin;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICoordinatorService;
import co.edu.unicauca.academicprojectsprototype.domain.services.IProjectService;
import co.edu.unicauca.academicprojectsprototype.domain.services.IStudentService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ProjectService;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;
import co.edu.unicauca.academicprojectsprototype.presentation.admin.Users;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import observer.IObserver;

/**
 *
 * @author lopez
 */
public class GUIHomeWithLog extends javax.swing.JFrame implements IObserver {

    IProjectRepository repositoryCompany = Factory.getInstance().getRepositoryProject("ARRAY");
    IProjectService serviceProject = new ProjectService(repositoryCompany);
    private ProjectService project;
    CardLayout cardLayout;
    private ICompanyService companyService;
    private IStudentService studentService;
    private ICoordinatorService coordiService;
    private String id;
    private String rol;

    /**
     * Creates new form GUIHomeWithLog
     */
    public GUIHomeWithLog(String rol, String id, ICompanyService serviceCompany, IStudentService serviceStudent, ICoordinatorService serviceCoordi) {
        initComponents();
        this.companyService = serviceCompany;
        this.studentService = serviceStudent;
        this.coordiService = serviceCoordi;
        this.id = id;
        this.rol = rol;
        this.project = new ProjectService(repositoryCompany);
        project.addObserver(this);
        cargarRol(rol);
        cargarInfoUser();
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

        jPSideMenu = new javax.swing.JPanel();
        jLTittleMenu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBtnGetOut = new javax.swing.JButton();
        jPContent = new javax.swing.JPanel();
        jPOptions = new javax.swing.JPanel();
        jPOpcionCompany = new javax.swing.JPanel();
        jBtnNewPubli = new javax.swing.JButton();
        jBtnMyPubli = new javax.swing.JButton();
        jPOpcionCoordi = new javax.swing.JPanel();
        jBtnSolicitudes = new javax.swing.JButton();
        jPOpcionStudent = new javax.swing.JPanel();
        jPOpcionAdmin = new javax.swing.JPanel();
        jBtnUsers = new javax.swing.JButton();
        jBtnCoordiSoli = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPPublis = new javax.swing.JPanel();
        jLTitleProjects = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProjects = new javax.swing.JTable();
        jSeparator = new javax.swing.JSeparator();
        jPSearchBar = new javax.swing.JPanel();
        jCBSelecFilter = new javax.swing.JComboBox<>();
        jFieldSearchProyect = new javax.swing.JTextField();
        jBtnSearch = new javax.swing.JButton();
        jPHead = new javax.swing.JPanel();
        lbTitleProyect = new java.awt.Label();
        jPOpcLogin = new javax.swing.JPanel();
        jBtnLoginU = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPSideMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPSideMenu.setLayout(new java.awt.GridBagLayout());

        jLTittleMenu.setBackground(new java.awt.Color(0, 0, 0));
        jLTittleMenu.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLTittleMenu.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleMenu.setText("Menú");
        jLTittleMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPSideMenu.add(jLTittleMenu, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(101, 85, 153));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPSideMenu.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(101, 85, 153));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("jButton2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPSideMenu.add(jButton2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(101, 85, 153));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("jButton3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPSideMenu.add(jButton3, gridBagConstraints);

        jBtnGetOut.setBackground(new java.awt.Color(101, 85, 153));
        jBtnGetOut.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jBtnGetOut.setForeground(new java.awt.Color(255, 255, 255));
        jBtnGetOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Get out.png"))); // NOI18N
        jBtnGetOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGetOutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 100, 0);
        jPSideMenu.add(jBtnGetOut, gridBagConstraints);

        jPContent.setBackground(new java.awt.Color(236, 230, 240));
        jPContent.setForeground(new java.awt.Color(0, 0, 0));

        jPOptions.setBackground(new java.awt.Color(236, 230, 240));
        jPOptions.setForeground(new java.awt.Color(0, 0, 0));
        jPOptions.setLayout(new java.awt.CardLayout());

        jPOpcionCompany.setBackground(new java.awt.Color(236, 230, 240));

        jBtnNewPubli.setBackground(new java.awt.Color(101, 85, 153));
        jBtnNewPubli.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnNewPubli.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewPubli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newPubli.png"))); // NOI18N
        jBtnNewPubli.setText("Nueva publicación");
        jBtnNewPubli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnNewPubli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnNewPubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewPubliActionPerformed(evt);
            }
        });
        jPOpcionCompany.add(jBtnNewPubli);

        jBtnMyPubli.setBackground(new java.awt.Color(101, 85, 153));
        jBtnMyPubli.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnMyPubli.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMyPubli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MyPubli.png"))); // NOI18N
        jBtnMyPubli.setText("Mis publicaciones");
        jBtnMyPubli.setToolTipText("");
        jBtnMyPubli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnMyPubli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPOpcionCompany.add(jBtnMyPubli);

        jPOptions.add(jPOpcionCompany, "Empresa");

        jPOpcionCoordi.setBackground(new java.awt.Color(236, 230, 240));

        jBtnSolicitudes.setBackground(new java.awt.Color(101, 85, 153));
        jBtnSolicitudes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notificacion.png"))); // NOI18N
        jBtnSolicitudes.setText("Solicitudes");
        jBtnSolicitudes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSolicitudes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPOpcionCoordiLayout = new javax.swing.GroupLayout(jPOpcionCoordi);
        jPOpcionCoordi.setLayout(jPOpcionCoordiLayout);
        jPOpcionCoordiLayout.setHorizontalGroup(
            jPOpcionCoordiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(jPOpcionCoordiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPOpcionCoordiLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jBtnSolicitudes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPOpcionCoordiLayout.setVerticalGroup(
            jPOpcionCoordiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPOpcionCoordiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPOpcionCoordiLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jBtnSolicitudes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPOptions.add(jPOpcionCoordi, "Coordinador");

        jPOpcionStudent.setBackground(new java.awt.Color(236, 230, 240));

        javax.swing.GroupLayout jPOpcionStudentLayout = new javax.swing.GroupLayout(jPOpcionStudent);
        jPOpcionStudent.setLayout(jPOpcionStudentLayout);
        jPOpcionStudentLayout.setHorizontalGroup(
            jPOpcionStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        jPOpcionStudentLayout.setVerticalGroup(
            jPOpcionStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPOptions.add(jPOpcionStudent, "Estudiante");

        jPOpcionAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPOpcionAdmin.setForeground(new java.awt.Color(0, 0, 0));
        jPOpcionAdmin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 30));

        jBtnUsers.setText("VER USUARIOS EN EL SISTEMA");
        jBtnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUsersActionPerformed(evt);
            }
        });
        jPOpcionAdmin.add(jBtnUsers);

        jBtnCoordiSoli.setText("GESTION DE COORDINADORES");
        jPOpcionAdmin.add(jBtnCoordiSoli);

        jButton6.setText("jButton6");
        jPOpcionAdmin.add(jButton6);

        jPOptions.add(jPOpcionAdmin, "Admin");

        jPPublis.setBackground(new java.awt.Color(236, 230, 240));
        jPPublis.setLayout(null);

        jLTitleProjects.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLTitleProjects.setForeground(new java.awt.Color(0, 0, 0));
        jLTitleProjects.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitleProjects.setText("Proyectos disponibles");
        jPPublis.add(jLTitleProjects);
        jLTitleProjects.setBounds(0, 0, 854, 50);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

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

        jPPublis.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 854, 260);

        javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
        jPContent.setLayout(jPContentLayout);
        jPContentLayout.setHorizontalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPPublis, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPContentLayout.setVerticalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContentLayout.createSequentialGroup()
                .addComponent(jPOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPPublis, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        );

        jSeparator.setBackground(new java.awt.Color(236, 230, 240));
        jSeparator.setForeground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLoginUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnLoginUActionPerformed

    private void jBtnNewPubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewPubliActionPerformed
        Company company = companyService.search(id);
        GUINewProject newProject = new GUINewProject(company);
        newProject.setVisible(true);
    }//GEN-LAST:event_jBtnNewPubliActionPerformed

    private void jBtnGetOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGetOutActionPerformed
        GUIHomeWithoutLog HomeWithOutLog = new GUIHomeWithoutLog(companyService, studentService, coordiService);
        HomeWithOutLog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnGetOutActionPerformed

    private void jBtnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUsersActionPerformed
        Users user = new Users(companyService, studentService, coordiService);
        user.setVisible(true);
    }//GEN-LAST:event_jBtnUsersActionPerformed

    private void cargarRol(String rol) {
        cardLayout = (CardLayout) jPOptions.getLayout();
        cardLayout.show(jPOptions, rol);
    }

    private void cargarInfoUser() {
        String nombre;
        Messages.showMessageDialog("Se carga el rol de" + rol, id);
        switch (rol) {
            case "Estudiante":
                Student student = studentService.Search(id);
                nombre = student.getName();

                break;
            case "Empresa":
                Company company = companyService.search(id);
                nombre = company.getName();
                break;
            case "Coordinador":
                Coordinator coordi = coordiService.Search(id);
                nombre = coordi.getName();
                break;
            case "Admin":
                Admin admin = Admin.getInstance();
                nombre = admin.getNombre();
                break;
            default:
                throw new AssertionError();
        }

        lbLogin.setText("Bienvenido " + nombre);

    }

    public void fillTableProject() {
        DefaultTableModel modeloProyectos = new DefaultTableModel(new String[]{"Titulo", "descripcion", "Comapañia", "Estudiante encargado"}, 0);
        modeloProyectos.setRowCount(0);

        for (Project project : repositoryCompany.getProjects()) {

            if (project.getStudent() != null && project.getStudent().getName() != null) {
                modeloProyectos.addRow(new Object[]{project.getTitle(), project.getDescription(), project.getCompany().getName(), project.getStudent().getName()});
            } else {
                modeloProyectos.addRow(new Object[]{project.getTitle(), project.getDescription(), project.getCompany().getName(), "no tiene"});
            }
        }
        jTableProjects.setModel(modeloProyectos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCoordiSoli;
    private javax.swing.JButton jBtnGetOut;
    private javax.swing.JButton jBtnLoginU;
    private javax.swing.JButton jBtnMyPubli;
    private javax.swing.JButton jBtnNewPubli;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JButton jBtnSolicitudes;
    private javax.swing.JButton jBtnUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCBSelecFilter;
    private javax.swing.JTextField jFieldSearchProyect;
    private javax.swing.JLabel jLTitleProjects;
    private javax.swing.JLabel jLTittleMenu;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPOpcLogin;
    private javax.swing.JPanel jPOpcionAdmin;
    private javax.swing.JPanel jPOpcionCompany;
    private javax.swing.JPanel jPOpcionCoordi;
    private javax.swing.JPanel jPOpcionStudent;
    private javax.swing.JPanel jPOptions;
    private javax.swing.JPanel jPPublis;
    private javax.swing.JPanel jPSearchBar;
    private javax.swing.JPanel jPSideMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTable jTableProjects;
    private javax.swing.JLabel lbLogin;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        fillTableProject();
    }
}
