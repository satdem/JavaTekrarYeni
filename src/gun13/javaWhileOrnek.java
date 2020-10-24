package gun13;

import java.util.Scanner;

public class javaWhileOrnek {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("4 haneli pin giriniz");
        int pin=sc.nextInt();

        int pincode=5555;
        while (pin!=pincode){
            System.out.println("yeni pin iriniz");
            pin=sc.nextInt();
        }
        System.out.println("pin başarılı");




    }
}
