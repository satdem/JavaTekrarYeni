package gun6;

public class Stringendswith {
    public static void main(String[] args) {
        String text="Hello world";
        System.out.println("text.endsWith(\"hello\") = " + text.endsWith("Hello"));
        System.out.println("text.endsWith(\"world\") = " + text.endsWith("world"));
        System.out.println("text.endsWith(\"d\") = " + text.endsWith("d"));
    }
}
