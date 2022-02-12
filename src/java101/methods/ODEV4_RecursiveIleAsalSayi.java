package java101.methods;

import java.util.Scanner;

public class ODEV4_RecursiveIleAsalSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int num = input.nextInt();
        isPrimeNumber(num);

    }

    private static boolean isPrimeNumber(int num, int i) {

        if (num == 2) {
            System.out.print("2 sayısı ASALDIR !");
            return true;
        }
        if (num % i == 0) {
            System.out.println(num + " sayısı ASAL değildir !");
            return false;
        }
        if (i * i > num) {
            System.out.print(num + " sayısı ASALDIR !");
            return true;
        }

        return isPrimeNumber(num, i + 1);
    }

    public static void isPrimeNumber(int num) {
        isPrimeNumber(num, 2);
    }
}
