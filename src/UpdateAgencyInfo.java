
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jauan Davis2
 */
public class UpdateAgencyInfo extends javax.swing.JDialog {

    /**
     * Creates new form UpdateAgencyInfo
     */
    DatabaseConnection db= new DatabaseConnection();
    String agencyname;
    Container guiFrame;
    public UpdateAgencyInfo(java.awt.Frame parent, boolean modal, String s) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        eligibilitytextarea.setLineWrap(true);
        missionstatementtxtarea.setLineWrap(true);
        
        agency a= new agency();
        db.Namesearchquery(s, a);
        nametxtfield.setText(a.getName());
        agencyname=s;
        streettxtfield.setText(a.getStreet());
        citytxtfield.setText(a.getCity());
        ziptxtfield.setText(a.getZip());
        phonetxtfield.setText(a.getAgencyphone());
        websitetxtfield.setText(a.getWebsite());
        contactpersontxtfield.setText(a.getContactperson());
        emailtxtfield.setText(a.getEmail());
        faxtxtfield.setText(a.getFax());
       eligibilitytextarea.setText(a.getEligibility());
        missionstatementtxtarea.setText(a.getMissionstatement());  
        
        servicelisttable.setModel(db.AgencyServices(s));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nametxtfield = new javax.swing.JTextField();
        streettxtfield = new javax.swing.JTextField();
        citytxtfield = new javax.swing.JTextField();
        ziptxtfield = new javax.swing.JTextField();
        phonetxtfield = new javax.swing.JTextField();
        websitetxtfield = new javax.swing.JTextField();
        contactpersontxtfield = new javax.swing.JTextField();
        emailtxtfield = new javax.swing.JTextField();
        faxtxtfield = new javax.swing.JTextField();
        updateinformationbutton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        missionstatementtxtarea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        servicelisttable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        eligibilitytextarea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        serviceaddbutton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 27)); // NOI18N
        jLabel1.setText("Update Agency Information");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Street:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("City:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Zip:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Website:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Contact Person:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Fax:");

        nametxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        streettxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        citytxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        ziptxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        phonetxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        websitetxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        contactpersontxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        emailtxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        faxtxtfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        updateinformationbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateinformationbutton.setText("Update Information");
        updateinformationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinformationbuttonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel12.setText("EMPOWER");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel13.setText("ENHANCE");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel14.setText("ENGAGE");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Eligibility:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Service Description:");

        missionstatementtxtarea.setColumns(20);
        missionstatementtxtarea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        missionstatementtxtarea.setRows(5);
        jScrollPane1.setViewportView(missionstatementtxtarea);

        servicelisttable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        servicelisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Services"
            }
        ));
        jScrollPane3.setViewportView(servicelisttable);

        eligibilitytextarea.setColumns(20);
        eligibilitytextarea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        eligibilitytextarea.setRows(5);
        jScrollPane4.setViewportView(eligibilitytextarea);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Services Provided:");

        serviceaddbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        serviceaddbutton.setText("Update Services");
        serviceaddbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceaddbuttonActionPerformed(evt);
            }
        });

        RefreshButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(streettxtfield))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ziptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(citytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phonetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nametxtfield)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(serviceaddbutton)
                                    .addGap(18, 18, 18)
                                    .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(websitetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faxtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactpersontxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(updateinformationbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(streettxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(citytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ziptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(phonetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(websitetxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceaddbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(contactpersontxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(emailtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(faxtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateinformationbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateinformationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinformationbuttonActionPerformed
        // TODO add your handling code here:
        agency agen= new agency();
        agen.setName(nametxtfield.getText());
        agen.setStreet(streettxtfield.getText());
        agen.setCity(citytxtfield.getText());
        agen.setZip(ziptxtfield.getText());
        agen.setAgencyphone(phonetxtfield.getText());
        agen.setContactperson(contactpersontxtfield.getText());
        agen.setEligibility(eligibilitytextarea.getText());
        agen.setMissionstatement(missionstatementtxtarea.getText());
        agen.setFax(faxtxtfield.getText());
        agen.setWebsite(websitetxtfield.getText());
        agen.setEmail(emailtxtfield.getText());
        
        String output = "Update Agency Info:";
        if(JOptionPane.showConfirmDialog(this, output, "Continue updating "+agen.getName()+ "'s information in the system?", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
            db.updateagency(agen);
            this.setVisible(false);
        }
    }//GEN-LAST:event_updateinformationbuttonActionPerformed

    private void serviceaddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceaddbuttonActionPerformed
        // TODO add your handling code here:
        agency a=new agency();
        db.Namesearchquery(nametxtfield.getText(), a);
        ServiceAddDialog addservice = new ServiceAddDialog(guiFrame,true,a);
        addservice.setVisible(true);
    }//GEN-LAST:event_serviceaddbuttonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        // TODO add your handling code here:
        servicelisttable.setModel(db.AgencyServices(agencyname));
    }//GEN-LAST:event_RefreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAgencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAgencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAgencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAgencyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateAgencyInfo dialog = new UpdateAgencyInfo(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JButton RefreshButton;
    private javax.swing.JTextField citytxtfield;
    private javax.swing.JTextField contactpersontxtfield;
    private javax.swing.JTextArea eligibilitytextarea;
    private javax.swing.JTextField emailtxtfield;
    private javax.swing.JTextField faxtxtfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea missionstatementtxtarea;
    private javax.swing.JTextField nametxtfield;
    private javax.swing.JTextField phonetxtfield;
    private javax.swing.JButton serviceaddbutton;
    private javax.swing.JTable servicelisttable;
    private javax.swing.JTextField streettxtfield;
    private javax.swing.JButton updateinformationbutton;
    private javax.swing.JTextField websitetxtfield;
    private javax.swing.JTextField ziptxtfield;
    // End of variables declaration//GEN-END:variables
}
