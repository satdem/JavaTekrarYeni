package gun6;

public class StringIndexOf {
    public static void main(String[] args) {
        //herhangi bir carakterin string içerisindeki ilk yerin indexini verir
        String t1="Hello";
        System.out.println("t1.indexOf('o') = " + t1.indexOf('o'));
        System.out.println("t1.indexOf('o') = " + t1.indexOf('m'));//bulamazsa -1 döndürüyor
        System.out.println("t1.indexOf('l',3) = " + t1.indexOf('l',3));
        System.out.println("t1.indexOf('l',3) = " + t1.indexOf('l',4));//bulamazsa -1 döndürüyor

        String t2="Good morning";
        System.out.println("t2.indexOf(\"mor\") = " + t2.indexOf("mor"));
        System.out.println("t2.indexOf(\"Mor\") = " + t2.indexOf("Mor"));//bulamadı
        System.out.println("t2.indexOf(\"moy\") = " + t2.indexOf("moy"));//bulamadı
    }
}
