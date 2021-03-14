package string.prefix;

public class LongestCommonPrefix {

    public static void main(String[] args) {
       String[] str= {"aa","aa"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        String temp = "";
        int minlen=Integer.MAX_VALUE;
        if(strs.length==0)return "";
        if(strs.length==1)return strs[0];
        char[][] str = new char[strs.length][strs[strs.length-1].length()];
        int len = strs.length;
        for(int i=0;i<len;i++){
            str[i]=strs[i].toCharArray();
            if(strs[i].length()<minlen){
                minlen=strs[i].length();
            }
        }
        if(minlen==0) return "";
        int count=0;

            for (int i = 0; i < len - 1; i++) {
                if (count<minlen && str[i][count] == str[i + 1][count]) {
                    if (i == len - 2) {
                        temp += str[i][count];
                        count++;
                        i = -1;
                    }
                } else {
                    return temp;
                }
            }

       return temp;
    }
}
