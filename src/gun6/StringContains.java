package gun6;

public class StringContains {
    public static void main(String[] args) {
        //içinde bir "karakterdizisi" var mı yok mu onu verir.sonuç boolean

        String text="Good morning!!!";
        System.out.println("text.contains(\"mor\") = " + text.contains("mor"));//true
        System.out.println("text.contains(\"Mor\") = " + text.contains("Mor"));//false
        System.out.println("text.contains(\"morin\") = " + text.contains("morin"));//false
    }
}
