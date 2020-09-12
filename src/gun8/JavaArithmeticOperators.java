package gun8;

import java.util.Scanner;

public class JavaArithmeticOperators {
    public static void main(String[] args) {
        // Write a Java program that multiplies four integers and  print result

        //part 2: use scanner to provide number

        System.out.println(4*5*6*2);
        Scanner sc=new Scanner(System.in);
      /*  System.out.print("Bir sayı giriniz: ");
        int s1=sc.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s2=sc.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s3=sc.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int s4=sc.nextInt();
        System.out.println("sayıların çarpımı= "+(s1*s2*s3*s4));*/

        //2.soru
        // Write a Java program that print the average of three integers:
        // a, b, c (a = 5, b= 3, c= 2)
        // output:
        // (a+b+c)/3 = 3.33333333333

        // part 2: provide numbers using scanner
       /* int a=5;
        int b=3;
        int c=2;
        double ort=(a+b+c)/3.0;//double olması için 3.0 yazıyoruz yoksa int hesaplıyor
        System.out.println("ortalama= "+ort);
        System.out.print("Bir sayı giriniz: ");
        int i1=sc.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int i2=sc.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int i3=sc.nextInt();

        System.out.println("ortalama= "+((i1+i2+i3)/3.0));*/

        //task4
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
       // formula
        // (32°F − 32) × 5/9 = 0°C
        // c = (f-32)*5/9
        double f=85;
        double c=(f-32)*5/9;
        System.out.println("c = " + c);

        System.out.println("sıcaklığı Fahrenheit olarak yazınız:");
        double F=sc.nextDouble();
        double C=(F-32)*5/9;
        System.out.println("C = " + C);


    }
}
