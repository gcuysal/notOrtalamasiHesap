package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat,fiz,kim,bio,tur,muzik;

        //Scanner icin nesne uret-Sınıfı tanımla

        Scanner value = new Scanner(System.in);

        //Kullanici degerini al

        System.out.println("Matematik notunuz: ");
        mat = value.nextInt();
        System.out.println("Fizik notunuz: ");
        fiz = value.nextInt();
        System.out.println("Kimya notunuz: ");
        kim = value.nextInt();
        System.out.println("Biyoloji notunuz: ");
        bio = value.nextInt();
        System.out.println("Türkçe notunuz: ");
        tur = value.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = value.nextInt();

        //Veriler Toplami-Ortalama-Yazdir

        int toplam = (mat+fiz+kim+bio+tur+muzik);
        double ortalama = toplam/6;
        System.out.println("Ogrenci ortalamasi: " + ortalama);

        System.out.println( ortalama >= 60 ? "Geçti" : "Kaldı");

    }
}
