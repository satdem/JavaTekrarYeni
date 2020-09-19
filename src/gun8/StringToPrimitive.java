package gun8;

public class StringToPrimitive {
    public static void main(String[] args) {
        String s="123";
        int i=Integer.parseInt(s);
        int i1=Integer.valueOf(s);
        System.out.println(i+i1);
        double d=Double.parseDouble(s);
        double d1=Double.valueOf(s);
        float f=Float.parseFloat(s);
        float f1=Float.valueOf(s);

    }
}
