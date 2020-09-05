package gun6;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int a= girdi.nextInt();
        System.out.println("Bir sayı giriniz");
        int b= girdi.nextInt();

        int Toplam=a+b;
        System.out.println("Toplam = " + Toplam);
        System.out.println("Toplam = " + a+b);//concatanation (sitring gibi algılıyor ve ekleme yapıyor)
        System.out.println("Toplam = " + (a+b));
    }
}
