package java101.loops;

import java.util.Scanner;

public class Odev15_FibonacciSerisi {
    public static void main(String[] args) {

        int n, x = 0, y = 1, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Serisi'nin eleman sayisini giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
//            if (i == 1) {
//                System.out.print(x + " " + y + " ");
//            }
            sum = x + y;
            System.out.println(y + " + " + x + " = " + sum);
//            System.out.print(sum + " ");
            x = y;
            y = sum;

        }

    }
}
