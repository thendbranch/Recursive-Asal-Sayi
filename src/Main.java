// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev - Asal Sayı Bulan Program
            Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
            "Asal" sayı olup olmadığını bulan programı yazın.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol Sayısı Giriniz : ");
        int sayi = input.nextInt();
        int as ;

        as=usAlma(sayi,2);
        if (as == 0){
            System.out.println(sayi + " sayiniz asal değildir.");
        } else if (as == 1) {
            System.out.println(sayi + " sayınız asaldır.");
        }


    }

    static int usAlma(int a,int b){
        b=2;
        if (a%b == 0){
            if (a != 2){
                return 0;
            }else if (a == 2){
                return 1;
            }
        }else if (a>b && a%b == 1){

            return 1;
        }
        return usAlma(a,b++);
    }
}