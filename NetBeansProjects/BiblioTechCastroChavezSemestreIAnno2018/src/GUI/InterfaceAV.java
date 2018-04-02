/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import data.AvFile;
import domain.Audiovisuales;
import domain.Cds;
import domain.Dvds;
import domain.Laptop;
import domain.Parlantes;
import domain.Proyector;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author faubricioch
 */
public class InterfaceAV extends javax.swing.JFrame {

    DateFormat df= DateFormat.getDateInstance();
    public InterfaceAV() {
        initComponents();
        setLocationRelativeTo(null);
//        setSize(450, 450);
//        setTitle("Audiovisual");
//        setIconImage(new ImageIcon(getClass().getResource("/images/images.jpg")).getImage());
//        ((JPanel)getContentPane()).setOpaque(false);
//        ImageIcon uno=new ImageIcon(this.getClass().getResource("/images/audiovisuales.jpg"));
//        JLabel fondo=new JLabel();
//        fondo.setIcon(uno);
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
//        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        dispositiveName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        registerNumber = new javax.swing.JTextField();
        brandName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateRegister = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        operativeSystem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        contentField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        goodCondition = new javax.swing.JRadioButton();
        badCondition = new javax.swing.JRadioButton();
        disponible = new javax.swing.JRadioButton();
        noDisponible = new javax.swing.JRadioButton();
        availableConect = new javax.swing.JRadioButton();
        unavailableConect = new javax.swing.JRadioButton();
        positiveBth = new javax.swing.JRadioButton();
        negativeBth = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laptop", "Proyector", "Parlantes", "Cd's", "Dvd's" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Dispositivo: ");

        dispositiveName.setEditable(false);

        jLabel3.setText("Marca:        ");

        registerNumber.setEditable(false);

        brandName.setEditable(false);

        jLabel4.setText("Numero de registro: ");

        jLabel5.setText("Condición: ");

        dateRegister.setVisible(false);

        jLabel2.setText("Fecha de registro: ");

        jLabel6.setText("Disponibilidad:");

        jLabel7.setText("Sistema operativo:");

        operativeSystem.setEditable(false);

        jLabel8.setText("Conexión inalámbrica: ");

        jLabel9.setText("Conexión bluetooth: ");

        jLabel10.setText("Contenido:");

        contentField.setEditable(false);;

