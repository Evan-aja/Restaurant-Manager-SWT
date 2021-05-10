package AppSource;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    ArrayList<Makanan> makananArrayList;
    ArrayList<Minum> minumanArrayList;

    App(){
        makananArrayList = new ArrayList<Makanan>();
        minumanArrayList = new ArrayList<Minum>();
    }

    void panelTambahMenu(){
        int counter = makananArrayList.size();
        int counter1 = minumanArrayList.size();
        while(true) {
            String nama;
            long harga;
            System.out.println("Apa yang ingin anda tambahkan? (pilih angka)");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Exit");
            String jenis = input.nextLine();
            if (jenis.equals("1")) {
                System.out.print("Nama makanan : ");
                nama = input.nextLine();
                System.out.print("\nHarga : ");
                harga = input.nextLong();
                input.nextLine();
                tambahMakanan(nama, harga);
                if (makananArrayList.size() - counter == 1) {
                    System.out.println("Penambahan berhasil!");
                }
            } else if (jenis.equals("2")) {
                System.out.print("Nama minuman : ");
                nama = input.nextLine();
                System.out.print("\nHarga : ");
                harga = input.nextLong();
                input.nextLine();
                tambahMinuman(nama, harga);
                if (minumanArrayList.size() - counter1 == 1) {
                    System.out.println("Penambahan berhasil!");
                }
            }else if(jenis.equals("3")){
                return;
            }
        }
    }

    void tambahMakanan(String nama,long harga){
        makananArrayList.add(new Makanan(nama,harga));
    }

    void tambahMinuman(String nama,long harga){
        minumanArrayList.add(new Minum(nama,harga));
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

class Makanan extends Menu{
    Makanan(String nama,long harga){
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
