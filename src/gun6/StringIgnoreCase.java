package gun6;

public class StringIgnoreCase {
    public static void main(String[] args) {
        //equalsIgnorecase küçük harf yada büyük harf dikkat etmeden karşılaştırma yapıyor

        String text1="Hello";
        String text2="Bonjur";

        System.out.println("text1.equalsIgnoreCase(text2) = " + text1.equalsIgnoreCase(text2));
        System.out.println("text1.equalsIgnoreCase(\"hello\") = " + text1.equalsIgnoreCase("hello"));
        System.out.println("text1.equalsIgnoreCase(\"Hello\") = " + text1.equalsIgnoreCase("Hello"));
    }
}
