package gun11;

public class Task3 {
    public static void main(String[] args) {
        // Write a Java program to check whether a character is alphabet or not.
        // use just lowercase letters, a to z
        // hint: char is also numeric

        // ex1:  h => it is alphabet character
        // ex2: % => it is not in alphabet

        char c='%';
     if(c>='a'&&c>='z'){
         System.out.println(    "karakter alfabeden");
     }
        else System.out.println("karakter alfabeden değil");
    }
}
