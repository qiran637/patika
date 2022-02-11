package java101.methods;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Serisi'nin hangi elemanini istiyorsunuz : ");
        System.out.println(fibonacciTap(input.nextInt()));
    }

    public static int fibonacciTap(int num){

        if (num==2 || num == 1){
            return 1;
        }

        return fibonacciTap(num -1) + fibonacciTap(num-2);
    }

}
