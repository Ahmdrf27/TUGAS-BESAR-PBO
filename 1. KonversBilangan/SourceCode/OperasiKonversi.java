/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konversibilangan;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class OperasiKonversi extends javax.swing.JFrame {

    /**
     * Creates new form OperasiKonversi
     */
    public OperasiKonversi() {
        initComponents();
        jLabel5.setText("Halo " + Login.nama);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bilangan_Awal = new javax.swing.JComboBox<>();
        NilaiInputan = new javax.swing.JTextField();
        ke_Bilangan = new javax.swing.JComboBox<>();
        OutputNilai = new javax.swing.JTextField();
        InputData = new javax.swing.JLabel();
        OutputData = new javax.swing.JLabel();
        konversi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OPERASI KONVERSI BILANGAN");

        Bilangan_Awal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "DESIMAL", "BINER", "HEXADESIMAL", "OKTAL" }));
        Bilangan_Awal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan_AwalActionPerformed(evt);
            }
        });

        NilaiInputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiInputanActionPerformed(evt);
            }
        });

        ke_Bilangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "DESIMAL", "BINER", "HEXADESIMAL", "OKTAL" }));
        ke_Bilangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ke_BilanganActionPerformed(evt);
            }
        });

        OutputNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputNilaiActionPerformed(evt);
            }
        });

        InputData.setForeground(new java.awt.Color(255, 255, 255));
        InputData.setText("Input");

        OutputData.setForeground(new java.awt.Color(255, 255, 255));
        OutputData.setText("output");

        konversi.setText("Konversikan");
        konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TipeNilai_Awal");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TipeNilai_Pengonversi");

        jLabel4.setText("Oleh Ahmad Rifai");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NilaiInputan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bilangan_Awal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ke_Bilangan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(konversi))
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bilangan_Awal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ke_Bilangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutputData)
                    .addComponent(InputData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NilaiInputan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(konversi)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(11, 11, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 372, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bilangan_AwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan_AwalActionPerformed
           // TODO add your handling code here:
        if(Bilangan_Awal.getSelectedItem() == "DESIMAL"){
            InputData.setText("INPUT DESIMAL : ");
        }if(Bilangan_Awal.getSelectedItem() == "HEXADESIMAL"){
            InputData.setText("INPUT HEXADESIMAL : ");
        }if(Bilangan_Awal.getSelectedItem() == "BINER"){
            InputData.setText("INPUT BINER : ");
        }if(Bilangan_Awal.getSelectedItem() == "OKTAL"){
            InputData.setText("INPUT OKTAL : ");
        }
    }//GEN-LAST:event_Bilangan_AwalActionPerformed

    private void ke_BilanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ke_BilanganActionPerformed
        // TODO add your handling code here:
         if(ke_Bilangan.getSelectedItem() == "DESIMAL"){
            OutputData.setText("OUTPUT DESIMAL : ");
        }if(ke_Bilangan.getSelectedItem() == "HEXADESIMAL"){
             OutputData.setText("OUTPUT HEXADESIMAL : ");
        }if(ke_Bilangan.getSelectedItem() == "BINER"){
             OutputData.setText("OUTPUT BINER : ");
        }if(ke_Bilangan.getSelectedItem() == "OKTAL"){
             OutputData.setText("OUTPUT OKTAL : ");
        }
    }//GEN-LAST:event_ke_BilanganActionPerformed

    private void konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiActionPerformed
        // TODO add your handling code here:
        try{
            //konversi bilangan hexadecimal
        if(Bilangan_Awal.getSelectedItem() == "HEXADESIMAL"){
                //konversi hexadecimal ke decimal
                if(ke_Bilangan.getSelectedItem() == "DESIMAL"){
                    String hexa = NilaiInputan.getText();
                    int outputDec = Integer.parseInt(hexa,16);
                    OutputNilai.setText(Integer.toUnsignedString(outputDec));
                }
                //konversi hexadecimal ke biner
                else if(ke_Bilangan.getSelectedItem() == "BINER"){
                    String hexa2 = NilaiInputan.getText();
                    int outputDec2 = Integer.parseInt(hexa2,16);
                    String hasilDecimal2 = Integer.toUnsignedString(outputDec2);
                    int hasilBiner = Integer.parseInt(hasilDecimal2);
                    OutputNilai.setText(Integer.toBinaryString(hasilBiner));    
                }
                //konversi hexadecimal ke oktal
                else if(ke_Bilangan.getSelectedItem() == "OKTAL"){
                    String hexa3 = NilaiInputan.getText();
                    int outputDec3 = Integer.parseInt(hexa3,16);
                    String hasilDecimal3 = Integer.toUnsignedString(outputDec3);
                    int hasilOktal3 = Integer.parseInt(hasilDecimal3);
                    OutputNilai.setText(Integer.toOctalString(hasilOktal3));
                }    
        }
            //konversi bilangan oktal
        else if(Bilangan_Awal.getSelectedItem() == "OKTAL"){
            //konversi oktal ke decimal
                if(ke_Bilangan.getSelectedItem() == "DESIMAL"){
                        String oktal4 = NilaiInputan.getText();
                        int outputDec4 = Integer.parseInt(oktal4,8);
                        OutputNilai.setText(Integer.toUnsignedString(outputDec4));
                }
                //konversi oktal ke hexadecimal
                 else if(ke_Bilangan.getSelectedItem() == "HEXADESIMAL"){
                        String oktal5 = NilaiInputan.getText();
                        int outputDec5 = Integer.parseInt(oktal5,8);
                        String hasilDecimal5 = Integer.toUnsignedString(outputDec5);
                        int hasilHex5 = Integer.parseInt(hasilDecimal5);
                        OutputNilai.setText(Integer.toHexString(hasilHex5));
                }
                //konversi oktal ke biner
                 else if(ke_Bilangan.getSelectedItem() == "BINER"){
                        String oktal6 = NilaiInputan.getText();
                        int outputDec6 = Integer.parseInt(oktal6,8);
                        String hasilDecimal6 = Integer.toUnsignedString(outputDec6);
                        int hasilBiner6 = Integer.parseInt(hasilDecimal6);
                        OutputNilai.setText(Integer.toBinaryString(hasilBiner6));
                }
        }
            //konversi bilangan biner
        else if(Bilangan_Awal.getSelectedItem() == "BINER"){
            //konversi biner ke decimal
                if(ke_Bilangan.getSelectedItem() == "DESIMAL"){
                    String biner7 = NilaiInputan.getText();
                    int outputDec7 = Integer.parseInt(biner7,2);
                    OutputNilai.setText(Integer.toUnsignedString(outputDec7));
                }
            //konversi biner ke oktal
                else if(ke_Bilangan.getSelectedItem() == "OKTAL"){
                    String biner8 = NilaiInputan.getText();
                    int outputDec8 = Integer.parseInt(biner8,2);
                    String hasilDecimal8 = Integer.toUnsignedString(outputDec8);
                    int hasilOktal8 = Integer.parseInt(hasilDecimal8);
                    OutputNilai.setText(Integer.toOctalString(hasilOktal8));
                }
            //konversi biner ke hexadecimal
                else if(ke_Bilangan.getSelectedItem() == "HEXADESIMAL"){
                    String biner9 = NilaiInputan.getText();
                    int outputDec9 = Integer.parseInt(biner9,2);
                    String hasilDecimal9 = Integer.toUnsignedString(outputDec9);
                    int hasilHex9 = Integer.parseInt(hasilDecimal9);
                    OutputNilai.setText(Integer.toHexString(hasilHex9));
                }
        }
            //konversi bilangan decimal
                else if(Bilangan_Awal.getSelectedItem() == "DESIMAL"){
            //konversi decimal ke oktal
                    if(ke_Bilangan.getSelectedItem() == "OKTAL"){
                    String des10 = NilaiInputan.getText();
                    int outputOktal10 = Integer.parseInt(des10);
                    OutputNilai.setText(Integer.toOctalString(outputOktal10));
                }
            //konversi decimal ke biner
                else if(ke_Bilangan.getSelectedItem() == "BINER"){
                    String des11 = NilaiInputan.getText();
                    int outputBiner11 = Integer.parseInt(des11);
                    OutputNilai.setText(Integer.toBinaryString(outputBiner11));
                }
            //konversi decimal ke hexadecimal
                else if(ke_Bilangan.getSelectedItem() == "HEXADESIMAL"){
                    String des12 = NilaiInputan.getText();
                    int outputHexadecimal12 = Integer.parseInt(des12);
                    OutputNilai.setText(Integer.toHexString(outputHexadecimal12));
                }
        }      
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Input Tidak Benar");
        }
    }//GEN-LAST:event_konversiActionPerformed

    private void NilaiInputanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiInputanActionPerformed
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_NilaiInputanActionPerformed

    private void OutputNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputNilaiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OutputNilaiActionPerformed

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
            java.util.logging.Logger.getLogger(OperasiKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperasiKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperasiKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperasiKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperasiKonversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bilangan_Awal;
    private javax.swing.JLabel InputData;
    private javax.swing.JTextField NilaiInputan;
    private javax.swing.JLabel OutputData;
    private javax.swing.JTextField OutputNilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> ke_Bilangan;
    private javax.swing.JButton konversi;
    // End of variables declaration//GEN-END:variables
}
