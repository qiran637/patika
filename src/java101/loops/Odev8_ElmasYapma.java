package java101.loops;

import java.util.Scanner;

public class Odev8_ElmasYapma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = input.nextInt();
        for (int i = 0; i< 2*n-1; i++){

            int degisken = i < n ? i : (2 * n - 2 - i);
            //loop for print black space
            for(int j = 0; j < n-1-degisken ;j++) System.out.print(" ");
            //loop for print * sign
            for (int j = 0; j < 2*degisken+1; j++) System.out.print("*");

            System.out.println();
        }

    }
}
