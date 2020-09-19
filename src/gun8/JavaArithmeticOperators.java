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
       /* // c = (f-32)*5/9
        double f=85;
        double c=(f-32)*5/9;
        System.out.println("c = " + c);

        System.out.println("sıcaklığı Fahrenheit olarak yazınız:");
        double F=sc.nextDouble();
        double C=(F-32)*5/9;
        System.out.println("C = " + C);*/

        //task5
        // Write a Java program to compute body mass index (BMI).
// BMI: The BMI is defined as the body mass divided by the square of the body height,
//      and is universally expressed in units of kg/m2,
//      resulting from mass in kilograms and height in metres.
        //Scanner kullanarak yapin.
      /*  System.out.print("boyunuzu metre cinsinden yazınız:");
        double boy=sc.nextDouble();

        System.out.print("kilonuzu yazınız:");
        double kilo=sc.nextDouble();
        double bmi=(kilo)/(boy*boy);
        System.out.println("bmi = " + bmi);
*/
        //task6
        // Write a Java program to break an integer into a sequence of individual digits.
     // Hint: use / and %
     // ex: input: 12345
     //    output: 1
     //            2
    //            3
    //            4
   //            5

        int x=12345;
        int birler=x%10;
        int onlar=(x/10)%10;
        int yuzler=(x/100)%10;
        int binler=(x/1000)%10;
        int onbinler=(x/10000);
        System.out.println(onbinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
/*2.yol
int input1 =12345;
        String sayi=input1+"";
        String [] x=sayi.split("");
        for (String n:x) {
            System.out.println(Integer.parseInt(n));
        }*/
        /* 3.yol
        int number = 12345;

        String [] arrStr = String.valueOf(number).split("");
        for (String s: arrStr){
            System.out.println(s);
        }*/
        /* 4.yol
        System.out.print("Sayi Giriniz : ");
        int num = new Scanner(System.in).nextInt();
        while (num>0){
            int len = (""+num).length()-1;
            int mod = (int)Math.pow(10,len);
            System.out.println(num / mod);
            num %= mod;
        }*/

    }
}
