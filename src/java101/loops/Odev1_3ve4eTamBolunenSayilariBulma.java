package java101.loops;

import java.util.Scanner;

public class Odev1_3ve4eTamBolunenSayilariBulma {
    public static void main(String[] args) {
        /*
        *
        * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        * 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        *
         */
        int num, sum = 0, counter = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi Giriniz : ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i%3==0 && i%4 == 0){
                sum += i;
                counter++;
            }
        }

        average = sum / (double)counter;
        System.out.println("Sonuc : " + average);
    }
}
