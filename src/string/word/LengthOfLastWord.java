package string.word;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        s=s.trim();
        if(s.length()==0) return 0;
        char[] word = s.toCharArray();
        int i=word.length-1;
        int len=0;
        while(i>=0){
            if(word[i]!=' '){
                len++;
                i--;
            }else{
                return len;
            }
        }
       return len;
    }
}
