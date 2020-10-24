package gun14;

public class JavaBreak {
    public static void main(String[] args) {
        System.out.println("kod başladı");
        for (int i = 0; i <50 ; i++) {
            System.out.println("i = " + i);
            if (i==5){
                break;
            }
        }
        System.out.println("kod bitti" );
        
        String text="evde kal.";
        for (int i = 0; i <text.length() ; i++) {
            char c=text.charAt(i);
            if (c==' '){
                break;
            }
            System.out.println("c = " + c);
            
        }
    }
}
