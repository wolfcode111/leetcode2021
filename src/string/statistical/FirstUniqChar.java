package string.statistical;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    public static void main(String[] args) {

        String str = "loveleetcode";
        System.out.print(firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
         char[] str = s.toCharArray();
         int hash[] = new int[26];
         for(int i=0;i<str.length;i++){
             hash[str[i]-'a']++;
         }
         for(int i=0;i<str.length;i++){
             if(hash[str[i]-'a']==1){
                 return i;
                 //这里一定要是str[i]-a,这样我们就能保证其相对的索引是不变的
             }
         }
         return -1;
    }
}
