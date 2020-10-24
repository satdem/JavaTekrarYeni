package gun16;

public class JavaArrayEx1 {
    public static void main(String[] args) {
        char[] letters={'H','e','l','l','o'};
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);

        }
        System.out.println("\n---------");

        for (int i = letters.length-1; i >=0 ; i--) {
            System.out.print(letters[i]);
        }
        System.out.println("\n---------");

        String[] animals={"cat","dog","bird"};
        for (String animal:animals) {

            System.out.println("animal = " + animal);
        }
        System.out.println("\n---------");

        int[] numbers=new int[5];
        for (int i:numbers) {
            System.out.println("i = " + i);
        }
    }
}
