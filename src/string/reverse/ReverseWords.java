package string.reverse;

public class ReverseWords {

    public static void main(String[] args) {

        System.out.print(reverseWords("Let's take LeetCode contest"));
        String s = reverseWords("Let's take LeetCode contest");
        System.out.print("");
    }

    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        String rString="";
        for(int i=0;i<str.length;i++){
            rString+=reverse(str[i]);
            if(i!= str.length-1) rString+=" ";
        }
        return rString;
    }

    public static String reverse(String s){
        char[] temp = s.toCharArray();
        int len=s.length()-1;
        for(int i=0;i<(len+1)/2;i++){
            char a;
            a=temp[i];
            temp[i]=temp[len-i];
            temp[len-i]=a;
        }
        return new String(temp);
    }
}
