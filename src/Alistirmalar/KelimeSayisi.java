package Alistirmalar;

public class KelimeSayisi {
    public static void main(String[] args) {

      String text="   Sen   Benim   herşeyimsin   ";
      KelimeSayisi ks=new KelimeSayisi();
        System.out.println(ks.kelimesayisi(text));


    }

    int kelimesayisi(String str){
        String[] a=str.trim().replaceAll("[ ]+"," ").split(" ");
        int x=a.length;
        System.out.println("x = " + x);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return x;
    }
}
