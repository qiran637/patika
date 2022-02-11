package java101.loops;

import java.util.Scanner;

public class ODEV11_MinMaxSayiBulma {
    public static void main(String[] args) {

        int n, num, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            num = input.nextInt();
            if (num<min) min = num;
            if (num>max) max = num;

        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);




    }
}
