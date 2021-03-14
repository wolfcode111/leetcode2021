package string.word;

public class CountSegments {
    public static void main(String[] args) {

        String s = "";
        System.out.print(countSegments(s));
    }
    public static int countSegments(String s) {

        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        char[] word = s.toCharArray();
        int count=1;
        int len=s.length();
        int i=0;
        while(i<len-1){
            if(word[i]==' ' && word[i+1]!=' '){
                count++;
                i++;
            }else{
                i++;
            }
        }
      return count;
    }

}