        registerButton.setBackground(Color.CYAN);
        registerButton.setText("Registrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        goodCondition.setVisible(false);
        buttonGroup2.add(goodCondition);
        goodCondition.setText("Buena");
        goodCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodConditionActionPerformed(evt);
            }
        });

        badCondition.setVisible(false);
        buttonGroup2.add(badCondition);
        badCondition.setText("Mala");
        badCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badConditionActionPerformed(evt);
            }
        });

        disponible.setVisible(false);
        buttonGroup1.add(disponible);
        disponible.setText("Si");

        noDisponible.setVisible(false);
        buttonGroup1.add(noDisponible);
        noDisponible.setText("No");

        availableConect.setVisible(false);
        buttonGroup3.add(availableConect);
        availableConect.setText("Si");
        availableConect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableConectActionPerformed(evt);
            }
        });

        unavailableConect.setVisible(false);
        buttonGroup3.add(unavailableConect);
        unavailableConect.setText("No");

        positiveBth.setVisible(false);
        buttonGroup4.add(positiveBth);
        positiveBth.setText("Si");

        negativeBth.setVisible(false);
        buttonGroup4.add(negativeBth);
        negativeBth.setText("No");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dispositiveName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(goodCondition)
                                .addGap(18, 18, 18)
                                .addComponent(badCondition))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dateRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(disponible)
                                .addGap(18, 18, 18)
                                .addComponent(noDisponible))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operativeSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(availableConect))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(positiveBth)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(negativeBth)
                                    .addComponent(unavailableConect))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(contentField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dispositiveName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(goodCondition)
                            .addComponent(badCondition))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(disponible)
                            .addComponent(noDisponible))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(operativeSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(availableConect)
                            .addComponent(unavailableConect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(positiveBth)
                            .addComponent(negativeBth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(contentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int index=jComboBox1.getSelectedIndex();
        invisible();
        visibleAV(index);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        try {
            File file=new File("./AvFile.dat");
            AvFile avFile=new AvFile(file);
            if(blancSpace(jComboBox1.getSelectedIndex())==0){
                IncompleteData inData=new IncompleteData();
                inData.setVisible(true);
            }else{
                if(jComboBox1.getSelectedIndex()==0){
                    Laptop lap=new Laptop();
                    atributesDefault(lap);
                    lap.setOperativeSys(operativeSystem.getText());
                    avFile.addEndRecordLaptop(lap);
                }//guarda datos laptop
                if(jComboBox1.getSelectedIndex()==1){
                    Proyector pro=new Proyector();
                    atributesDefault(pro);
                    if(availableConect.isSelected()==true){
                        pro.setWireless(true);
                    }else{//conexion inalambrica
                        pro.setWireless(false);
                    }//conexion inalambrica
                    avFile.addEndRecordProyector(pro);
                }//guarda datos proyector
                if(jComboBox1.getSelectedIndex()==2){
                    Parlantes par=new Parlantes();
                    atributesDefault(par);
                    if(positiveBth.isSelected()==true){
                        par.setBluethoot(true);
                    }else{//conexion bluetooth
                        par.setBluethoot(false);
                    }//conexion bluetooth
                    avFile.addEndRecordParlantes(par);
                }//guarda datos parlantes
                if(jComboBox1.getSelectedIndex()==3){
                    Cds cds=new Cds();
                    atributesDefault(cds);
                    cds.setContentInfo(contentField.getText());
                    avFile.addEndRecordCds(cds);
                }//guarda datos cds
                if(jComboBox1.getSelectedIndex()==4){
                    Dvds dvds=new Dvds();
                    atributesDefault(dvds);
                    dvds.setContentInfo(contentField.getText());
                    avFile.addEndRecordDvd(dvds);
                }//guarda datos dds
            }//if de validacion
            
            dispositiveName.setText("");
            brandName.setText("");
            registerNumber.setText("");
            dateRegister.setDate(null);
            buttonGroup2.clearSelection();
            buttonGroup1.clearSelection();
            operativeSystem.setText("");
            buttonGroup3.clearSelection();
            buttonGroup4.clearSelection();
            contentField.setText("");
        } catch (IOException ex) {
            Logger.getLogger(InterfaceAV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void goodConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodConditionActionPerformed

    }//GEN-LAST:event_goodConditionActionPerformed

    private void badConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badConditionActionPerformed
        
    }//GEN-LAST:event_badConditionActionPerformed

    private void availableConectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableConectActionPerformed

    }//GEN-LAST:event_availableConectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton availableConect;
    private javax.swing.JRadioButton badCondition;
    private javax.swing.JTextField brandName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField contentField;
    private com.toedter.calendar.JDateChooser dateRegister;
    private javax.swing.JRadioButton disponible;
    private javax.swing.JTextField dispositiveName;
    private javax.swing.JRadioButton goodCondition;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton negativeBth;
    private javax.swing.JRadioButton noDisponible;
    private javax.swing.JTextField operativeSystem;
    private javax.swing.JRadioButton positiveBth;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField registerNumber;
    private javax.swing.JRadioButton unavailableConect;
    // End of variables declaration//GEN-END:variables
    
    public void invisible(){
        dispositiveName.setEditable(true);
        brandName.setEditable(true);
        registerNumber.setEditable(true);
        dateRegister.setVisible(true);
        goodCondition.setVisible(true);
        badCondition.setVisible(true);
        disponible.setVisible(true);
        noDisponible.setVisible(true);
    }
    
    public void visibleAV(int index){
        if(index==0){
            dispositiveName.setText("Laptop");
            dispositiveName.setEditable(false);
            operativeSystem.setEditable(true);
            contentField.setEditable(false);
            availableConect.setVisible(false);
            unavailableConect.setVisible(false);
            positiveBth.setVisible(false);
            negativeBth.setVisible(false);
        }
        if(index==1){
            dispositiveName.setText("Proyector");
            dispositiveName.setEditable(false);
            operativeSystem.setEditable(false);
            contentField.setEditable(false);
            availableConect.setVisible(true);
            unavailableConect.setVisible(true);
            positiveBth.setVisible(false);
            negativeBth.setVisible(false);
        }
        if(index==2){
            dispositiveName.setText("Parlantes");
            dispositiveName.setEditable(false);
            operativeSystem.setEditable(false);
            contentField.setEditable(false);
            availableConect.setVisible(false);
            unavailableConect.setVisible(false);
            positiveBth.setVisible(true);
            negativeBth.setVisible(true);
        }
        if(index>=3){
            operativeSystem.setEditable(false);
            contentField.setEditable(false);
            availableConect.setVisible(false);
            unavailableConect.setVisible(false);
            positiveBth.setVisible(false);
            negativeBth.setVisible(false);
            contentField.setEditable(true);
            if(index==3){
                dispositiveName.setText("Cd's");
                dispositiveName.setEditable(false);
            }else{
                dispositiveName.setText("Dvd's");
                dispositiveName.setEditable(false);
            }
        }
    }
    
    public int blancSpace(int index){
        int control=0;
        
        if(dispositiveName.getText().equals("") ||
                brandName.getText().equals("") ||
                registerNumber.getText().equals("") ||
                registerNumber.getText().length()!=5 ||
                buttonGroup1.isSelected(null)==true ||
                buttonGroup2.isSelected(null)==true ||
                dateRegister.getDate()==null){
            control=0;
        }else{
            control=1;
            if(index==0 && operativeSystem.getText().equals("")){
                control=0;
            }//valida atributo especifico de laptop
            if(index==1 && buttonGroup3.isSelected(null)==true){
                control=0;
            }//valida atributo especifico de proyector
            if(index==2 && buttonGroup4.isSelected(null)==true){
                control=0;
            }//valida atributo especifico de parlantes
            if(index>=3 && contentField.getText().equals("")){
                control=0;
            }
        }
        
        return control;
    }//fin metodo
    
    public int convertInt(){
        return Integer.parseInt(registerNumber.getText());
    }
    
    public void atributesDefault(Audiovisuales ad){
        ad.setDispositive(dispositiveName.getText());
        ad.setBrand(brandName.getText());
        ad.setRegisterNumber(convertInt());
        if(goodCondition.isSelected()==true){
            ad.setCondition(true);
        }else{//verifica condicion
            ad.setCondition(false);
        }//verifica condicion
        ad.setEntryDate(df.format(dateRegister.getDate()));
        if(disponible.isSelected()==true){
            ad.setAvailability(true);
        }else{//verifica disponiblilidad
            ad.setAvailability(false);
        }//verifica disponibilidad
    }
}
