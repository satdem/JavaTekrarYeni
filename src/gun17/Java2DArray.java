package gun17;

public class Java2DArray {
    public static void main(String[] args) {
        String[][] arr2D=new String[4][];//birinciye değer girmeliyiz ,ikinci girmesekte olur
        String[][] books={
                {"marvel","DC"},
                {"a","b","c"},
                {"x","y","z"},
                {"f"}
        };

        int sayac=0;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                System.out.println(books[i][j]);
                sayac++;
            }
            
        }
        System.out.println("sayac = " + sayac);
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                System.out.print(books[i][j]);

            }
            System.out.println();
        }
    }
}
