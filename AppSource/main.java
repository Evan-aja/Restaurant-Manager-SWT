package AppSource;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App app = new App();

        //makanan
        app.tambahMakanan("Nasi goreng", 25000);
        app.tambahMakanan("Tahu goreng", 15000);
        app.tambahMakanan("Pisang goreng", 10000);
        app.tambahMakanan("Ayam bakar", 20000);
        app.tambahMakanan("Daging panggang", 35000);

        //minuman
        app.tambahMinuman("Jus mangga", 5000);
        app.tambahMinuman("Jus alpukat", 6000);
        app.tambahMinuman("Air mineral", 5000);

        while (true) {
            System.out.println("Selamat datang user!");
            System.out.println("Apa yang ingin anda lakukan? (pilih angka)");
            System.out.println("1. Tambah menu makanan atau minuman");
            System.out.println("2. Masuk mode kasir");
            System.out.println("3. Exit");
            String x = input.nextLine();

            if (x.equals("1")) {
                app.panelTambahMenu();
            } else if (x.equals("2")) {
                app.panelModeKasir();
            } else if (x.equals("3")) {
                return;
            }
        }
    }
    private static void tambah(App input){

    }
}
