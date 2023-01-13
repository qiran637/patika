package java101.collections;

import java.util.Scanner;

public class Odev2_MinMaxClosestValueInArray {
    /**
     * Ödev
     *
     * Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
     *
     * Dizi : {15,12,788,1,-1,-778,2,0}
     * Girilen Sayı : 5
     * Girilen sayıdan küçük en yakın sayı : 2
     * Girilen sayıdan büyük en yakın sayı : 12
     */

    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int x = input.nextInt();
        int diff, diffMin, diffMax, greaterClosest = 0 ,smallerClosest=0;
        diffMax =  Integer.MIN_VALUE;
        diffMin = Integer.MAX_VALUE;

        for (int i : list) {
            diff = x - i;
            if (diff < 0 && diff >= diffMax) {
                diffMax = diff;
                greaterClosest = i;
            }
            if (diff > 0 && diff <= diffMin) {
                diffMin = diff;
                smallerClosest = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + smallerClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + greaterClosest);
        
                System.out.println("remote kafjlkadjflkjdsf");
    }
}
