package gun5;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("biletiniz çift yönlü olsun mu?(true/false)");
        boolean biletciftYonluMu=scanner.nextBoolean();
        System.out.println("biletciftYonluMu = " + biletciftYonluMu);

        System.out.println("biletinizin max ücreti ne kadar olabilir?");
        double biletUcreti=scanner.nextDouble();
        System.out.println("biletinizin ücreti = " + biletUcreti);

        System.out.println("biletinizin max ücreti ne kadar olabilir?");
        double biletUcretiF=scanner.nextFloat();
        System.out.println("biletinizin ücreti Float= " + biletUcreti);

        System.out.println("Kaç bilet istersiniz?");
        byte biletadedi=scanner.nextByte();
        System.out.println("bilet adedi= " + biletadedi);
/*
        System.out.println("bir karakter giriniz");
        char karakter=scanner.nextChar();
        System.out.println("biletinizin ücreti Float= " + biletUcreti);*/
        // todo scanner de char kullanılmıtor


    }
}
