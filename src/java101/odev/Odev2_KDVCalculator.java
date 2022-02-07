package java101.odev;

import java.util.Scanner;

public class Odev2_KDVCalculator {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        kdvOran = tutar > 1000 ? 0.08 : 0.18;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.printf("KDV'siz  Fiyat\t:   %.2f TL\n", tutar);
        System.out.printf("KDV tutari    \t:   %.2f TL\n", kdvTutar);
        System.out.printf("KDV'li Fiyat\t:   %.2f TL\n", kdvliTutar);
    }
}
