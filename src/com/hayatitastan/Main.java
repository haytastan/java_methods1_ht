package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 3.10.2022
 **/

public class Main {
    public static void main(String[] args) {
        int diziToplami;
        diziToplami = toplaDizi(1, 2, 3, 4, 5, 6);
        System.out.println("Dizi Toplamı: " + diziToplami);
    }

    public static int toplaDizi(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }
        return toplam;
    }
}
