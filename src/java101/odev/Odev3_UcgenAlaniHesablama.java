package java101.odev;

import java.util.Scanner;

public class Odev3_UcgenAlaniHesablama {
    public static void main(String[] args) {

        int a, b, c;
        double yariCevre, alan;

        System.out.println("Üçgenin kenar uzunluna giriniz:");
        Scanner input = new Scanner(System.in);
        System.out.println("1. kenar uzunluna giriniz : ");
        a = input.nextInt();
        System.out.println("2. kenar uzunluna giriniz : ");
        b = input.nextInt();
        System.out.println("3. kenar uzunluna giriniz : ");
        c = input.nextInt();

        //Ucgenin Alanini hesablama
        yariCevre = (a + b + c) / 2.0;
        alan = Math.sqrt(yariCevre*(yariCevre-a)*(yariCevre-b)*(yariCevre-c));

        System.out.println("Üçgenin alanı : " + alan);





    }
}
