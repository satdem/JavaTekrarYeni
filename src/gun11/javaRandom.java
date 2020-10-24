package gun11;

import java.util.Random;

public class javaRandom {
    public static void main(String[] args) {
        double r1=Math.random();
        System.out.println("r1 = " + r1);
        
        int r2=(int)(Math.random()*10);
        System.out.println("r2 = " + r2);
        
        Random random=new Random();
        int randomInt=random.nextInt(3);
        System.out.println("randomInt = " + randomInt);
        

    }
}
