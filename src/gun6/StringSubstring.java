package gun6;

public class StringSubstring {
    public static void main(String[] args) {
        //stringi belli indexler arasını ayırır
        String s="hello world";
        System.out.println("s.substring(6) = " + s.substring(6));
        System.out.println("s.substring(2,5) = " + s.substring(2,5));//2 dahil, 5 değil
    }
}
