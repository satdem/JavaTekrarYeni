package gun15;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        int[] arr=new int[6];

        arr[0]=10;
        arr[1]=10;
        arr[2]=15;
        arr[5]=10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arrayin "+i+". elemanı = " + arr[i]);
        }

        String[] names=new String[3];
        String[] names2={"ali","veli","selami"};
        int[] ages={20,25,42};

        System.out.println("names2 listesi = " + Arrays.toString(names2));
        System.out.println("ages listesi = " + Arrays.toString(ages));


    }
}
