
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jauan Davis2
 */
public class ViewInfoDialog extends javax.swing.JDialog {

    /**
     * Creates new form ViewInfoDialog
     */
    Container guiframe;
    DatabaseConnection db= new DatabaseConnection();
    public ViewInfoDialog(java.awt.Frame parent, boolean modal,String agencyname) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        eligibilitytxtarea.setLineWrap(true);
        missionstatementtxtarea.setLineWrap(true);
        serviceaddbutton.setVisible(false);
        updateinformationbutton.setVisible(false);
        
        agency a= new agency();
        db.Namesearchquery(agencyname, a);
        servicelisttable.setModel(db.AgencyServices(agencyname));
        nametxtbox.setText(a.getName());
        streettxtbox.setText(a.getStreet());
        citytxtbox.setText(a.getCity());
        ziptxtbox.setText(a.getZip());
        phonetxtbox.setText(a.getAgencyphone());
        websitetxtbox.setText(a.getWebsite());
        contactpersontxtbox.setText(a.getContactperson());
        emailtxtbox.setText(a.getEmail());
        faxtxtbox.setText(a.getFax());
        eligibilitytxtarea.setText(a.getEligibility());
        missionstatementtxtarea.setText(a.getMissionstatement());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nametxtbox = new javax.swing.JTextField();
        streettxtbox = new javax.swing.JTextField();
        citytxtbox = new javax.swing.JTextField();
        ziptxtbox = new javax.swing.JTextField();
        phonetxtbox = new javax.swing.JTextField();
        websitetxtbox = new javax.swing.JTextField();
        contactpersontxtbox = new javax.swing.JTextField();
        emailtxtbox = new javax.swing.JTextField();
        faxtxtbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        eligibilitytxtarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        missionstatementtxtarea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        servicelisttable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Updateinfobutton = new javax.swing.JButton();
        serviceaddbutton = new javax.swing.JButton();
        updateinformationbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 27)); // NOI18N
        jLabel1.setText("Agency Information");

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

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Contact Person:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Email:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Fax:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("Eligibility:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("Service Description:");

        nametxtbox.setEditable(false);
        nametxtbox.setBorder(null);

        streettxtbox.setEditable(false);
        streettxtbox.setBorder(null);

        citytxtbox.setEditable(false);
        citytxtbox.setBorder(null);

        ziptxtbox.setEditable(false);
        ziptxtbox.setBorder(null);
        ziptxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ziptxtboxActionPerformed(evt);
            }
        });

        phonetxtbox.setEditable(false);
        phonetxtbox.setBorder(null);
        phonetxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtboxActionPerformed(evt);
            }
        });

        websitetxtbox.setEditable(false);
        websitetxtbox.setForeground(java.awt.Color.blue);
        websitetxtbox.setBorder(null);
        websitetxtbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                websitetxtboxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                websitetxtboxMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                websitetxtboxMouseClicked(evt);
            }
        });
        websitetxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                websitetxtboxActionPerformed(evt);
            }
        });

        contactpersontxtbox.setEditable(false);
        contactpersontxtbox.setBorder(null);

        emailtxtbox.setEditable(false);
        emailtxtbox.setBorder(null);

        faxtxtbox.setEditable(false);
        faxtxtbox.setBorder(null);

        eligibilitytxtarea.setEditable(false);
        eligibilitytxtarea.setColumns(20);
        eligibilitytxtarea.setRows(5);
        jScrollPane1.setViewportView(eligibilitytxtarea);

        missionstatementtxtarea.setEditable(false);
        missionstatementtxtarea.setColumns(20);
        missionstatementtxtarea.setRows(5);
        jScrollPane2.setViewportView(missionstatementtxtarea);

        servicelisttable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(servicelisttable);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("ENHANCE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setText("EMPOWER");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("ENGAGE");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Services Provided:");

        Updateinfobutton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Updateinfobutton.setText("Update Info");
        Updateinfobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateinfobuttonActionPerformed(evt);
            }
        });

        serviceaddbutton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        serviceaddbutton.setText("Update Services");
        serviceaddbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceaddbuttonActionPerformed(evt);
            }
        });

        updateinformationbutton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        updateinformationbutton.setText("Update Information");
        updateinformationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinformationbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Updateinfobutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateinformationbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(citytxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(emailtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(faxtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ziptxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jLabel3)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(phonetxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nametxtbox, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                                        .addComponent(streettxtbox)))))
                                        .addGap(0, 53, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(websitetxtbox)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceaddbutton)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactpersontxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nametxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(streettxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(citytxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ziptxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(phonetxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(websitetxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(contactpersontxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(emailtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(faxtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 53, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Updateinfobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateinformationbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serviceaddbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void websitetxtboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_websitetxtboxMouseClicked
       if(Updateinfobutton.isVisible()){
        try {
            // TODO add your handling code here:
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(websitetxtbox.getText()));
        } catch (IOException ex) {
            Logger.getLogger(ViewInfoDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
       }//end if statement
    }//GEN-LAST:event_websitetxtboxMouseClicked

    private void websitetxtboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_websitetxtboxMouseEntered
        // TODO add your handling code here:
        if(Updateinfobutton.isVisible()){
         Font font1= new Font("Tahoma", Font.BOLD, 13);
        websitetxtbox.setFont(font1);
        }
        
    }//GEN-LAST:event_websitetxtboxMouseEntered

    private void websitetxtboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_websitetxtboxMouseExited
        // TODO add your handling code here:
        if(Updateinfobutton.isVisible()){
        Font font2= new Font("Tahoma",Font.PLAIN,13);
        websitetxtbox.setFont(font2);
        }
    }//GEN-LAST:event_websitetxtboxMouseExited

    private void UpdateinfobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateinfobuttonActionPerformed
        // TODO add your handling code here:
        serviceaddbutton.setVisible(true);
        Updateinfobutton.setVisible(false);
        updateinformationbutton.setVisible(true);
        
        nametxtbox.setEditable(true);
        streettxtbox.setEditable(true);
        citytxtbox.setEditable(true);
        ziptxtbox.setEditable(true);
        phonetxtbox.setEditable(true);
        websitetxtbox.setEditable(true);
        websitetxtbox.setForeground(Color.BLACK);
        contactpersontxtbox.setEditable(true);
        emailtxtbox.setEditable(true);
        faxtxtbox.setEditable(true);
        eligibilitytxtarea.setEditable(true);
        missionstatementtxtarea.setEditable(true);
        
        
    }//GEN-LAST:event_UpdateinfobuttonActionPerformed

    private void serviceaddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceaddbuttonActionPerformed
        // TODO add your handling code here:
        agency a=new agency();
        db.Namesearchquery(nametxtbox.getText(), a);
        ServiceAddDialog addservice = new ServiceAddDialog(guiframe,true,a);
        addservice.setVisible(true);
        addservice.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e) {
                servicelisttable.setModel(db.AgencyServices(nametxtbox.getText()));
            }
        });
    }//GEN-LAST:event_serviceaddbuttonActionPerformed

    private void phonetxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtboxActionPerformed

    private void updateinformationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinformationbuttonActionPerformed
        // TODO add your handling code here:
        agency agen= new agency();
        agen.setName(nametxtbox.getText());
        agen.setStreet(streettxtbox.getText());
        agen.setCity(citytxtbox.getText());
        agen.setZip(ziptxtbox.getText());
        agen.setAgencyphone(phonetxtbox.getText());
        agen.setContactperson(contactpersontxtbox.getText());
        agen.setEligibility(eligibilitytxtarea.getText());
        agen.setMissionstatement(missionstatementtxtarea.getText());
        agen.setFax(faxtxtbox.getText());
        agen.setWebsite(websitetxtbox.getText());
        agen.setEmail(emailtxtbox.getText());

        String output = "Continue with update of "+agen.getName()+ "'s information on the server?";
        if(JOptionPane.showConfirmDialog(this, output, "Database Update", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
            db.updateagency(agen);
            serviceaddbutton.setVisible(false);
            updateinformationbutton.setVisible(false);
            Updateinfobutton.setVisible(true);
            
            servicelisttable.setModel(db.AgencyServices(nametxtbox.getText()));
            nametxtbox.setText(agen.getName());
            streettxtbox.setText(agen.getStreet());
            citytxtbox.setText(agen.getCity());
            ziptxtbox.setText(agen.getZip());
            phonetxtbox.setText(agen.getAgencyphone());
            websitetxtbox.setText(agen.getWebsite());
            contactpersontxtbox.setText(agen.getContactperson());
            emailtxtbox.setText(agen.getEmail());
            faxtxtbox.setText(agen.getFax());
            eligibilitytxtarea.setText(agen.getEligibility());
            missionstatementtxtarea.setText(agen.getMissionstatement());
            
            serviceaddbutton.setVisible(false);
            updateinformationbutton.setVisible(false);
            nametxtbox.setEditable(false);
            streettxtbox.setEditable(false);
            citytxtbox.setEditable(false);
            ziptxtbox.setEditable(false);
            phonetxtbox.setEditable(false);
            websitetxtbox.setEditable(false);
            websitetxtbox.setForeground(Color.BLUE);
            contactpersontxtbox.setEditable(false);
            emailtxtbox.setEditable(false);
            faxtxtbox.setEditable(false);
            eligibilitytxtarea.setEditable(false);
            missionstatementtxtarea.setEditable(false);
        }
    }//GEN-LAST:event_updateinformationbuttonActionPerformed

    private void ziptxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ziptxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ziptxtboxActionPerformed

    private void websitetxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_websitetxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_websitetxtboxActionPerformed

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
            java.util.logging.Logger.getLogger(ViewInfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewInfoDialog dialog = new ViewInfoDialog(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JButton Updateinfobutton;
    private javax.swing.JTextField citytxtbox;
    private javax.swing.JTextField contactpersontxtbox;
    private javax.swing.JTextArea eligibilitytxtarea;
    private javax.swing.JTextField emailtxtbox;
    private javax.swing.JTextField faxtxtbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextArea missionstatementtxtarea;
    private javax.swing.JTextField nametxtbox;
    private javax.swing.JTextField phonetxtbox;
    private javax.swing.JButton serviceaddbutton;
    private javax.swing.JTable servicelisttable;
    private javax.swing.JTextField streettxtbox;
    private javax.swing.JButton updateinformationbutton;
    private javax.swing.JTextField websitetxtbox;
    private javax.swing.JTextField ziptxtbox;
    // End of variables declaration//GEN-END:variables
}
