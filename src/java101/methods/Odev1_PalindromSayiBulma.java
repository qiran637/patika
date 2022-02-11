package java101.methods;

import java.util.Scanner;

public class Odev1_PalindromSayiBulma {
    /*
     * Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyniz.
     *
     * Palindrom Sayı:
     *
     * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     *
     * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    public static boolean isPalindrom(int num) {
        int temp = num, reverse = 0, lastNumber;

        while (temp != 0) {

            lastNumber = temp%10;
            reverse = (reverse * 10) + lastNumber;
            temp = temp/10;
        }

        return num == reverse ? true : false;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz : ");

        if (isPalindrom(input.nextInt()))
            System.out.println("Girdiginiz sayi palindrom sayidir.");
        else
            System.out.println("Girdiginiz sayi palindrom sayi degildir.");

    }
}
