package java101.collections;

public class Odev1_HarmonikSeriOrtalama {


    public static void main(String[] args) {
        int[] dizi = {15, 26, 35, 27, 45, 56, 49, 65, 39};
        double harmonikToplam = 0.0;

        for (int i = 1; i <= dizi.length; i++) {
            harmonikToplam += 1.0 / dizi[i];
        }
        System.out.println(dizi.length / harmonikToplam);

        while (true) {
            System.out.println("local changessssssssssssssssssssss");
        }
    }

    public void newMethod() {
        System.out.println("local method");
    }
}
