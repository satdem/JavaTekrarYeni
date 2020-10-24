package gun12;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random=new Random();
        int nm= random.nextInt(6);

        System.out.println("numaram = " + nm);


        switch (nm){
            case 0: System.out.println("sıfır");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;

        }

    }
}
