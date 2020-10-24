package gun14;

import java.util.ArrayList;
import java.util.List;

public class JavaForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("i = " + i);
        }

        ArrayList<String> günler=new ArrayList<String>(List.of("pazartesi","salı","çarşamba","perşembe","cuma","cumartesi","pazar"));

        for (String s : günler) {
            System.out.println("s = " + s);
        }

       // günler.for yazınca kullanabileceğimiz secenekler çıkıyor
        //enhanced forloop foreach demek
    }
}
