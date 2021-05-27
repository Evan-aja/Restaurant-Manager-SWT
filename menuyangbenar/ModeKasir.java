/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuyangbenar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author evan
 */
public class ModeKasir extends javax.swing.JFrame {

    /**
     * Creates new form ModeKasir
     */
    public ModeKasir() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        refreshMaem();
        jScrollPane3.setViewportView(jTable1);

        refreshEmik();
        jScrollPane4.setViewportView(jTable2);

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pilihan Menu (Mohon pilih 1 per 1)");

        jLabel1.setText("Menu Makanan");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 14));

        jLabel2.setText("Menu Minuman");
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 14));

        jLabel4.setText("Jumlah");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 14));

        jLabel5.setText("Jumlah");
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 14));

        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cetak Struk");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Kurangi");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount()== 1 && jTable2.getSelectedRowCount()== 1){
            JOptionPane.showMessageDialog(this, "Pilih salah satu tabel, makanan atau minuman", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
            return;
        }
        
        if(jTable1.getSelectedRowCount()== 0 && jTable2.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this, "Pilih makanan atau minuman pada tabel", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
            return;
        }
        
        if(jTable1.getSelectedRowCount()> 1 || jTable2.getSelectedRowCount()> 1){
            JOptionPane.showMessageDialog(this, "Pilih 1 makanan atau 1 minuman pada tabel", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
            return;
        }
        
        if(jTable1.getSelectedRowCount()== 1){
            int before1 = data.pesananMaem.size();
            int before2 = data.jumlahMaem.size();
            int selected = jTable1.getSelectedRow();
            
            if(jTextField1.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Masukkan jumlah", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int jumlah = 0 ;
            try {
                jumlah = Integer.parseInt(jTextField1.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Masukkan angka pada kolom jumlah", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            for (int i = 0; i < data.pesananMaem.size(); i++) {
                if(jTable1.getValueAt(selected, 0).equals(jTable1.getValueAt(data.pesananMaem.get(i), 0))){
                    int totalAfter = data.jumlahMaem.get(i)+jumlah;
                    data.jumlahMaem.set(i, totalAfter);
                    JOptionPane.showMessageDialog(this, "Jumlah "+jTable1.getValueAt(selected, 0)+" berhasil ditambahkan");
                    System.out.println("Jumlah makanan : "+ data.jumlahMaem.size());
                    System.out.println("Jumlah "+jTable1.getValueAt(selected, 0)+" : "+data.jumlahMaem.get(i));
                    jTextField1.setText("");
                    jTextField2.setText("");
                    return;
                }
            }
            
            data.pesananMaem.add(selected);
            data.jumlahMaem.add(jumlah);
            
            if(data.jumlahMaem.size()-before2 == 1 && data.pesananMaem.size()-before1 == 1){
                JOptionPane.showMessageDialog(this, "Makananan berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Makananan tidak berhasil ditambahkan");
            }
            System.out.println(showKasirList());
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
        }
        
        if(jTable2.getSelectedRowCount()== 1){
            int before1 = data.pesananEmik.size();
            int before2 = data.jumlahEmik.size();
            int selected = jTable2.getSelectedRow();
            
            if(jTextField2.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Masukkan jumlah", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int jumlah = 0;
            try {
                jumlah = Integer.parseInt(jTextField2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Masukkan angka pada kolom jumlah22", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for (int i = 0; i < data.pesananEmik.size(); i++) {
                if(jTable2.getValueAt(selected, 0).equals(jTable2.getValueAt(data.pesananEmik.get(i), 0))){
                    int totalAfter = data.jumlahEmik.get(i)+jumlah;
                    data.jumlahEmik.set(i, totalAfter);
                    JOptionPane.showMessageDialog(this, "Jumlah "+jTable2.getValueAt(selected, 0)+" berhasil ditambahkan");
                    System.out.println("Jumlah minuman : "+ data.jumlahEmik.size());
                    System.out.println("Jumlah "+jTable2.getValueAt(selected, 0)+" : "+data.jumlahEmik.get(i)+"\n");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    return;
                }
            }
            
            data.pesananEmik.add(selected);
            data.jumlahEmik.add(jumlah);
            
            if(data.jumlahEmik.size()-before2 == 1 && data.pesananEmik.size()-before1 == 1){
                JOptionPane.showMessageDialog(this, "Minuman berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Minuman tidak berhasil ditambahkan");
            }
            System.out.println(showKasirList());
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        data.setdataStruk(showKasirList());
        Totalan total = new Totalan();
        total.setVisible(true);
        this.dispose();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount()== 1 && jTable2.getSelectedRowCount()== 1){
            JOptionPane.showMessageDialog(this, "Pilih salah satu tabel, makanan atau minuman", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
            return;
        }
        
        if(jTable1.getSelectedRowCount()== 0 && jTable2.getSelectedRowCount()== 0){
            JOptionPane.showMessageDialog(this, "Pilih makanan atau minuman pada tabel", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();            
            return;
        }
        
        if(jTable1.getSelectedRowCount()> 1 || jTable2.getSelectedRowCount()> 1){
            JOptionPane.showMessageDialog(this, "Pilih 1 makanan atau 1 minuman pada tabel", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();            
            return;
        }
        
        if(jTable1.getSelectedRowCount()== 1){
            int selected = jTable1.getSelectedRow();
            int jumlah = 0 ;
            try {
                jumlah = Integer.parseInt(jTextField1.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Masukkan angka pada kolom jumlah", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for (int i = 0; i < data.pesananMaem.size(); i++) {
                if(data.pesananMaem.get(i) == selected){
                    int afterKurang = data.jumlahMaem.get(i)-jumlah;
                    if(afterKurang <= 0 ){
                        data.pesananMaem.remove(i);
                        data.jumlahMaem.remove(i);
                    }else{
                        data.jumlahMaem.set(i, afterKurang);
                    }   
                    JOptionPane.showMessageDialog(this, "Makanan berhasil dikurangi");
                }
            }
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();
        }
        
        if(jTable2.getSelectedRowCount()== 1){
            int selected = jTable2.getSelectedRow();
            int jumlah = 0 ;
            try {
                jumlah = Integer.parseInt(jTextField2.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Masukkan angka pada kolom jumlah", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for (int i = 0; i < data.pesananEmik.size(); i++) {
                if(data.pesananEmik.get(i) == selected){
                    int afterKurang = data.jumlahEmik.get(i)-jumlah;
                    if(afterKurang <= 0 ){
                        data.pesananEmik.remove(i);
                        data.jumlahEmik.remove(i);
                    }else{
                        data.jumlahEmik.set(i, afterKurang);
                    }   
                    JOptionPane.showMessageDialog(this, "Minuman berhasil dikurangi");
                }
            }
            this.dispose();
            ModeKasir ehh=new ModeKasir();
            ehh.show();            
        }
    }                                        
    private String showKasirList(){
        String kalimat = "";
        System.out.println("Daftar makanan dan minuman yang sudah ditambahkan");
        for (int i = 0; i < data.jumlahMaem.size(); i++) {
            kalimat += jTable1.getValueAt(data.pesananMaem.get(i), 0)+"-"+jTable1.getValueAt(data.pesananMaem.get(i), 1)+"-"+data.jumlahMaem.get(i)+"\n";
        }
        
        for (int i = 0; i < data.jumlahEmik.size(); i++) {
            kalimat += jTable2.getValueAt(data.pesananEmik.get(i), 0)+"-"+jTable2.getValueAt(data.pesananEmik.get(i), 1)+"-"+data.jumlahEmik.get(i)+"\n";
        }
        
        return kalimat;
    }
    private void refreshMaem(){
        DefaultTableModel yeh=new DefaultTableModel();
        yeh.addColumn("Nama");
        yeh.addColumn("Harga");
        FileReader read;
        String line;
        try{
            read=new FileReader("makanan.txt");
            BufferedReader bufferedReader = new BufferedReader(read);
            while ((line = bufferedReader.readLine()) != null) {
                readingLines.add(line);
            }
            bufferedReader.close();
        }catch(Exception e){
            System.out.println(e);
            try {
                data.initMaem();
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ModeKasir.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("File telah dibuat, silahkan mulai ulang program");
        }
        for (int i = 0; i < readingLines.size(); i++) {
            String[] masuk=readingLines.get(i).trim().split("-");
            yeh.addRow(masuk);
        }
        readingLines.clear();
        jTable1=new JTable(yeh);
    }
    private void refreshEmik(){
        DefaultTableModel yeh=new DefaultTableModel();
        yeh.addColumn("Nama");
        yeh.addColumn("Harga");
        FileReader read;
        String line;
        try{
            read=new FileReader("minuman.txt");
            BufferedReader bufferedReader = new BufferedReader(read);
            while ((line = bufferedReader.readLine()) != null) {
                readingLines.add(line);
            }
            bufferedReader.close();
        }catch(Exception e){
            System.out.println(e);
            try {
                data.initEmik();
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ModeKasir.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("File telah dibuat, silahkan mulai ulang program");
        }
        for (int i = 0; i < readingLines.size(); i++) {
            String[] masuk=readingLines.get(i).trim().split("-");
            yeh.addRow(masuk);
        }
        readingLines.clear();
        jTable2=new JTable(yeh);
    }
    
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
            java.util.logging.Logger.getLogger(ModeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeKasir().setVisible(true);
            }
        });
    }
    

    private static ArrayList<String> readingLines=new ArrayList<>();
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
