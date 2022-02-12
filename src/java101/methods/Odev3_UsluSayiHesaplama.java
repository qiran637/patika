package java101.methods;

import java.util.Scanner;

public class Odev3_UsluSayiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, n;

        System.out.print("Taban değeri giriniz : ");
        x = input.nextDouble();
        System.out.print("Üs değerini giriniz : ");
        n = input.nextDouble();
        System.out.println("Sonuç : " + pow(x, n));

    }

    public static double pow(double x, double n) {


        if (x == 0) {
            return 0;
        }
        if (x == 1 || n == 0){
            return 1;
        }
        if (n == 1) {
            return x;
        }

//        if (x < 0 && (n < 1 && n>0)) {
//            System.out.println("NaN");
//            return 0;
//        }
//        if (x > 0 && n < 1 && n>0){
//            return Math.pow(x, n);
//        }

        if (n < 0) {
            n = -n;
            x = 1.0/x;
        }



        return x * pow(x, n-1);
    }

}
