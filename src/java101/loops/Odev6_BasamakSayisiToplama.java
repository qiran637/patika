package java101.loops;

import java.util.Scanner;

public class Odev6_BasamakSayisiToplama {
    public static void main(String[] args) {
        /*
         * Ödev
         * Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
         * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */
        long  number, basNumber;
        int result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = input.nextLong();


        while (number != 0) {
            basNumber = number%10;
            result += basNumber;
            number /=10;
        }

        System.out.println("Sonuç : " + result);

    }
}
