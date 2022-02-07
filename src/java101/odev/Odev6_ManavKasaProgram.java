package java101.odev;

import java.util.Scanner;

public class Odev6_ManavKasaProgram {
    public static void main(String[] args) {
        double armutFiyati = 2.14,
                elmaFiyati = 3.67,
                domatesFiyati = 1.11,
                muzFiyati = 0.95,
                patlicanFiyati = 5.00,
                agirlik;
        double toplam = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        agirlik = input.nextDouble();
        toplam += agirlik * armutFiyati;
        System.out.println("Elma Kaç Kilo ? : ");
        agirlik = input.nextDouble();
        toplam += agirlik * elmaFiyati;
        System.out.println("Domates Kaç Kilo ? : ");
        agirlik = input.nextDouble();
        toplam += agirlik * domatesFiyati;
        System.out.println("Muz Kaç Kilo ? : ");
        agirlik = input.nextDouble();
        toplam += agirlik * muzFiyati;
        System.out.println("Patlıcan Kaç Kilo ? ");
        agirlik = input.nextDouble();
        toplam += agirlik * patlicanFiyati;

        System.out.println("Toplam Tutar : " + toplam + " TL");



    }
}
