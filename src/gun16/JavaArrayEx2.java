package gun16;

import java.util.Arrays;

public class JavaArrayEx2 {
    public static void main(String[] args) {
        int[] arr=new int[5];

        System.out.println("arr= "+ Arrays.toString(arr));

        for (int number:arr) {
            number=4;//burada arr değişmiyor,eleman atayamıyorum
            System.out.println(number);
        }
        System.out.println("arr= "+ Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            arr[i]=3;//burada arr eleman atayabiliyorum

        }
        System.out.println("arr= "+ Arrays.toString(arr));

    }
}
