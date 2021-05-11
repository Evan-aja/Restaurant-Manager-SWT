/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author evan
 */
public class AppGui extends javax.swing.JFrame {
    
//--------variable buatan sendiri----------
    ArrayList<Makan> makananArrayList;
    ArrayList<Minum> minumanArrayList;
//--------variable buatan sendiri----------


    /**
     * Creates new form AppGui
     */
    public AppGui() {
        initComponents();
        makananArrayList = new ArrayList<Makan>();
        minumanArrayList = new ArrayList<Minum>();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selamat datang user!");

        jButton1.setText("1. Tambah menu makanan atau minuman");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2. Masuk mode kasir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3. Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apa yang ingin anda lakukan?");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame confirm=new JFrame();
        JPanel isi=new JPanel();
        JLabel label=new JLabel();
        String[] pilihan={"Makanan","Minuman"}; 
        int result = JOptionPane.showOptionDialog(
                confirm,
                "Apa yang ingin anda tambahkan?", 
                "Penambahan Menu",            
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //no custom icon
                pilihan,  //button titles
                pilihan[0] //default button
            );
            if(result == JOptionPane.YES_OPTION){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Makanan().setVisible(true);
                    }
                });
            }else if (result == JOptionPane.NO_OPTION){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Minuman().setVisible(true);
                    }
                });
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ModeKasir.addArray(maem,emik);
        ModeKasir ehh=new ModeKasir();
        ehh.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // for(Makan makanan : makananArrayList){
        //     System.out.println("makanan : "+makanan.getNama());
        //     System.out.println("harga : "+makanan.getHarga());
        //     System.out.println();

        // }
        // for(Minum minuman : minumanArrayList){
        //     System.out.println("minuman : "+minuman.getNama());
        //     System.out.println("harga : "+minuman.getHarga());
        //     System.out.println();

        // }
       JFrame exit = new JFrame("Exit");
       if (JOptionPane.showConfirmDialog( exit,"Apakah Anda Yakin?","Exit",
           JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
           System.exit(0);
       else return;
       exit.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
                                      

    
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
            java.util.logging.Logger.getLogger(AppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        App.tambahMakanan("Dhaharan", 1230);
        App.tambahMinuman("Unjukan", 3450);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGui().setVisible(true);
            }
        });
    }
    
    public static ArrayList<String> maem=new ArrayList<>();
    public static ArrayList<String> emik=new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

class App {
    Scanner input = new Scanner(System.in);
    static ArrayList<Makan> makananArrayList = new ArrayList<Makan>();
    static ArrayList<Minum> minumanArrayList = new ArrayList<Minum>();

    App(){
        makananArrayList = new ArrayList<Makan>();
        minumanArrayList = new ArrayList<Minum>();
    }

    static void tambahMakanan(String nama,long harga){
        makananArrayList.add(new Makan(nama,harga));
        if(AppGui.maem.size()<makananArrayList.size()){
            AppGui.maem.add(App.makananToString(makananArrayList.size()-1));
        }
    }

    static void tambahMinuman(String nama,long harga){
        minumanArrayList.add(new Minum(nama,harga));
        if(AppGui.emik.size()<minumanArrayList.size()){
            AppGui.emik.add(App.minumanToString(minumanArrayList.size()-1));
        }
    }
    static String makananToString(int index){
        String a=makananArrayList.get(index).getNama()+" "+makananArrayList.get(index).getHarga();
        return a;
    }
    static String minumanToString(int index){
        String a=minumanArrayList.get(index).getNama()+" "+minumanArrayList.get(index).getHarga();
        return a;
    }

    void panelModeKasir(){
        int totalHarga = 0;
        ArrayList<Menu> total = new ArrayList<>();
        while (true) {
            System.out.println("Apa yang ingin anda lakukan? (pilih angka)");
            System.out.println("1. Tambah makanan/minuman");
            System.out.println("2. Lihat struk(selesai)");
            System.out.println("3. Exit");
            String x = input.nextLine();
            if(x.equalsIgnoreCase("1")){
                tambah(total);
            }else if(x.equalsIgnoreCase("2")){
                cetakStruk(total);
            }else if(x.equals("3")){
                return;
            }
        }
    }

    void tambah(ArrayList<Menu> total){
        int totalSebelum = total.size();
        System.out.print("Masukkan nama makanan/minuman : ");
        String nama = input.nextLine();
        for (int i = 0; i < makananArrayList.size(); i++) {
            if(makananArrayList.get(i).getNama().equalsIgnoreCase(nama)){
                total.add(makananArrayList.get(i));
            }
        }
        if(total.size()-totalSebelum != 1){
            for (int i = 0; i < minumanArrayList.size(); i++) {
                if(minumanArrayList.get(i).getNama().equalsIgnoreCase(nama)){
                    total.add(minumanArrayList.get(i));
                }
            }
        }
        if(total.size()-totalSebelum == 1){
            System.out.println(nama+ " berhasil ditambahkan!");
        }
    }
    void cetakStruk(ArrayList<Menu> total){
        long totalHarga =0;
        System.out.printf("%-15s %-10s\n","Nama","Harga");
        for (int i = 0; i < total.size(); i++) {
            totalHarga += total.get(i).getHarga();
        }
        for(int i = 0; i < total.size(); i++){
            System.out.printf("%-15s %-10s\n",total.get(i).getNama(),total.get(i).getHarga());
        }
        System.out.printf("%-15s %-10d\n","Total",totalHarga);
        System.out.println("Terima kasih telah mengunjungi");
    }


}

abstract class Menu{
    private String nama;
    private long harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
}

class Makan extends Menu{
    Makan(String nama, long harga) {
        setNama(nama);
        setHarga(harga);
    }

}

class Minum extends Menu{
    Minum(String nama,long harga){
        setNama(nama);
        setHarga(harga);
    }
}
