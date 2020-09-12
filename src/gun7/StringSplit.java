package gun7;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        //split:ayırmak demek
        String text="SOFTWARE DEVELOPER in TEST";

        System.out.println(Arrays.toString(text.split(" ")));
        System.out.println(Arrays.toString(text.split("")));
        System.out.println(Arrays.toString(text.split("E")));
        /*
          [SOFTWARE, DEVELOPER, in, TEST]
          [S, O, F, T, W, A, R, E,  , D, E, V, E, L, O, P, E, R,  , i, n,  , T, E, S, T]
          [SOFTWAR,  D, V, LOP, R in T, ST]
          */
    }
}
