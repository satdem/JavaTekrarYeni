package gun12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Write a Java program that takes a year from user
        // and print whether that year is a leap year or not.

        Scanner sc=new Scanner(System.in);
        System.out.print("Yılı giriniz: ");

        int yil=sc.nextInt();
        if (yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    System.out.println(yil+" artik yıl");
                }else
                System.out.println(yil+" artik yıl değil");

            }else
            System.out.println(yil+" artik yıl");

        }else
            System.out.println(yil+" artik yıl değil");

    }
}
