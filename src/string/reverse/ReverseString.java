package string.reverse;

public class ReverseString {

    public static void main(String[] args) {

        char[] word = {};
        reverseString(word);
        System.out.println(word.toString());

    }

    public static void reverseString(char[] s) {

            if(s.length==0)return;
      char temp = '0';
      int len=s.length-1;
      for(int i=0;i<=len/2;i++){
          temp=s[i];
          s[i]=s[len-i];
          s[len-i]=temp;
      }
    }
}
