package gun14;

public class javaContiniu {
    public static void main(String[] args) {
        System.out.println("kod başladı");
        for (int i = 0; i < 6; i++) {
            if (i<=2){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("kod bitti");
    }
}
