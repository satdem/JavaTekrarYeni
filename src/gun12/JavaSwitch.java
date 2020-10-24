package gun12;

import java.util.Random;

public class JavaSwitch {
    public static void main(String[] args) {
        Random random=new Random();
        int day=1+ random.nextInt(7);
        System.out.println(" gununuz "+day);

        switch (day){
            case 1:
                System.out.println("Pazartesi");break;
         case 2:
                System.out.println("salı");break;
         case 3:
                System.out.println("Carşamba");break;
         case 4:
                System.out.println("perşembe");break;
         case 5:
                System.out.println("cuma");break;
         case 6:
                System.out.println("cumartesi");break;
         case 7:
                System.out.println("Pazar");break;

                default:
                System.out.println("birşeyler yanlış gitti");
                break;
        }
    }
}
