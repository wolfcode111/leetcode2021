package hashTable.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:徐华东
 * @Date:2021/04/22:36
 * @Description: 500键盘行
 */
public class FindWords {

    static String s1 = "qwertyuiop";
    static String s2 = "asdfghjkl";
    static String s3 = "zxcvbnm";

    public static void main(String[] args) {
     String[] s = {"Hello","Alaska","Dad","Peace"};
     String[] str = findWords(s);
     for(String c : str){
         System.out.println(c);
     }
    }

    public static String[] findWords(String[] words) {
         List<String> list = new ArrayList<>();
          for(String str : words){
              if(judge(str)){
                  list.add(str);
              }
          }
          return list.toArray(new String[list.size()]);

    }

    public static boolean judge(String s){

        char[] str = s.toLowerCase().toCharArray();
            if(s1.indexOf(str[0])>=0){
                for(int i = 1; i< str.length;i++){
                    if(s1.indexOf(str[i])<0){
                        return false;
                    }
                }
            }else if(s2.indexOf(str[0])>=0){
                 for(int i=1;i<str.length;i++){
                     if(s2.indexOf(str[i])<0){
                         return false;
                     }
                 }
        }else{
                for(int i = 1;i<str.length;i++){
                    if(s3.indexOf(str[i])<0){
                        return  false;
                    }
                }
            }
            return true;
    }
}
