package gun6;

public class StringReplace {
    public static void main(String[] args) {
        //istediğimiz şeyi istediğimiz ile değiştiriyoruz
        
        String text="Hello world Hello!!!";
        System.out.println("text.replace(\"Hello\",\"Hi\") = " + text.replaceAll("Hello","Hi"));
        
    }
}
