package gun13;

public class ornek {
    public static void main(String[] args) {

        int i=0;
        String a="";
        while (i<5){
            int random=(int)(Math.random()*32+65);
            char c=(char)random;
            a=(String)(a+c);
            i++;
        }
        System.out.println("a = " + a);
    }
}
