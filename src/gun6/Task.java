package gun6;

public class Task {
    public static void main(String[] args) {
        //Task1:create variable with data type string
        //write your name and print its length
        String s="Sati Demirci";
        System.out.println("s.length() = " + s.length());


        //Task2:create a string with value "admin@techno.study"
        //search for the "study" and return its index;
        String a="admin@techno.study";
        System.out.println("a.indexOf(\"study\") = " + a.indexOf("study"));

        //Task3:create two variables as first name , and last name
        // print initials of your name
        // input:
        // a = Michael
        // b = Jackson

        // output:
        // M.J.
        String name="Sati";
        String surname="Demirci";
        System.out.println(name.charAt(0)+"."+surname.charAt(0)+".");

        //Task4:Given two strings, a and b,
        // output the result of putting them together in the order abba,
        // e.g. "Hi" and "Bye" returns "HiByeByeHi".
        String x="hi";
        String y="by";
        ekleme(x,y);
    }
    static void ekleme(String a,String b){
        System.out.println(a.concat(b).concat(b).concat(a));
    }
}
