package java101.conditions_and_codeblocks;

import java.util.Scanner;

public class Odev2_UserInput {
    public static void main(String[] args) {
        String userName, password, newPassword, cevab;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adiniz : ");
        userName = input.nextLine();
        System.out.println("Sifreniz : ");
        password = input.nextLine();

        if (userName.equals("kodliyoruz") && password.equals("java101")) {
            System.out.println("Giris yaptiniz.");
        } else {
            System.out.println("Bilgileriniz yanlis, kontrol ediniz.");
            System.out.println("şifresini sıfırlamak istermisiniz? (Evet icin E, Hayir icin H yaziniz) : ");
            cevab = input.nextLine();
            switch (cevab) {
                case "E":
                    System.out.println("Yeni sifrenizi Giriniz : ");
                    newPassword = input.nextLine();
                    if (!newPassword.equals(password)) {
                        System.out.println("Şifre oluşturuldu");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    break;
                case "H":
                    break;
                default:
                    System.out.println("Sadece E yada H'yi Giriniz.");
            }

        }





    }
}
