package java101.odev;

import java.util.Scanner;

public class NotOrtalamaProgram {
    public static void main(String[] args) {
        int math, fizik, kimya, turkce, tarih, muzik;

        //define the Scanner object
        Scanner input = new Scanner(System.in);

        //get value from user
        System.out.println("Matematik Notunuz: ");
        math = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik = input.nextInt();

        //average score calculation
        int sum = math + fizik + kimya + turkce + tarih + muzik;
        double average = sum / 6.0;

        String result = average >=60 ? "Sinifi Geçtiniz!" : "Sınıfta kaldınız!";

        System.out.println("\nOrtalamaniz : " + average);
        System.out.println("**************" + result + "**************");

    }
}
