package java101.loops;

import java.util.Scanner;

public class Odev4_KombinasyonHesablama {
    public static void main(String[] args) {

        //C(n,r) = n! / (r! * (n-r)!)
        int n, r, fakn = 1, fakr = 1, fakf=1, combination;
        Scanner input = new Scanner(System.in);
        System.out.print("n'in degerini giriniz : ");
        n = input.nextInt();
        System.out.print("r'in degerini giriniz : ");
        r = input.nextInt();

        if (n>=r){

            for (int i = 1; i <= n; i++) {
                fakn *= i;
                if (i <= r) fakr *= i;
                if (i <= n - r) fakf *= i;
            }

            combination = fakn/(fakr*fakf);
            System.out.println("C(" + n + "," + r + ") = " + combination);

        } else
            System.out.println("n>=r olmalidir.");

    }
}
