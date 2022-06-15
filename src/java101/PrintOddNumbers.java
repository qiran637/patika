package java101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintOddNumbers {

    public static void printOddNumbersBetween(int minValue, int maxValue) {

        List<Integer> oddNumbers = new ArrayList<>();

        if (minValue == maxValue) {
            System.out.println("Values entered should not be equal!!!!");
        } else {
            int temp;
            if (minValue > maxValue) {
                temp = minValue;
                minValue = maxValue;
                maxValue = temp;
            }
            for (int i = minValue; i <= maxValue; i++) {
                if (i % 2 != 0) {
                    oddNumbers.add(i);
                }
            }

            System.out.printf("Odd numbers between %s and %s are: %s", minValue, maxValue, oddNumbers);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int minValue = input.nextInt();
        System.out.println("Enter another integer number: ");
        int maxValue = input.nextInt();

        printOddNumbersBetween(minValue, maxValue);

    }

}
