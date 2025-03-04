/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

/**
 *
 * @author anvig
 */
public class GUISelectRegistUser extends javax.swing.JFrame {

    /**
     * Creates new form GUIMenuWithoutLog
     */
    public GUISelectRegistUser() {
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

        jPHead = new javax.swing.JPanel();
        lbTitleProyect = new java.awt.Label();
        jPTittleNewUser = new javax.swing.JPanel();
        jLTittleNewUser = new javax.swing.JLabel();
        jPContent = new javax.swing.JPanel();
        jPCardNewCompany = new javax.swing.JPanel();
        jLTittleNewCompany = new javax.swing.JLabel();
        imgNewCompany = new javax.swing.JLabel();
        jLDesciptionNewCompany = new javax.swing.JLabel();
        jBtnNewCompany = new javax.swing.JButton();
        jPCardNewStudent = new javax.swing.JPanel();
        jLtTittleNewStudent = new javax.swing.JLabel();
        imgNewStudent = new javax.swing.JLabel();
        jLSDescriptionNewStudent = new javax.swing.JLabel();
        jBtnNewUStudent = new javax.swing.JButton();
        jPCardNewCoordi = new javax.swing.JPanel();
        jLTittleNewCoordi = new javax.swing.JLabel();
        imgNewCoordi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDescriptionNewCoordi = new javax.swing.JTextArea();
        jBtnNewCoordi = new javax.swing.JButton();
        jPButtom = new javax.swing.JPanel();
        jBtnBackHomeWithLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema GPACA");
        setBackground(new java.awt.Color(236, 230, 240));

        jPHead.setBackground(new java.awt.Color(236, 230, 240));
        jPHead.setForeground(new java.awt.Color(0, 0, 0));
        jPHead.setLayout(new javax.swing.BoxLayout(jPHead, javax.swing.BoxLayout.LINE_AXIS));

        lbTitleProyect.setAlignment(java.awt.Label.CENTER);
        lbTitleProyect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbTitleProyect.setText("Sistema gestor de proyectos academicos");
        jPHead.add(lbTitleProyect);

        jPTittleNewUser.setBackground(new java.awt.Color(255, 255, 255));

        jLTittleNewUser.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTittleNewUser.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleNewUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicauca/academicprojectsprototype/presentation/Icons/NewUser.png"))); // NOI18N
        jLTittleNewUser.setText("NUEVO USUARIO");
        jLTittleNewUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPTittleNewUser.add(jLTittleNewUser);

        jPContent.setBackground(new java.awt.Color(204, 204, 204));
        jPContent.setForeground(new java.awt.Color(0, 0, 0));
        jPContent.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jPCardNewCompany.setBackground(new java.awt.Color(236, 230, 240));
        jPCardNewCompany.setLayout(new java.awt.GridLayout(4, 1));

        jLTittleNewCompany.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLTittleNewCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleNewCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleNewCompany.setText("NUEVA EMPRESA");
        jPCardNewCompany.add(jLTittleNewCompany);

        imgNewCompany.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        imgNewCompany.setText("Imagen empresa");
        jPCardNewCompany.add(imgNewCompany);

        jLDesciptionNewCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLDesciptionNewCompany.setForeground(new java.awt.Color(0, 0, 0));
        jLDesciptionNewCompany.setText("Empresas que necesiten publicar sus proyectos");
        jPCardNewCompany.add(jLDesciptionNewCompany);

        jBtnNewCompany.setBackground(new java.awt.Color(101, 85, 153));
        jBtnNewCompany.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jBtnNewCompany.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewCompany.setText("REGISTRAR EMPRESA");
        jPCardNewCompany.add(jBtnNewCompany);

        jPContent.add(jPCardNewCompany);

        jPCardNewStudent.setBackground(new java.awt.Color(236, 230, 240));
        jPCardNewStudent.setForeground(new java.awt.Color(0, 0, 0));
        jPCardNewStudent.setLayout(new java.awt.GridLayout(4, 1));

        jLtTittleNewStudent.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLtTittleNewStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLtTittleNewStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtTittleNewStudent.setText("NUEVO ESTUDIANTE");
        jPCardNewStudent.add(jLtTittleNewStudent);

        imgNewStudent.setText("Imagen Estudiante");
        jPCardNewStudent.add(imgNewStudent);

        jLSDescriptionNewStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLSDescriptionNewStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLSDescriptionNewStudent.setText("Estudiantes que deseen postularse a proyectos");
        jPCardNewStudent.add(jLSDescriptionNewStudent);

        jBtnNewUStudent.setBackground(new java.awt.Color(101, 85, 153));
        jBtnNewUStudent.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewUStudent.setText("REGISTRAR ESTUDIANTE");
        jPCardNewStudent.add(jBtnNewUStudent);

        jPContent.add(jPCardNewStudent);

        jPCardNewCoordi.setBackground(new java.awt.Color(236, 230, 240));
        jPCardNewCoordi.setForeground(new java.awt.Color(0, 0, 0));
        jPCardNewCoordi.setLayout(new java.awt.GridLayout(4, 1));

        jLTittleNewCoordi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLTittleNewCoordi.setForeground(new java.awt.Color(0, 0, 0));
        jLTittleNewCoordi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTittleNewCoordi.setText("NUEVO COORDINADOR");
        jPCardNewCoordi.add(jLTittleNewCoordi);

        imgNewCoordi.setText("IMAGEN COORDI");
        jPCardNewCoordi.add(imgNewCoordi);

        jTDescriptionNewCoordi.setEditable(false);
        jTDescriptionNewCoordi.setBackground(new java.awt.Color(236, 230, 240));
        jTDescriptionNewCoordi.setColumns(20);
        jTDescriptionNewCoordi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTDescriptionNewCoordi.setForeground(new java.awt.Color(0, 0, 0));
        jTDescriptionNewCoordi.setLineWrap(true);
        jTDescriptionNewCoordi.setRows(5);
        jTDescriptionNewCoordi.setText("Coordinador que desee gestionar la asignación del estudiante a proyectos. Necesita la validación del administrador para la creación exitosa de la cuenta.");
        jScrollPane1.setViewportView(jTDescriptionNewCoordi);

        jPCardNewCoordi.add(jScrollPane1);

        jBtnNewCoordi.setBackground(new java.awt.Color(101, 85, 153));
        jBtnNewCoordi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jBtnNewCoordi.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewCoordi.setText("REGISTRAR COORDINADOR");
        jPCardNewCoordi.add(jBtnNewCoordi);

        jPContent.add(jPCardNewCoordi);

        jPButtom.setBackground(new java.awt.Color(236, 230, 240));
        jPButtom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jBtnBackHomeWithLog.setBackground(new java.awt.Color(236, 230, 240));
        jBtnBackHomeWithLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicauca/academicprojectsprototype/presentation/Icons/back.png"))); // NOI18N
        jBtnBackHomeWithLog.setBorderPainted(false);
        jPButtom.add(jBtnBackHomeWithLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
            .addComponent(jPTittleNewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPButtom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(GUISelectRegistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISelectRegistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISelectRegistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISelectRegistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISelectRegistUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgNewCompany;
    private javax.swing.JLabel imgNewCoordi;
    private javax.swing.JLabel imgNewStudent;
    private javax.swing.JButton jBtnBackHomeWithLog;
    private javax.swing.JButton jBtnNewCompany;
    private javax.swing.JButton jBtnNewCoordi;
    private javax.swing.JButton jBtnNewUStudent;
    private javax.swing.JLabel jLDesciptionNewCompany;
    private javax.swing.JLabel jLSDescriptionNewStudent;
    private javax.swing.JLabel jLTittleNewCompany;
    private javax.swing.JLabel jLTittleNewCoordi;
    private javax.swing.JLabel jLTittleNewUser;
    private javax.swing.JLabel jLtTittleNewStudent;
    private javax.swing.JPanel jPButtom;
    private javax.swing.JPanel jPCardNewCompany;
    private javax.swing.JPanel jPCardNewCoordi;
    private javax.swing.JPanel jPCardNewStudent;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPTittleNewUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTDescriptionNewCoordi;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables
}
