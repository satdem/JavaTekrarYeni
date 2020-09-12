package gun7;

public class task {
    public static void main(String[] args) {
        //1.soru
        String name="Satı";
        String surname="Demirci";
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        //2.soru
        // part 1
        // using text "software DEV inc"
        // fix it to "SOFTWARE DEV inc"
        // hint: use substring

        String s="software DEV inc";
        int i=s.indexOf(" ");
        System.out.println(s.substring(0,i).toUpperCase()+s.substring(i));
        /*ikinci yol
        String text1="software DEV inc";

        String [] a=text1.split(" ");
        String son="";
      a[0]= a[0].toUpperCase();
        for (String n :a
             ) {
            son+=n+" ";
        }
        System.out.println(son);
    }*/

        //3.soru
        //  Write a Java program to replace all the 'd' characters with 'f' characters
        //      input: The quick brown fox jumps over the lazy dog.
        //      output: The quick brown fox jumps over the lazy fog.
        String ilk="The quick brown fox jumps over the lazy dog.";
        System.out.println(ilk.replace("d","f"));

        //3.soru
        // part 2:
        // replace all the 'a','t','e' characters with 'f'
        System.out.println(ilk.replaceAll("[ate]","f"));
        System.out.println(ilk.replaceAll("a","f").replaceAll("t","f").replaceAll("e","f"));
        //regex siz

        //3.soru
        //part3
        System.out.println(ilk.replaceAll("[oqr]","L"));
        //part4
        System.out.println(ilk.replaceAll("[^oqr]","T"));





    }
}
