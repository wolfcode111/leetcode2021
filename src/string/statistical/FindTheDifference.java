package string.statistical;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "eabcd";
        System.out.print(findTheDifference(s,t));

    }

    public static char findTheDifference(String s, String t) {
        char[] sStr = s.toCharArray();
        char[] tStr = t.toCharArray();
        int[] hash = new int[26];
        for(int i=0;i< tStr.length;i++){
            hash[tStr[i]-'a']++;
        }
        for(int i=0;i<sStr.length;i++){
            hash[sStr[i]-'a']--;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]>0) return (char)(97+i); //可以通过这样的方式将一个整数形式的数字强行转为字符形式
        }

           return '0';
    }
}
