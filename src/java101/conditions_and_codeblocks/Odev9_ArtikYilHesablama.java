package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev9_ArtikYilHesablama {
    public static void main(String[] args) {
        int year;
        boolean isArti=false;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if (year%4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isArti = true;
            } else
                isArti = true;
        }

        if (isArti)
            System.out.println(year + " bir artık yıldır !");
        else
            System.out.println(year + " bir artık yıl değildir !");


    }
}
