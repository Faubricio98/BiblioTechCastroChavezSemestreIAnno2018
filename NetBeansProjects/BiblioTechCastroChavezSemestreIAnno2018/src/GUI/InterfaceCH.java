/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import data.aStudent;
import domain.Student;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import GUI.InterfaceST;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InterfaceCH extends javax.swing.JFrame {
    InterfaceST st= new InterfaceST();
    DefaultTableModel miModel;
    Student open;
    aStudent aS;
    String[] headboard={"NAME","CARNET","CAREER","YEAR OF INCOME"};
    String[][] data={};
    
    
    public InterfaceCH() {
        initComponents();
        setLocationRelativeTo(null);
        miModel = new DefaultTableModel(data,headboard);
        jtable.setModel(miModel);
        aS = new aStudent();
        loadData();
        update();
        jButtonBooks.setVisible(false);
        jButtonAudiovisuals.setVisible(false);
    }
    
    
    public void loadData()
    {
        try{
            FileInputStream fis = new FileInputStream("Student.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            if(in != null)
            {
                aS = (aStudent) in.readObject();
                in.close();
            }
        }catch(Exception ex){
            
        }   
    }
    
    
    public void clearTable(){
        int n = jtable.getRowCount();
        for(int p=0;p<n;p++){
            miModel.removeRow(0);
        }
    }
    public void update(){
        clearTable();
        int num = aS.getSize();
        for(int p=0; p<num; p++){
            open = aS.getStudent(p);
            String carnet=open.getCarnet();
            String n = open.getName();
            String career=open.getCareer();
            int y = open.getYear();
            insert(n, carnet, career, y);
        }
    }
    
    public void insert(String name,String carnet,String career, int year){
        String n = name;
        String carne=carnet;
        String caree = career;
        int y = year;
        Object[] fila={n, carne, caree, y};
        miModel.addRow(fila);
    }
     public void consult(){
        String co=jTextFieldS.getText();
        int p = aS.search(co);
        
       
        if(p == -1){
            jLabelMessage.setText("Codigo no existe");
            
        }else{
            jLabelMessage.setText("Bienvenido");
            aS.saveStudent(aS.getStudent(p));
            jButtonBooks.setVisible(true);
            jButtonAudiovisuals.setVisible(true);
            
        }
     }
    public  void change(){
            consult();

        }
    
     
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonS = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jTextFieldS = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jButtonBooks = new javax.swing.JButton();
        jButtonAudiovisuals = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonS.setText("Search");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });

        jButtonR.setText("Return");
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtable);

        jButtonBooks.setText("Books");
        jButtonBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBooksActionPerformed(evt);
            }
        });

        jButtonAudiovisuals.setText("Audiovisuals");
        jButtonAudiovisuals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAudiovisualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jButtonBooks)
                                .addGap(85, 85, 85)
                                .addComponent(jButtonR)
                                .addGap(64, 64, 64)
                                .addComponent(jButtonAudiovisuals))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldS, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonS)
                    .addComponent(jTextFieldS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonR)
                    .addComponent(jButtonAudiovisuals)
                    .addComponent(jButtonBooks))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        change();
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBooksActionPerformed
        new InterfaceLB().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBooksActionPerformed

    private void jButtonAudiovisualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAudiovisualsActionPerformed
        new InterfaceLV().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAudiovisualsActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAudiovisuals;
    private javax.swing.JButton jButtonBooks;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldS;
    private javax.swing.JTable jtable;
    // End of variables declaration//GEN-END:variables

    
    }

