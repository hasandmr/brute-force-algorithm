package com.encryption;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        while (x < 1000) {
            System.out.println(kodkampusu_sifreolusturma(5));
            x++;
        }
    }

    static char[] kodkampusu_sifreolusturma(int uzunlukdegeri) {
        String karakterler = "fırat";

        String deger = karakterler;

        char[] sifre = new char[uzunlukdegeri];
        int i;
        for (i = 0; i < uzunlukdegeri; i++) {
            Random rastgelesifre = new Random();
            sifre[i] += deger.charAt(rastgelesifre.nextInt(deger.length()));
        }
        System.out.print("Oluşturulan şifre = ");
        return sifre;
    }

}




