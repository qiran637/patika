package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev6_BurcBulanProgram {
    public static void main(String[] args) {
        int ay, gun;
        boolean isError = false;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        ay = input.nextInt();
        System.out.print("Dogdugunuz gun : ");
        gun = input.nextInt();

        if (ay >= 1 && ay <= 12) {
            if (ay == 1) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 22)
                        burc = "Kova";
                    else
                        burc = "Oglak";
                }
                else
                    isError = true;
            }
            if (ay == 2) {
                if (gun >= 1 && gun <= 28) {
                    if (gun >= 20)
                        burc = "Balik";
                    else
                        burc = "Kova";
                }
                else
                    isError = true;
            }
            if (ay == 3) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 21)
                        burc = "Koc";
                    else
                        burc = "Balik";
                }
                else
                    isError = true;
            }
            if (ay == 4) {
                if (gun >= 1 && gun <= 30) {
                    if (gun >= 21)
                        burc = "Boga";
                    else
                        burc = "Koc";
                }
                else
                    isError = true;
            }
            if (ay == 5) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 22)
                        burc = "Ikizler";
                    else
                        burc = "Boga";
                }
                else
                    isError = true;
            }
            if (ay == 6) {
                if (gun >= 1 && gun <= 30) {
                    if (gun >= 23)
                        burc = "Yengec";
                    else
                        burc = "Ikizler";
                }
                else
                    isError = true;
            }
            if (ay == 7) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 23)
                        burc = "Aslan";
                    else
                        burc = "Yengec";
                }
                else
                    isError = true;
            }
            if (ay == 8) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 23)
                        burc = "Basak";
                    else
                        burc = "Aslan";
                }
                else
                    isError = true;
            }
            if (ay == 9) {
                if (gun >= 1 && gun <= 30) {
                    if (gun >= 23)
                        burc = "Terazi";
                    else
                        burc = "Basak";
                }
                else
                    isError = true;
            }
            if (ay == 10) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 23)
                        burc = "Akrep";
                    else
                        burc = "Terazi";
                }
                else
                    isError = true;
            }
            if (ay == 11) {
                if (gun >= 1 && gun <= 30) {
                    if (gun >= 22)
                        burc = "Yay";
                    else
                        burc = "Akrep";
                }
                else
                    isError = true;
            }
            if (ay == 12) {
                if (gun >= 1 && gun <= 31) {
                    if (gun >= 22)
                        burc = "Oglak";
                    else
                        burc = "Yay";
                }
                else
                    isError = true;
            }

            if (isError)
                System.out.println("Hatali gun girisi yaptiniz.");
            else
                System.out.println("Burcunuz : " + burc);

        } else {
            System.out.println("Hatali ay girisi yaptiniz.");
        }
    }
}
