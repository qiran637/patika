package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev3_SinifGecmeDurumu {
    public static void main(String[] args) {
        int math, fizik, kimya, turkce, muzik, dersSayisi = 0;

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

        System.out.println("Muzik Notunuz: ");
        muzik = input.nextInt();

        //average score calculation
        int sum = 0;

        if (math >= 0 && math <= 100) {
            sum += math;
            ++dersSayisi;
        }
        if (fizik >= 0 && fizik <= 100) {
            sum += fizik;
            ++dersSayisi;
        }
        if (kimya >= 0 && kimya <= 100) {
            sum += kimya;
            ++dersSayisi;
        }
        if (turkce >= 0 && turkce <= 100) {
            sum += turkce;
            ++dersSayisi;
        }
        if (muzik >= 0 && muzik <= 100) {
            sum += muzik;
            ++dersSayisi;
        }

        dersSayisi = (dersSayisi == 0) ? 1 : dersSayisi;
        double average = sum / (double)dersSayisi;

        String result = average >=55 ? "Tebrikler! Sinifi Geçtiniz!" : "Sınıfta kaldınız";

        System.out.println("\nOrtalamaniz : " + average);
        System.out.println("**************" + result + "**************");

    }
}
