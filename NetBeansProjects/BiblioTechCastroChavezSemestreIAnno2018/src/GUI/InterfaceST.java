/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import domain.Student;
import GUI.IncompleteData;
import GUI.InterfaceAV;
import data.aStudent;
import domain.Audiovisuales;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonathan
 */
public class InterfaceST extends javax.swing.JFrame {

    

    Student open;
    aStudent aS;
    int cont=0;
    
    public InterfaceST() {
        initComponents();
        setLocationRelativeTo(null);
        aS = new aStudent();
        loadData();
        update();
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
            jLabel1.setText(ex.getMessage());
        }   
    }
    
    public void record() 
    {
        try{
            FileOutputStream fos = new FileOutputStream("Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if(out != null){
                out.writeObject(aS);
                out.close();
            }
        }catch(Exception ex){
            
        }
    }
    public void update(){
        
        int num = aS.getSize();
        for(int p=0; p<num; p++){
            open = aS.getStudent(p);
            String carnet=open.getCarnet();
            String n = open.getName();
            String career=open.getCareer();
            int a=open.getAgro();
            int e=open.getEdu();
            int i=open.getInf();
            int y = open.getYear();
 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldY = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldN = new javax.swing.JTextField();
        jLabelYear = new javax.swing.JLabel();
        jComboCareer = new javax.swing.JComboBox<String>();
        jLabelCareer = new javax.swing.JLabel();
        jLabelCarnet = new javax.swing.JLabel();
        jLabelcarnet2 = new javax.swing.JLabel();
        jButtonR = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYActionPerformed(evt);
            }
        });
        jTextFieldY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldYKeyTyped(evt);
            }
        });

        jLabelName.setText("Name");

        jTextFieldN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNActionPerformed(evt);
            }
        });
        jTextFieldN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNKeyTyped(evt);
            }
        });

        jLabelYear.setText("Year of income");

        jComboCareer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agronomia", "Educacion", "Informatica" }));

        jLabelCareer.setText("Career");

        jLabelCarnet.setText("Carnet");

        jButtonR.setText("Register");
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });

        jButtonB.setText("Back");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCareer)
                            .addComponent(jLabelCarnet)
                            .addComponent(jLabelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelcarnet2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonR)
                                        .addComponent(jComboCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jButtonB)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCareer)
                    .addComponent(jComboCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCarnet)
                            .addComponent(jLabelcarnet2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonR)
                            .addComponent(jButtonB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jTextFieldYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYActionPerformed

    private void jTextFieldYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldYKeyTyped
        int limit=4;//limita la cantidad de caracteres
        if(jTextFieldY.getText().length()>=limit){
            evt.consume();//no deja ingresar más caracteres
        }
    }//GEN-LAST:event_jTextFieldYKeyTyped

    private void jTextFieldNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNActionPerformed

    private void jTextFieldNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNKeyTyped
        int limit=20;//limita la cantidad de caracteres
        if(jTextFieldN.getText().length()>=limit){
            evt.consume();//no deja ingresar más caracteres
        }
    }//GEN-LAST:event_jTextFieldNKeyTyped

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        try {
            this.save();
        } catch (IOException ex) {
            Logger.getLogger(InterfaceST.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        MDI mdi=new MDI();
        mdi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceST().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonR;
    private javax.swing.JComboBox<String> jComboCareer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCareer;
    private javax.swing.JLabel jLabelCarnet;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JLabel jLabelcarnet2;
    private javax.swing.JTextField jTextFieldN;
    private javax.swing.JTextField jTextFieldY;
    // End of variables declaration//GEN-END:variables
    public void clean(){
        jTextFieldN.setText("");
        jTextFieldY.setText("");
        
    }
    
    public void save() throws IOException{
        String Digit=jTextFieldY.getText();
        String finalDigit=Digit.substring(Digit.length()-1);
        Student s = new Student();
        String carnet="", ze="";
        int num, a, e, i;
        String n = jTextFieldN.getText();
        int y = Integer.parseInt(jTextFieldY.getText());
        String c = jComboCareer.getSelectedItem().toString();
        if(aS.getSize()<10){
            ze+="00";
        }else if(aS.getSize()>10 &&aS.getSize()<100){
            ze+="0";
        } else{
        }

        if(jComboCareer.getSelectedIndex()==0){
            Digit=jComboCareer.getSelectedItem().toString();
            a = aS.getSize()+1;
            e=s.getEdu();
            i=s.getInf();
            
            carnet+="A"+finalDigit+ze+a;
         }
         else{ if(jComboCareer.getSelectedIndex()==1){
            Digit=jComboCareer.getSelectedItem().toString();
            a=s.getAgro();
            e=aS.getSize()+1;
            i=s.getInf();
            num=s.getEdu();            
            carnet+="E"+finalDigit+ze+e;
         }else{
            Digit=jComboCareer.getSelectedItem().toString();
            a=s.getAgro();
            e=s.getEdu();
            i=aS.getSize()+1;
            carnet+="I"+finalDigit+ze+i;
            }
         }
        jLabelcarnet2.setText(carnet);
        
        open = new Student(carnet, n, Digit, a, e, i, y);
            if(aS.search(open.getCarnet()) != -1){
              jLabel1.setText("El codigo del alumno ya existe");
                
            }else{
                aS.add(open);
                
                record();
                update();
                clean();
           } 
    }
}


