package gun6;

public class StringIsEmpty {
    //string boş mu değil mi kontrol eder
    public static void main(String[] args) {
        String t1="Hi";
        System.out.println("t1.isEmpty() = " + t1.isEmpty());

        String t2="";
        System.out.println("t2.isEmpty() = " + t2.isEmpty());

        String t3=" ";
        System.out.println("t3.isEmpty() = " + t3.isEmpty());
    }
}
