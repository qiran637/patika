package java101.loops;

import java.util.Scanner;

public class Odev11_MinMaxSayiBulma {
    public static void main(String[] args) {

        int n, num, min = 0, max = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            num = input.nextInt();

            if (i == 1) {
                min = num;
                max = num;
            }

            if (num<min) min = num;
            if (num>max) max = num;

        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);




    }
}
