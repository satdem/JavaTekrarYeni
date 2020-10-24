package gun15;

public class ornek1 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                Thread.sleep(1000);//denemek için yaptım güzel oldu
            }
            System.out.println();
        }
    }
}
