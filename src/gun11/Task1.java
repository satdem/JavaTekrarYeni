package gun11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
    Write a Java program to calculate profit or loss
    Input:
        cost price: 1000  alış
        selling price: 1500 satış
    Output:
        Profit: 500


    Input:
        cost price: 5000
        selling price: 2000
    Output:
        Loss: 3000
     */
        Scanner sc=new Scanner(System.in);
        System.out.println("alış giriniz");
        int alıs=sc.nextInt();
        System.out.println("satıs giriniz");
        int satıs=sc.nextInt();

        int fark=satıs-alıs;

        if (fark>0){
            System.out.println("kazancınız =  $" + fark);
        }
        else{
            System.out.println("zararınız =  $" + Math.abs(fark));
        }




    }
}
