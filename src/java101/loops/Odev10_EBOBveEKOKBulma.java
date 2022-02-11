package java101.loops;

import java.util.Scanner;

public class Odev10_EBOBveEKOKBulma {
    public static void main(String[] args) {

        int n1, n2, EBOB=0, EKOK;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("Birinci Sayi Giriniz : ");
        n2 = input.nextInt();

        int max = n1 >= n2 ? n1 : n2;

        int i = 1;
        while (i<max/2) {
            if (n1 % i == 0 && n2 % i == 0) {
                EBOB = i;
            }
            i++;
        }
        EKOK = (n1*n2)/EBOB;
        System.out.println(n1 + " ve " + n2 + "'in EBOB'u : " + EBOB);
        System.out.println(n1 + " ve " + n2 + "'in EKOK'u : " + EKOK);

    }
}
