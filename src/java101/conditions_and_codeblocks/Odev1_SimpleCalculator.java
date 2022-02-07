package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev1_SimpleCalculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                    System.out.println("Bölme : " + (n1 / n2));
                else
                    System.out.println("Bir sayı 0'a bölünemez!");
                break;
            default:
                System.out.println("Yanliş seçim yaptınız. Tekrar deneyiniz!");
        }
    }
}
