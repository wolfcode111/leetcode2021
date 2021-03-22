package string.statistical;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {

        String s ="rat";
        String t ="car";
        System.out.print(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] Ss = s.toCharArray();
        char[] St = t.toCharArray();
        Arrays.sort(Ss);
        Arrays.sort(St);
       return Arrays.equals(Ss,St);

    }
}
