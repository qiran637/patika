package java101.methods;

import java.util.Scanner;

public class Odev5_DeseneGoreBestMetotOlusturma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int num = input.nextInt();

        System.out.print("Çıktısı : ");
        recursiveFive(num, num, false);
    }

    public static void recursiveFive(int num, int temp, boolean status) {
        System.out.print(temp + " ");
        if (temp <= 0) {
            status = true;
        }

        temp = status ? temp + 5 : temp - 5;
        if (temp <= num) {
            recursiveFive(num, temp, status);
        }
    }
}
