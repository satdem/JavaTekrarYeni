package gun16;

import java.util.Arrays;
import java.util.Random;

public class JavaArrayEx3 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[10] ;
        for (int i = 0; i < 10; i++) {
            int sayi= random.nextInt(55);
            System.out.print(sayi+",");
            arr[i]=sayi;
        }
        System.out.println("\n-------");
        System.out.println(Arrays.toString(arr));
    }
}
