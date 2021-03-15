package string.reverse;

import java.util.*;

public class ReverseWordsTwo {

    public static void main(String[] args) {
        String s = "a good   example";
       String tm = reverseWords(s);
        System.out.print(tm);
    }

    public static String reverseWords(String s) {
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+")); //这里可以用\s+匹配空格等多种字符
        Collections.reverse(wordList); //Collections中有反转方法
        return String.join(" ", wordList);


    }

}
