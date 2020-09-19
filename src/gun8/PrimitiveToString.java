package gun8;

public class PrimitiveToString {
    public static void main(String[] args) {
        double v=10.99;
          String s=String.valueOf(v);
          String s1 = Double.toString(v);//stringe çeviriyor

        System.out.println("s.equals(s1) = " + s.equals(s1));

        float f=10.99f;
        String ss=String.valueOf(f);
        String ss1 = Float.toString(f);//stringe çeviriyor

        int i=10;
        String sss=String.valueOf(i);
        String sss1 = Integer.toString(i);//stringe çeviriyor

        boolean b=true;
        String x=String.valueOf(b);
        String x1 = Boolean.toString(b);//stringe çeviriyor
    }
}
