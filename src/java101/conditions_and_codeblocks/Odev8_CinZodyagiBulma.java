package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev8_CinZodyagiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        int year = input.nextInt();
        int kalan = year%12;
        String result = switch (kalan) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "";
        };

        System.out.println("Çin Zodyağı Burcunuz : " + result);

    }
}
