package gun13;

public class JavaDOWhileLoop {
    public static void main(String[] args) {
        int i=10;
        while (i<5){
            System.out.println("hellowhile!");
        }

        do {
            System.out.println("hello do-while");
        }while (i<5);//döngüye burada bağlanıyor öncwsindede çalışıyor
    }
}
