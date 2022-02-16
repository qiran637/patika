package java101.collections;

public class Odev7_MatrisTranspozunuBulma {
    public static void main(String[] args) {

        int[][] matrisa = {{ 2, 3, 4}, {5, 6, 7}};
        int[][] matrisa_T = new int[matrisa[0].length][matrisa.length];

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
                matrisa_T[j][i] = matrisa[i][j];
            }
        }


        //print the Transpose
        System.out.println("Transpoze : ");
        for (int[] a:matrisa_T){
            for (int i : a)
                System.out.print(i + "   ");
            System.out.println();
        }

    }
}
