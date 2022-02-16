package java101.collections;

import java.util.Arrays;

public class Odev6_DiziElemanlarininFrekanslariniBulma {
    public static void main(String[] args) {
        int[] list = {5, 3, 10, 20, 20, 10, 10, 20, 5, 20, 25};
        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(list));

        int counter;
        boolean[] isduplicated = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            counter = 1;
            for (int j = i; j < list.length; j++) {
                if (j!=i && list[i] == list[j] && (!isduplicated[j])) {
                    isduplicated[j] = true;
                   counter++;
                }
            }

            if (!isduplicated[i])
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
        }
    }
}
