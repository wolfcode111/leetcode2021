package string.reverse;

public class ReverseStr {

    public static void main(String[] args) {

        String s = "abcdefg";
        String tem = reverseStr(s,4);
        System.out.print(tem.toString());
    }

    public static String reverseStr(String s, int k) {
      char[] str = s.toCharArray();
      int n = s.length();
      for(int i=0;i<n;i+=2*k){
          int left = i ;
          int right = (i+k-1<n)?i+k-1:n-1;
          while(left<=right){   //这就是双指针
              char temp ;
              temp = str[left];
              str[left]= str[right];
              str[right]=temp;
              left++;
              right--;
          }
      }
      String word = new String(str);
      return word;
    }

}
