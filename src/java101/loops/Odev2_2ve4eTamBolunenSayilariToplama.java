package java101.loops;

import java.util.Scanner;

public class Odev2_2ve4eTamBolunenSayilariToplama {
    public static void main(String[] args) {
        /*
        *
        * Ödev
        * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        * ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        *
         */
        int num, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayiyi Giriniz : ");
            num = input.nextInt();
            if (num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);



        System.out.println("Sonuc : " + sum);
    }
}
