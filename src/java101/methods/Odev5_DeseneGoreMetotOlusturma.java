package java101.methods;

import java.util.Scanner;

public class Odev5_DeseneGoreMetotOlusturma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int num = input.nextInt();

        System.out.print("Çıktısı : ");
        recursiveFive(num, 0, 0);
    }

    public static void recursiveFive(int n, int plusCounter, int minusCounter) {

        if (n > 0 && minusCounter == 0) {
            System.out.print(n + " ");
            plusCounter++;
            n = n - 5;
        } else if (minusCounter != 0) {
            minusCounter++;
            n = n + 5;
            System.out.print(n + " ");
        }
        if (n <= 0) {
            minusCounter++;
            System.out.print(n + " ");
        }
        if (plusCounter >= minusCounter) {
            recursiveFive(n, plusCounter, minusCounter);
        }
    }
}
