/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import domain.Cars;
import file.CarsFile;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOException;

/**
 *
 * @author faubricioch
 */
public class InsertCars extends javax.swing.JFrame {

    /**
     * Creates new form InsertCars
     */
    public InsertCars() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mileageField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        isAmerican = new javax.swing.JRadioButton();
        noIsAmerican = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        serieField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Año: ");

        jLabel3.setText("Kilometraje:");

        jLabel4.setText("Americano:");

        buttonGroup1.add(isAmerican);
        isAmerican.setText("Si");

        buttonGroup1.add(noIsAmerican);
        noIsAmerican.setText("No");

        jLabel5.setText("Serie:");

        jButton1.setText("Insertar auto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar automovil", "Actualizar datos", "Eliminar automovil" }));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(yearField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mileageField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isAmerican)
                                .addGap(18, 18, 18)
                                .addComponent(noIsAmerican))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serieField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(mileageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(isAmerican)
                            .addComponent(noIsAmerican)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(serieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            IncompleteDate inData=new IncompleteDate();
            //creamos el archivo
            File fileCar=new File("./Cars.dat");
            Cars useCar=new Cars();
            CarsFile carFile=new CarsFile(fileCar);
            
            //preguntamos sobre el comboBox escogido
            if(jComboBox1.getSelectedIndex()==0){
                //creamos el objeto validando los datos
                if(validacion()==0){
                    inData.setVisible(true);
                    limpiaEspacios();
                }else{
                    if(isAmerican.isSelected()==true){
                        Cars car=new Cars(nameField.getText(),
                                Integer.parseInt(yearField.getText()),
                                Float.parseFloat(mileageField.getText()),
                                true, Integer.parseInt(serieField.getText()));
                        //lo agregamos a final del archivo
                        carFile.addEndRecord(car);
                        limpiaEspacios();
                    }//preguntamos si es americano
                    if(noIsAmerican.isSelected()==true){
                        Cars car=new Cars(nameField.getText(),
                                Integer.parseInt(yearField.getText()),
                                Float.parseFloat(mileageField.getText()),
                                false, Integer.parseInt(serieField.getText()));
                        //lo agregamos al final del archivo
                        carFile.addEndRecord(car);
                        limpiaEspacios();
                    }//preguntamos si no es americano
                }//if de creacion y validacion
            }//if de ComboBox 1
        } catch (IOException ex) {
            Logger.getLogger(InsertCars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            IncompleteDate inData=new IncompleteDate();
            //creamos el archivo
            File fileCar=new File("./Cars.dat");
            Cars useCar=new Cars();
            CarsFile carFile=new CarsFile(fileCar);
            //preguntamos sobre el comboBox escogido
            //if de comboBox 1
            if(jComboBox1.getSelectedIndex()>=1 && !serieField.getText().equals("") &&
                    Integer.parseInt(serieField.getText())!=0){
                serieField.setEditable(false);
                useCar=carFile.getCarBySerie(Integer.parseInt(serieField.getText()));
                nameField.setText(useCar.getName());
                yearField.setText(Integer.toString(useCar.getYear()));
                mileageField.setText(Float.toString(useCar.getMileage()));
                if(useCar.isAmerican()==true){
                    isAmerican.setSelected(true);
                }//busca americano
                if(useCar.isAmerican()==false){
                    noIsAmerican.setSelected(true);
                }
            }else{
                System.out.println("Digite una serie válida");
            }
        } catch (IOException ex) {
            Logger.getLogger(InsertCars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            if(validacion()==1 && jComboBox1.getSelectedIndex()==1){
                File fileCar=new File("./Cars.dat");
                Cars useCar=new Cars();
                CarsFile carFile=new CarsFile(fileCar);
                
                useCar.setName(nameField.getText());
                useCar.setYear(Integer.parseInt(yearField.getText()));
                useCar.setMileage(Float.parseFloat(mileageField.getText()));
                if(isAmerican.isSelected()==true){
                    useCar.setAmerican(true);
                }
                if(noIsAmerican.isSelected()==false){
                    useCar.setAmerican(false);
                }
                useCar.setSerie(Integer.parseInt(serieField.getText()));
                carFile.putValueBySerie(Integer.parseInt(serieField.getText()), useCar);
            }else{
                System.err.println("4. Error en actualizacion de datos");
            }
        }catch(IOException e){
            System.err.println("4. Error en actualizacion de datos");
        }
        limpiaEspacios();
        serieField.setEditable(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            if(validacion()==1 && jComboBox1.getSelectedIndex()==2){
                File fileCar=new File("./Cars.dat");
                CarsFile carFile=new CarsFile(fileCar);
                
                if(carFile.deleteCar(Integer.parseInt(serieField.getText()))==true){
                    System.out.println("Eliminado");
                    limpiaEspacios();
                    carFile.compressFile(carFile.getAllCars());
                    serieField.setEditable(true);
                    //
                }else{
                    System.out.println("El registro ya había sido eliminado");
                    limpiaEspacios();
                    serieField.setEditable(true);
                }//if si deleteCar==true
            }//if de validacion
        }catch(IOException e){
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton isAmerican;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mileageField;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton noIsAmerican;
    private javax.swing.JTextField serieField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
    
    public int validacion(){
        int prueba1=0;
        int valida=0;
        float prueba=0;
        
        if(nameField.getText().equals("") ||
                yearField.getText().equals("") ||
                mileageField.getText().equals("") ||
                buttonGroup1.isSelected(null)==true ||
                serieField.getText().equals("")){
            valida=0;
        }else{//valida espacios llenos
            valida=1;
            if(nameField.getText().length()>20){
                valida=0;
            }//cantidad de caracteres
            try{
                prueba1=Integer.parseInt(yearField.getText());
                prueba1=Integer.parseInt(serieField.getText());
                prueba=Float.parseFloat(mileageField.getText());
            }catch(Exception e){
                valida=0;
            }//valida datos correctos
        }
        return valida;
    }
    
    public void limpiaEspacios(){
        //limpiamos espacios
        nameField.setText("");
        yearField.setText("");
        mileageField.setText("");
        buttonGroup1.clearSelection();
        serieField.setText("");
    }

}
