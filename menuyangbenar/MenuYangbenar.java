/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuyangbenar;

import java.io.*;
import java.util.*;

/**
 *
 * @author evan
 */
public class MenuYangbenar {
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
class data{
    static ArrayList<Integer> pesananMaem=new ArrayList<>();
    static ArrayList<Integer> jumlahMaem=new ArrayList<>();
    static ArrayList<Integer> pesananEmik=new ArrayList<>();
    static ArrayList<Integer> jumlahEmik=new ArrayList<>();
    
    private static String dataStrukk;
    
    static void setdataStruk(String dataStruk){
        dataStrukk = dataStruk;
    }
    
    static String getdataStruk(){
        return dataStrukk;
    }
    static void initMaem()throws Exception{
        init("makanan.txt");
    }
    static void initEmik()throws Exception{
        init("minuman.txt");
    }
    static void tambahMaem(String nama,String harga)throws Exception{
        tambah("makanan.txt",nama,harga);
    }
    static void tambahEmik(String nama,String harga)throws Exception{
        tambah("minuman.txt",nama,harga);
    }
    static void hapusMaem(String nama,String harga)throws Exception{
        delete("makanan.txt",nama,harga);
    }
    static void hapusEmik(String nama,String harga)throws Exception{
        delete("minuman.txt",nama,harga);
    }
    private static void init(String fileString) throws Exception {
        FileReader read;
        try{
            read=new FileReader(fileString);
        }catch(FileNotFoundException e){
            File file=new File(fileString);
            file.createNewFile();
            read=new FileReader(file);
        }
    }
    private static void tambah(String file,String nama,String harga)throws Exception{
        FileReader read=new FileReader(file);
        boolean ada=ada(read,nama,harga);
        if(ada==false){
            Writer add;
            add=new FileWriter(file,true);
            add.append(nama + "-" + harga + "\n");
            add.close();
        }
    }
    private static boolean ada(FileReader file,String nama,String harga)throws Exception{
        BufferedReader bufferedReader = new BufferedReader(file);
        boolean a=false;
        String lines;
        while ((lines=bufferedReader.readLine()) != null) {
            String line[]=lines.trim().split("-");
            if(line[0].equalsIgnoreCase(nama) && line[1].equals(harga))return a=true;
        }
        return a;
    }
    static void printer()throws Exception{
        FileReader read;
        String[] file={"makanan.txt","minuman.txt"};
        ArrayList<String> readingLines=new ArrayList<>();
        String line;
        try{
            for(int i=0;i<file.length;i++){
                read=new FileReader(file[i]);
                BufferedReader bufferedReader = new BufferedReader(read);
                while ((line = bufferedReader.readLine()) != null) {
                    readingLines.add(line);
                }
                bufferedReader.close();
                for (int j = 0; j < readingLines.size(); j++) {
                    System.out.println(readingLines.get(j));
                }
            }
        }catch(FileNotFoundException e){
            
        }
    }
    private static void delete(String namaFile,String nama, String harga)throws Exception{
        init("tmp"+namaFile);
        FileReader read;
        ArrayList<String> readingLines=new ArrayList<>();
        String line;

        read=new FileReader(namaFile);
        BufferedReader bufferedReader = new BufferedReader(read);
        while ((line = bufferedReader.readLine()) != null) {
            readingLines.add(line);
        }
        bufferedReader.close();
        for (int i = 0; i < readingLines.size(); i++) {
            String []tmp=readingLines.get(i).trim().split("-");
            if(tmp[0].equalsIgnoreCase(nama) && tmp[1].equalsIgnoreCase(harga));
            else tambah("tmp"+namaFile,tmp[0],tmp[1]);
        }

        BufferedWriter out = new BufferedWriter (new FileWriter(namaFile));
        out.write("aString1\n");out.close();
        boolean success = (new File(namaFile)).delete();
        
        init(namaFile);
        FileReader read2;
        ArrayList<String> readingLines2=new ArrayList<>();
        String line2;

        read2=new FileReader("tmp"+namaFile);
        BufferedReader bufferedReader2 = new BufferedReader(read2);
        while ((line = bufferedReader2.readLine()) != null) {
            readingLines2.add(line);
        }
        bufferedReader2.close();
        for (int i = 0; i < readingLines2.size(); i++) {
            String []tmp=readingLines2.get(i).trim().split("-");
            tambah(namaFile,tmp[0],tmp[1]);
        }
        
        BufferedWriter out2 = new BufferedWriter (new FileWriter("tmp"+namaFile));
        out2.write("aString1\n");out2.close();
        boolean success2 = (new File("tmp"+namaFile)).delete();
    }
}
