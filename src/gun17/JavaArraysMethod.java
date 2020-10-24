package gun17;

import java.util.Arrays;

public class JavaArraysMethod {
    public static void main(String[] args) {

        //toString
        String[] names={"a","b","c","d"};
        System.out.println(Arrays.toString(names));

        //sort
        int[] numbers={4,7,0,1,4,5,3};
        System.out.println("sıralamadan önce : "+Arrays.toString(numbers));
          Arrays.sort(numbers);
        System.out.println("sıralamadan sonra : "+Arrays.toString(numbers));

        int[] numbers1={4,7,0,1,4,3,2,6,5};

        Arrays.sort(numbers1,2,5);//2 den 5 e kadar sıraladı
        System.out.println("sıralamadan sonra : "+Arrays.toString(numbers1));

        //equals
        int[] a={1,2,3};
        int[] b={1,2,3};
        int[] c={1,3,2};
        System.out.println("a b ye aşit mi = " + Arrays.equals(a,b));
        System.out.println("a c ye aşit mi = " + Arrays.equals(a,c));
        System.out.println("c b ye aşit mi = " + Arrays.equals(c,b));

        //fill
        int[] x=new int[10];
        Arrays.fill(x,2);//bütün değerleri 2 yaptı
        System.out.println("Arrays.toString(x) = " + Arrays.toString(x));

        //binearySearch
        int[] numbers2={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.binarySearch(numbers2,3));//sıralı dizideki verilen değerin indexini veriyor
        System.out.println(Arrays.binarySearch(numbers1,3));//sıralı olmayanda  -1 döndürüyor




    }
}
