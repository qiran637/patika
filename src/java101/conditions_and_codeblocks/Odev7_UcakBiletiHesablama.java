package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev7_UcakBiletiHesablama {
    public static void main(String[] args) {
        int mesafe;
        byte yas, yolculukTipi;
        double normalTutar, yasIndirimi = 0.0,gidisDonusIndirimi, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextByte();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        yolculukTipi = input.nextByte();

        if (mesafe < 0 || yas < 0 || yolculukTipi<0 || yolculukTipi >2){
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            normalTutar = mesafe * 0.10;
            if (yas <= 12)
                yasIndirimi = normalTutar * 0.5;
            if (yas> 12 && yas <=24)
                yasIndirimi = normalTutar * 0.10;
            if (yas > 65)
                yasIndirimi = normalTutar * 0.20;

            toplam = normalTutar - yasIndirimi;

            if (yolculukTipi==2) {
                gidisDonusIndirimi = toplam * 0.20;
                toplam = (toplam - gidisDonusIndirimi) * 2;
            }

            System.out.println("Toplam Tutar : " + toplam + "TL");
        }

    }
}
