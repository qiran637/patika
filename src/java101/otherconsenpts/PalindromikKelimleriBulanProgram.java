package java101.otherconsenpts;

import java.util.Scanner;

public class PalindromikKelimleriBulanProgram {

    public static boolean isPalindrom(String kelime) {
        String reserve = "";
        for (int i = kelime.length()-1; i >= 0; i--) {
            reserve += kelime.charAt(i);
        }

        return reserve.equals(kelime);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");

        if (isPalindrom(input.next()))
            System.out.println("Palindromik Kelime");
        else
            System.out.println("Palindromik Kelime degildir");

    }


//    static boolean isPalindrom(String str) {
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }

}
