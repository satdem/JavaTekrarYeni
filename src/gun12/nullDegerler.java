package gun12;

public class nullDegerler {
   static String s;
    static int i;
    static Integer I;//null
    static boolean b;
    static Boolean B;
    static double d;
    static long l;

    public static void main(String[] args) {
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("b = " + b);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("I = " + I);//tanımlanmamış PRİMİTİVE TİP ların default hali null oluyor
        System.out.println("B = " + B);//tanımlanmamış PRİMİTİVE TİP  ların default hali null oluyor
    }
}
