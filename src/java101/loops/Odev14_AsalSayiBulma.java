package java101.loops;

public class Odev14_AsalSayiBulma {
    public static void main(String[] args) {
        /*
         *
         * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         * Senaryo:
         * 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
         */

        for (int i = 2; i <= 100; i++) {

            int j;
            for (j = 2; j <= i; j++) {
                if (i%j==0){
                    break;
                }
            }

            if (j == i) {
                System.out.print(i + " ");
            }

        }
    }
}
