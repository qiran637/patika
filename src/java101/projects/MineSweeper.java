package java101.projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private final int rawNumber;
    private final int columnNumber;
    private final int mineNumber;
    private String[][] mineMap;
    private String[][] mineFiled;

    public MineSweeper(int rawNumber, int columnNumber) {
        this.rawNumber = rawNumber;
        this.columnNumber = columnNumber;
        this.mineNumber = (rawNumber*columnNumber)/4;
        createMineMapAndFiled();
    }

    public void run(){
        printMineMap();
        System.out.println("\n*** Mayın Tarlası Oyuna Hoşgeldiniz ! ***\n");
        printMineFiled();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Satır Giriniz : ");
            int x = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int y = input.nextInt();
            if(x<0 || y<0 || x>=rawNumber || y >= columnNumber){
                System.out.println("Yanlış satır yada sütün girdiniz. Kontröl ediniz!");
                continue;
            }
            if (mineMap[x][y]=="x"){
                System.out.println("Ziyaret edildi, değer konumlara bakınız.");
                continue;
            }
            if (scanMine(x, y)) {
                System.out.println("Oyunu Kaybettiniz !!!!!");
                break;
            }
            printMineFiled();
            if(isMarkedAll()){
                System.out.println("Oyunu Kazandınız !");
                break;
            }
        }

    }

    public void printMineMap(){
        System.out.println("Mayınların Konumu: ");
        for(String[] arr : mineMap){
            for(String a : arr) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }
        System.out.println("==================================");
    }
    public void printMineFiled(){
        for(String[] arr : mineFiled){
            for(String a : arr) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }
        System.out.println("==================================");
    }


    public void createMineMapAndFiled(){
        mineMap = new String[rawNumber][columnNumber];
        mineFiled = new String[rawNumber][columnNumber];
        Random random = new Random();
        random.nextInt(rawNumber * columnNumber);
        int[] indices = new int[mineNumber];
        int k = 0;
        while (k != mineNumber) {
            boolean exist = false;
            int value = random.nextInt(rawNumber * columnNumber);
            for (int j = 0; j < mineNumber; j++) {
                if (value == indices[j]) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                indices[k] = value;
                k++;
            }
        }
        Arrays.sort(indices);
        int g = 0;
        for (int i = 0; i < rawNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                mineFiled[i][j] = "-";
                if(g < indices.length && ((i*columnNumber)+j == indices[g])){
                    mineMap[i][j] = "*";
                    g++;
                } else {
                    mineMap[i][j] = "-";
                }

            }
        }

    }

    public boolean scanMine(int x, int y){
        int mineCounter = 0;
        if(mineMap[x][y]!="*"){
            mineMap[x][y]="x";
            if (x-1<0){
                if (y-1<0){
                    if (mineMap[x][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y+1]=="*"){
                        mineCounter++;
                    }
                }
                if (y+1>=columnNumber){
                    if (mineMap[x][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y]=="*"){
                        mineCounter++;
                    }
                }
                if (y-1>=0 && y+1<columnNumber){
                    if (mineMap[x][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y-1]=="*"){
                        mineCounter++;
                    }
                }

            }
            else if (x+1<rawNumber) {
                if (y-1<0) {
                    if (mineMap[x-1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y]=="*"){
                        mineCounter++;
                    }
                }

            }
            if (x+1>=rawNumber){
                if (y+1>=columnNumber){
                    if (mineMap[x-1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x][y-1]=="*"){
                        mineCounter++;
                    }
                }
                if (y-1<0){
                    if (mineMap[x-1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x][y+1]=="*"){
                        mineCounter++;
                    }
                }
                if (y-1>=0 && y+1<columnNumber){
                    if (mineMap[x][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y+1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x][y+1]=="*"){
                        mineCounter++;
                    }
                }

            }
            else if (x-1>=0){
                if (y+1>=columnNumber){
                    if (mineMap[x-1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x+1][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x][y-1]=="*"){
                        mineCounter++;
                    }
                    if (mineMap[x-1][y-1]=="*"){
                        mineCounter++;
                    }
                }
            }
            if(x-1>=0 && x+1<rawNumber && y-1>=0 && y+1<columnNumber){
                if (mineMap[x-1][y]=="*"){
                    mineCounter++;
                }
                if (mineMap[x-1][y+1]=="*"){
                    mineCounter++;
                }
                if (mineMap[x][y+1]=="*"){
                    mineCounter++;
                }
                if (mineMap[x+1][y+1]=="*"){
                    mineCounter++;
                }
                if (mineMap[x+1][y]=="*"){
                    mineCounter++;
                }
                if (mineMap[x+1][y-1]=="*"){
                    mineCounter++;
                }
                if (mineMap[x][y-1]=="*"){
                    mineCounter++;
                }
                if (mineMap[x-1][y-1]=="*"){
                    mineCounter++;
                }
            }

            mineFiled[x][y]=""+mineCounter;
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isMarkedAll(){
        for (int i = 0; i < rawNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                if (mineMap[i][j]=="-"){
                    return false;
                }
            }
        }
        return true;
    }


}
