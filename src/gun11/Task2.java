package gun11;

public class Task2 {
    public static void main(String[] args) {
        /*
    //Part1:
    Given date, check if user provided correct date format
        MM/YYYY
        1-12
    ex: 03/2020 => correct
        25/2020 => wrong
     */

        String str="22/2020";
        String monath=str.substring(0,2);

        int monatI=Integer.valueOf(monath);
        if (monatI>=0 && monatI<=12){
            System.out.println("doğru");
        }
        else
            System.out.println("yanlış");
    }
}
