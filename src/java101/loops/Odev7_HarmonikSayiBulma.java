package java101.loops;

import java.util.Scanner;

public class Odev7_HarmonikSayiBulma {
    public static void main(String[] args) {

        int basNum;
        double result = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        basNum = input.nextInt();

        for (int i = 1; i <= basNum; i++) {
            result +=  1/(double)i;
        }

        System.out.println(result);




    }
}
