package java101.loops;

import java.util.Scanner;

public class Odev3_4ve5inKuvvetleri {

    public static void main(String[] args) {
        /*  Ödev
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
         * ekrana yazdıran programı yazıyoruz.
         * 4^0 = 0
         * 4^1 = 4
         * 4^2 = 16
         * 4^3 = 32
         * 4^4 = 128
         * 4^5 = 4
         **/


        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sinir sayinizi giriniz : ");
        n = input.nextInt();

        System.out.println("4'dün kuvvetleri: ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("\n5'in kuvvetleri: ");

        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + " ");
        }

    }
}
