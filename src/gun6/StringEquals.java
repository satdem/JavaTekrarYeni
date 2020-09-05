package gun6;

public class StringEquals {
    public static void main(String[] args) {
        //equals iki stringi karşılaştırır.Büyük harf küçük harfe duyarlı
        //eşitse :true değilse:false döndürür
        String text1="Hello";
        String text2="Bonjur";

        System.out.println("text1.equals(text2) = " + text1.equals(text2));
        System.out.println("text1.equals(\"hello\") = " + text1.equals("hello"));
        System.out.println("text1.equals(\"Hello\") = " + text1.equals("Hello"));
    }
}
