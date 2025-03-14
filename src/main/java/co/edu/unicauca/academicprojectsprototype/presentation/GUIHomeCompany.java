/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.presentation;

/**
 *
 * @author anvig
 */
public class GUIHomeCompany extends javax.swing.JFrame {

    /**
     * Creates new form GUIMenuCompany
     */
    public GUIHomeCompany() {
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
        jBtnLoginU = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();
        jPSearchBar = new javax.swing.JPanel();
        jCBSelecFilter = new javax.swing.JComboBox<>();
        jFieldSearchProyect = new javax.swing.JTextField();
        jBtnSearch = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jPContent = new javax.swing.JPanel();
        jPOptions = new javax.swing.JPanel();
        jBtnNewPubli = new javax.swing.JButton();
        jBtnMyPubli = new javax.swing.JButton();
        jPPublis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPSideMenu = new javax.swing.JPanel();
        jLTittleMenu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBtnGetOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        lbLogin.setText("Mi empresa");
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

        jPOptions.setBackground(new java.awt.Color(236, 230, 240));
        jPOptions.setForeground(new java.awt.Color(0, 0, 0));
        jPOptions.setLayout(new java.awt.GridBagLayout());

        jBtnNewPubli.setBackground(new java.awt.Color(101, 85, 153));
        jBtnNewPubli.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnNewPubli.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNewPubli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newPubli.png"))); // NOI18N
        jBtnNewPubli.setText("Nueva publicación");
        jBtnNewPubli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnNewPubli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPOptions.add(jBtnNewPubli, gridBagConstraints);

        jBtnMyPubli.setBackground(new java.awt.Color(101, 85, 153));
        jBtnMyPubli.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnMyPubli.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMyPubli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MyPubli.png"))); // NOI18N
        jBtnMyPubli.setText("Mis publicaciones");
        jBtnMyPubli.setToolTipText("");
        jBtnMyPubli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnMyPubli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPOptions.add(jBtnMyPubli, new java.awt.GridBagConstraints());

        jPPublis.setBackground(new java.awt.Color(236, 230, 240));
        jPPublis.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PUBLICACIONES AQUI");
        jPPublis.add(jLabel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
        jPContent.setLayout(jPContentLayout);
        jPContentLayout.setHorizontalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPOptions, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addComponent(jPPublis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPContentLayout.setVerticalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContentLayout.createSequentialGroup()
                .addComponent(jPOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPPublis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 100, 0);
        jPSideMenu.add(jBtnGetOut, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
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
                    .addComponent(jPSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLoginUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnLoginUActionPerformed

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
            java.util.logging.Logger.getLogger(GUIHomeCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHomeCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHomeCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHomeCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIHomeCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGetOut;
    private javax.swing.JButton jBtnLoginU;
    private javax.swing.JButton jBtnMyPubli;
    private javax.swing.JButton jBtnNewPubli;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBSelecFilter;
    private javax.swing.JTextField jFieldSearchProyect;
    private javax.swing.JLabel jLTittleMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHead;
    private javax.swing.JPanel jPOpcLogin;
    private javax.swing.JPanel jPOptions;
    private javax.swing.JPanel jPPublis;
    private javax.swing.JPanel jPSearchBar;
    private javax.swing.JPanel jPSideMenu;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lbLogin;
    private java.awt.Label lbTitleProyect;
    // End of variables declaration//GEN-END:variables
}
