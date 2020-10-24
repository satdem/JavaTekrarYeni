package gun13;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        char letter='a';
        while (letter<='z'){
            System.out.print(letter+",");
            letter++;
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=sc.nextInt();
        int toplam=0;
        int i=0;
        do {
            System.out.println("i = " + i);
            toplam+=i;
            i++;
        }while (i!=sayi+1);
        System.out.println(sayi+" a kadar sayıların toplamı = " + toplam);


    }
}
