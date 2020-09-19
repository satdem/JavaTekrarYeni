package gun10;

public class ElseStatement {
    public static void main(String[] args) {
       String name="Sati";
       String surname="Demirci";

       int total=name.length()+surname.length();

       if (total>15){
           System.out.println("isminiz çok uzun");
       }
       else if (total>10){
           System.out.println("isminiz normal uzunlukta");
       }else {
           System.out.println("isminiz çok kısa");
       }
    }
}
