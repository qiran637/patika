package java101.loops;

import java.util.Scanner;

public class Odev8_ElmasYapma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = input.nextInt();
        int i = 0;
        while (i< 2*n-1){
            //System.out.print("\t");
            int j;
            for(j = 0; j < Math.abs(i+1-n) ;j++){
                System.out.print(" ");
            }

            int val = i < n ? i : (2 * n - 2 - i);

            for (int k = 0; k < 2*val+1; k++) {
                System.out.print("*");
            }

            System.out.println();
            i++;

        }

    }
}
