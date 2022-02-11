package java101.loops;

import java.util.Scanner;

public class Odev12_MukemmelSayiBulma {
    public static void main(String[] args) {

        int num, toplam = 0;
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                toplam += i;
            }
        }

        if (num == toplam)
            System.out.println(num + " Mükemmel sayıdır.");
        else
            System.out.println(num + " Mükemmel sayı değildir.");




    }
}
