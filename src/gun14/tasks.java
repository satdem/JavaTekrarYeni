package gun14;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("bir kelime yazınız");
        String kelime=sc.nextLine();
        System.out.println("kelimenin harf sayısı:  " + kelime.length());
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(kelime.charAt(i));

        }
        /*  System.out.println("Bir cümle yazınız.");
        String cumle=sc.nextLine();
        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a'){
                sayac++;
            }

        }
        System.out.println("cümledeki a harfinin sayısı : "+sayac);
*/
    }
}
