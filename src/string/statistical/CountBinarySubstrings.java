package string.statistical;

/**
 * @Author:徐华东
 * @Date:2021/04/13:28
 * @Description:  696. 计数二进制子串    00110011
 */
public class CountBinarySubstrings {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));

    }

    public static int countBinarySubstrings(String s) {
      char[] str = s.toCharArray();
      int pre = 0 , cur = 1, res = 0;
      for(int i=1;i<str.length;i++){
          if(str[i]==str[i-1]){
              cur++;
          }else{
              pre = cur;
              cur = 1;
          }
          if(pre>=cur) res++;
      }
      return res;
    }
}
