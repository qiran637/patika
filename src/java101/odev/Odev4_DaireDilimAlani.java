package java101.odev;

import java.util.Scanner;

public class Odev4_DaireDilimAlani {
    public static void main(String[] args) {
        int radius, alpha;
        final double pi = 3.14;
        double sectorArea;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        radius = input.nextInt();
        System.out.println("Enter the angle of the sector : ");
        alpha = input.nextInt();

        //calculate the area of sector
        sectorArea = (pi * (radius * radius) * alpha) / 360;
        System.out.println("The area of the sector is : " + sectorArea);


    }
}
