package gun12;

import java.util.Scanner;

public class Task1Alternatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Exam = ");
        String exam=scanner.nextLine();
        switch(exam) {
            case "A":
                System.out.println( "Excellent!!!" );
                break;
            case "B":
                System.out.println( "Well done" );
                break;
            case "C":
                System.out.println( "Good" );
                break;
            case "D":
                System.out.println( "Need improvement" );
                break;
            case "F":
                System.out.println( "Fail" );
                break;
            default:
                System.out.println( "Not valid input!!!" );
                break;
        }
    }
}
