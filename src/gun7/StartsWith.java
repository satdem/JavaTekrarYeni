package gun7;

public class StartsWith {
    public static void main(String[] args) {

        //Startwith:bununla başlıyor mu

        String text="Hello world";
        System.out.println("text  Hello ile başlıyor mu?= " + text.startsWith("Hello"));
        System.out.println("text  Hel ile başlıyor mu?= " + text.startsWith("Hel"));
        System.out.println("text  world ile başlıyor mu?= " + text.startsWith("world"));
        System.out.println("text  hello ile başlıyor mu?= " + text.startsWith("hello"));
    }
}

