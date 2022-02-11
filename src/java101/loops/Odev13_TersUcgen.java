package java101.loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Odev13_TersUcgen {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {

            //loop for print backspace
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            //loop for print (*)
            for (int j = 0; j < 2 * (n - 1 - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
