package java101.odev;

import java.util.Scanner;

public class Odev5_VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, vucutIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vucutIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vucutIndeksi);


    }
}
