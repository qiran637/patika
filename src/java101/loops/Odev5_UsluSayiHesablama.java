package java101.loops;

import java.util.Scanner;

public class Odev5_UsluSayiHesablama {
    public static void main(String[] args) {
        /*
       *
       *
       * Ödev
       * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
       * programı "For Döngüsü" kullanarak yapınız.
       *
       */

        int n, k, toplam = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alanacak sayı : ");
        n = input.nextInt();
        System.out.println("Üs olacak sayı : ");
        k = input.nextInt();

        for (int i = 0; i < k; i++) {
            toplam *= n;
        }

        System.out.println(n + "^" + k + " = " + toplam);

    }
}
