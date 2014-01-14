//Program:        PositiveMaturityApp
//Panel:          Ageny List
//Description:    File controls the Agency List Panel of the application. Additions or changes to the layout and feel
//                of the panel can be made from this file.
//Author:         Jauan Davis
//Revised:        9/09/2013
//Language:       Java
//IDE:            NetBeans 7.2
//************************************************************************************************************
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class AgencyListPanel extends javax.swing.JPanel {
    /**
     * Creates new form AgencyListPanel
     */
    Container guiFrame;
    DatabaseConnection db= new DatabaseConnection();
    
    public AgencyListPanel() {
        initComponents();
        
        agencytable.setModel(db.getagencyTable());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agencytable = new javax.swing.JTable();
        Deletebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewinfobutton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agency List");

        agencytable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        agencytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Street", "City", "Zip", "Phone"
            }
        ));
        agencytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agencytableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(agencytable);

        Deletebutton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Deletebutton.setText("Delete");
        Deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setText("ENHANCE");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setText("EMPOWER");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel4.setText("ENGAGE");

        viewinfobutton.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        viewinfobutton.setText("View Info");
        viewinfobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinfobuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewinfobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewinfobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewinfobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinfobuttonActionPerformed
        // TODO add your handling code here:
        int row = agencytable.getSelectedRow();
        String agencyname = ((String)agencytable.getModel().getValueAt(row,0));
        ViewInfoDialog agencyinfodialog = new ViewInfoDialog(guiFrame,true,agencyname);
        agencyinfodialog.setVisible(true);
        agencyinfodialog.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e) {
                agencytable.setModel(db.getagencyTable());
            }
        });
    }//GEN-LAST:event_viewinfobuttonActionPerformed

    private void DeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebuttonActionPerformed
        // TODO add your handling code here:
        int row = agencytable.getSelectedRow();
        
        agency agen = new agency();
        db.Namesearchquery((String)agencytable.getModel().getValueAt(row,0), agen);
        String output= "Do you want to delete this agency? ";
        output += agen.getName() + ", " + agen.getAgencyID();
        if(JOptionPane.showConfirmDialog(this, output, "Confirm Agency delete?", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION) {
        db.deleteagencyservices(agen);
        db.deleteagency(agen);
        
        agencytable.setModel(db.getagencyTable());
        }
    }//GEN-LAST:event_DeletebuttonActionPerformed

    private void agencytableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agencytableMouseEntered
        // TODO add your handling code here:
        agencytable.setModel(db.getagencyTable());
    }//GEN-LAST:event_agencytableMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebutton;
    private javax.swing.JTable agencytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewinfobutton;
    // End of variables declaration//GEN-END:variables
}
