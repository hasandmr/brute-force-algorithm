package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bruteforce oluşturacak kelimeleri giriniz !!! :  ");
            //burda random şifreler üretiliyor 

        Scanner input = new Scanner(System.in);
        String r = input.next();
        String ç = "";
        ArrayList<String> liste = new ArrayList<>();
        int b = r.length();
        for (int v = 0; v < 20000; v++) {
            for (int w = 0; w < 5; w++) {
                Random rand = new Random();
                int e = rand.nextInt(b);
                String n = r.substring(e, e + 1);
                System.out.print(n);
                System.out.print("");
                ç += n;
            }
            liste.add(ç);
            ç = "";
            System.out.println();
        }
         // oluşan şifreyi masaüstüne txt'ye atıyor
        String dosyaYolu = "C:\\Users\\hasan\\Desktop//metin1.txt";    .

        try {
            FileWriter fw = new FileWriter(dosyaYolu);
            PrintWriter writer = new PrintWriter(fw);
            for (int index = 0; index < liste.size(); index++) {
                writer.println(liste.get(index));
            }
            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı Hatası : " + ex);
        } catch (IOException ioe) {
            System.out.println("Giriş Hatası : " + ioe);
        }
    }
}


