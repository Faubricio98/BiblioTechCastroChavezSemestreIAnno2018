/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import data.BFile;
import domain.Books;
import domain.DigitalBook;
import domain.MaterialBook;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class InterfaceBO extends javax.swing.JFrame {

    
    public InterfaceBO() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(450, 450);
        setLocation(300, 200);
        setTitle("Books");
        setIconImage(new ImageIcon(getClass().getResource("/images/images.jpg")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon one=new ImageIcon(this.getClass().getResource("/images/biblioteca.jpg"));
        JLabel background=new JLabel();
        background.setIcon(one);
        getLayeredPane().add(background, JLayeredPane.FRAME_CONTENT_LAYER);
        background.setBounds(0,0,one.getIconWidth(),one.getIconHeight());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegister = new javax.swing.JButton();
        jComboBooks = new javax.swing.JComboBox<>();
        lblType = new javax.swing.JLabel();
        jLabelYear = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jTextYear = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextTitle = new javax.swing.JTextField();
        jLabelAuthor = new javax.swing.JLabel();
        jTextAuthor = new javax.swing.JTextField();
        jLabelISBN = new javax.swing.JLabel();
        jTextISBN = new javax.swing.JTextField();
        jTextFieldStorage = new javax.swing.JTextField();
        jTextFieldFormat = new javax.swing.JTextField();
        jLabelFormat = new javax.swing.JLabel();
        jLabelStorage = new javax.swing.JLabel();
        jTextFieldCover = new javax.swing.JTextField();
        jLabelCover = new javax.swing.JLabel();
        jLabelSheets = new javax.swing.JLabel();
        jTextFieldSheets = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButtonRegister.setBackground(new java.awt.Color(153, 153, 0));
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister);
        jButtonRegister.setBounds(290, 100, 80, 40);

        jComboBooks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBooks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material Book", "Digital Book" }));
        jComboBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBooksActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBooks);
        jComboBooks.setBounds(80, 20, 100, 20);
        getContentPane().add(lblType);
        lblType.setBounds(220, 10, 190, 30);

        jLabelYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelYear.setText("Year");
        getContentPane().add(jLabelYear);
        jLabelYear.setBounds(20, 200, 50, 20);

        jLabelType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelType.setText("Type");
        getContentPane().add(jLabelType);
        jLabelType.setBounds(20, 20, 50, 20);

        jTextYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextYearActionPerformed(evt);
            }
        });
        getContentPane().add(jTextYear);
        jTextYear.setBounds(80, 200, 90, 30);

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelName.setText("Title");
        getContentPane().add(jLabelName);
        jLabelName.setBounds(20, 60, 50, 20);

        jTextTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTitleActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTitle);
        jTextTitle.setBounds(80, 60, 130, 30);

        jLabelAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAuthor.setText("Author");
        getContentPane().add(jLabelAuthor);
        jLabelAuthor.setBounds(20, 100, 50, 20);

        jTextAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAuthorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextAuthor);
        jTextAuthor.setBounds(80, 100, 130, 30);

        jLabelISBN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelISBN.setText("ISBN");
        getContentPane().add(jLabelISBN);
        jLabelISBN.setBounds(20, 150, 50, 20);

        jTextISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextISBNActionPerformed(evt);
            }
        });
        jTextISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextISBNKeyTyped(evt);
            }
        });
        getContentPane().add(jTextISBN);
        jTextISBN.setBounds(80, 150, 130, 30);

        jTextFieldStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStorageActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldStorage);
        jTextFieldStorage.setBounds(80, 290, 79, 30);

        jTextFieldFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormatActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFormat);
        jTextFieldFormat.setBounds(80, 250, 105, 31);

        jLabelFormat.setText("Format");
        getContentPane().add(jLabelFormat);
        jLabelFormat.setBounds(20, 250, 50, 14);

        jLabelStorage.setText("Storage");
        getContentPane().add(jLabelStorage);
        jLabelStorage.setBounds(20, 300, 60, 14);

        jTextFieldCover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoverActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCover);
        jTextFieldCover.setBounds(300, 240, 105, 31);

        jLabelCover.setText("Cover");
        getContentPane().add(jLabelCover);
        jLabelCover.setBounds(240, 250, 50, 14);

        jLabelSheets.setText("Sheets");
        getContentPane().add(jLabelSheets);
        jLabelSheets.setBounds(243, 300, 50, 14);

        jTextFieldSheets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSheetsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSheets);
        jTextFieldSheets.setBounds(300, 290, 79, 30);

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(290, 170, 90, 30);
        getContentPane().add(jLabelMessage);
        jLabelMessage.setBounds(300, 40, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jComboBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBooksActionPerformed
        int index=jComboBooks.getSelectedIndex();
        invisible();
        visibleAV(index);

    }//GEN-LAST:event_jComboBooksActionPerformed

    
    private void jTextYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextYearActionPerformed

    }//GEN-LAST:event_jTextYearActionPerformed

    private void jTextTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTitleActionPerformed

    }//GEN-LAST:event_jTextTitleActionPerformed

    private void jTextAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAuthorActionPerformed

    }//GEN-LAST:event_jTextAuthorActionPerformed

    private void jTextISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextISBNActionPerformed

    }//GEN-LAST:event_jTextISBNActionPerformed

    private void jTextFieldSheetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSheetsActionPerformed

    }//GEN-LAST:event_jTextFieldSheetsActionPerformed

    private void jTextFieldFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormatActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        try {
            File file=new File("./BFile.dat");
            BFile bFile=new BFile(file);
        if(blancSpace(jComboBooks.getSelectedIndex())==0){
            IncompleteData inData=new IncompleteData();
            inData.setVisible(true);
        }else{
            if(jComboBooks.getSelectedIndex()==0){
                MaterialBook MatB=new MaterialBook();
                defaultAtributes(MatB);
                MatB.setCover(jTextFieldCover.getText());
                MatB.setSheets(Integer.parseInt(jTextFieldSheets.getText()));
                bFile.addEndRecordMaterialBook(MatB);
            }//guarda datos Libros 
            if(jComboBooks.getSelectedIndex()==1){
                DigitalBook DigB=new DigitalBook();
                defaultAtributes(DigB);
                DigB.setFormat(jTextFieldFormat.getText());
                DigB.setStorage(Float.parseFloat(jTextFieldStorage.getText()));
                bFile.addEndRecordDigitalBook(DigB);
                }//guarda datos Libros digitales
            }//if de validacion
        jTextTitle.setText("");
        jTextAuthor.setText("");
        jTextISBN.setText("");
        jTextYear.setText("");
        jTextFieldCover.setText("");
        jTextFieldFormat.setText("");
        jTextFieldSheets.setText("");
        jTextFieldStorage.setText("");
        jLabelMessage.setText("Datos registrados");
        }catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextFieldStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStorageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStorageActionPerformed

    private void jTextFieldCoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCoverActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        MDI mdi= new MDI();
        mdi.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextISBNKeyTyped
        int limit=20;//limita la cantidad de caracteres
        if(jTextISBN.getText().length()>=limit){
            evt.consume();//no deja ingresar más caracteres
        }
    }//GEN-LAST:event_jTextISBNKeyTyped

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
            java.util.logging.Logger.getLogger(InterfaceBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBooks;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelCover;
    private javax.swing.JLabel jLabelFormat;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSheets;
    private javax.swing.JLabel jLabelStorage;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JTextField jTextAuthor;
    private javax.swing.JTextField jTextFieldCover;
    private javax.swing.JTextField jTextFieldFormat;
    private javax.swing.JTextField jTextFieldSheets;
    private javax.swing.JTextField jTextFieldStorage;
    private javax.swing.JTextField jTextISBN;
    private javax.swing.JTextField jTextTitle;
    private javax.swing.JTextField jTextYear;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
    
    public void visibleAV(int index){
        if(index==0){
            jTextTitle.setVisible(true);
            jTextAuthor.setVisible(true);
            jTextISBN.setVisible(true);
            jTextYear.setVisible(true);
            jTextFieldCover.setVisible(true);
            jTextFieldSheets.setVisible(true);
            jTextFieldFormat.setVisible(false);
            jTextFieldStorage.setVisible(false);
        }
        else{
            jTextTitle.setVisible(true);
            jTextAuthor.setVisible(true);
            jTextISBN.setVisible(true);
            jTextYear.setVisible(true);
            jTextFieldCover.setVisible(false);
            jTextFieldSheets.setVisible(false);
            jTextFieldFormat.setVisible(true);
            jTextFieldStorage.setVisible(true);
        }
    }    
    public void invisible(){
        jTextTitle.setVisible(true);
        jTextAuthor.setVisible(true);
        jTextISBN.setVisible(true);
        jTextYear.setVisible(true);
        jTextFieldCover.setVisible(true);
        jTextFieldFormat.setVisible(true);
        jTextFieldSheets.setVisible(true);
        jTextFieldStorage.setVisible(true);
        
    }
    public int blancSpace(int index){
        int control=0;
        
        if(jTextTitle.getText().equals("") ||
                jTextAuthor.getText().equals("") ||
                jTextAuthor.getText().equals("") ||
                jTextISBN.getText().equals("") ||
                jTextISBN.getText().length()!=10 ||
                jTextYear.getText().equals("")){
               
            control=0;
        }else{
            control=1;
            if(index==0 && jTextFieldCover.getText().equals("") && jTextFieldSheets.getText().equals("")){
                control=0;
            }
            if(index==1 && jTextFieldFormat.getText().equals("") && jTextFieldStorage.getText().equals("") ){
                control=0;
            }//valida atributo especifico de proyector
        }
        return control;
    }//fin metodo
    
    private void defaultAtributes(Books b){
        if((jComboBooks.getSelectedItem().toString()).equalsIgnoreCase("Material Book")){//pregunta la opcion elegida en el combobox
            b.setType(jComboBooks.getSelectedItem().toString());//elige libro físico
        }
        else{
            b.setType(jComboBooks.getSelectedItem().toString());//elige libro digital
        }
        b.setTitle(jTextTitle.getText());
        b.setAuthor(jTextAuthor.getText());
        b.setIsbn(Integer.parseInt(jTextISBN.getText()));
        b.setYear(Integer.parseInt(jTextYear.getText()));
        b.setAviable(true);
        
    }
}

