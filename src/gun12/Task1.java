package gun12;

import java.util.Random;

public class Task1 {
    /*
    Write a Java program to evaluate exam result of student
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
     */

    // part 2 , try to use switch statement instead of if-else-if
    public static void main(String[] args) {
        String result="ABCDEF#";
        Random random=new Random();
        char c=result.charAt(random.nextInt(6));

        String ornekResult=c+"";
        System.out.println("ornekResult = " + ornekResult);

        if (ornekResult.equals("A"))
        System.out.println("Excellent");

        else if (ornekResult.equals("B"))
            System.out.println("well done");

       else if (ornekResult.equals("C"))
            System.out.println("Good");

        else if (ornekResult.equals("D"))
            System.out.println("Need improvement");

        else if (ornekResult.equals("F"))
            System.out.println("Fail");


    }
}
