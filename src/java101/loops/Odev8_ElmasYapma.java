package java101.loops;

public class Odev8_ElmasYapma {
    public static void main(String[] args) {

        for (int i = 5; i>=-3;i--){
            //System.out.print("\t");
            int j=0;
            for(; j<Math.abs(i-1);j++){
                System.out.print(" ");
            }
            for(int k=8; k>=Math.abs(i-1)+j;k--) {
                System.out.print("*");
            }
            if (i==-3)
                break;
            System.out.println();
        }

    }
}
