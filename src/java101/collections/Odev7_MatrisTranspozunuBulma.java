package java101.collections;

import java.util.Arrays;

public class Odev7_MatrisTranspozunuBulma {
    public static void main(String[] args) {

        int[][] matrisa = {{ 2, 3, 4}, {5, 6, 7}};
        int[] tempArr = new int[matrisa.length * matrisa[0].length];
        int[][] transpoze = new int[matrisa[0].length][matrisa.length];

        // print the Matrix.
        System.out.println("Matris : ");
        for (int[] a:matrisa){
            for (int i : a)
                System.out.print(i + "   ");
            System.out.println();
        }

        //Find the Transpose of matrix
        for (int i = 0; i < matrisa.length; i++) {
            for (int j = 0; j < matrisa[i].length; j++) {
                tempArr[matrisa[i].length * i + j] = matrisa[i][j];
            }
        }

        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[i].length; j++) {
                transpoze[i][j] = tempArr[transpoze.length * j + i];
            }
        }

        //print the Transpose
        System.out.println("Transpoze : ");
        for (int[] a:transpoze){
            for (int i : a)
                System.out.print(i + "   ");
            System.out.println();
        }

    }
}
