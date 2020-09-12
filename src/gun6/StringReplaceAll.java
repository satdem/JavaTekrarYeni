package gun6;

public class StringReplaceAll {
    public static void main(String[] args) {
        String s="software 1236 DEVELOPER";
        System.out.println("s.replaceAll(\"[A-Z]\",\"d\") = " + s.replaceAll("[A-Z]","d"));

        System.out.println("s.replaceAll(\"[0-9]\",\"*\")) = " + s.replaceAll("[0-9]","*"));

        System.out.println("s.replaceAll(\"[^a-z]\",\"m\") = " + s.replaceAll("[^a-z]","m"));

        /* // . (nokta) yalniz tek karakter demektir
        // ".s" toplam 2 karakter olmali, ilk karakter herhangi ikinci karakter s olmali
        System.out.println(". quantifier ....");
        System.out.println("as".matches(".s"));  // true, ilk karakter a ikincisi 2 toplam 2 karakter
        System.out.println("mst".matches(".s")); // false (mst 2 karakterden fazla)
        System.out.println("mas".matches("..s")); // true, 3 karakterli ve 3. karakter s

        // [abc]    yalniz bir karakter ve a, b veya  c olmali
        System.out.println("[abc] quantifier ....");
        System.out.println("a".matches("[a]")); // true, str yalniz bir adet a karakterinden olusmali
        System.out.println("ab".matches("[ab]")); // false, 1 karakter olmali a ya da b, 2 karakter var

        // [^abc]    a, b, c disinda herhangi bir karakter (negation)
        System.out.println("[^...] quantifier ....");
        System.out.println("a".matches("[^a]")); // false, bir karakter ancak a haric olmali
        System.out.println("c".matches("[^ab]")); // true, 1 karakter ve a ve b nin disinda
        System.out.println("abcd".matches("[abcd]")); // false, yalniz a, b, c veya d olmali
        System.out.println("c".matches("[abcd]")); // true, tek karakter ve a, b, c veya d
        System.out.println("baaaca".matches("[abc]")); // false,

        //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
        //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali
        System.out.println("[a-z] quantifier ....");
        System.out.println("c".matches("[a-z]")); // true, 1 karakter ve a-z arasinda
        System.out.println("Aa".matches("[a-zA-Z]")); // false, a dan 1 karakter ve a ve b nin disinda
        System.out.println("c".matches("[1-9]")); // false, 1 karakter ve 1-9 arasinda olmalı
        */
    }
}
