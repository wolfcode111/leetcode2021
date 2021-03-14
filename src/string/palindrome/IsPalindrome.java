package string.palindrome;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }
    public static boolean isPalindrome(String s) {
        char[] temp = s.toLowerCase().toCharArray();
        int j= temp.length-1;
        int i=0;
        while(i<j){
            if((temp[i]>=97 && temp[i]<123) || (temp[i]>=48 &&temp[i]<=57)){
                if((temp[j]>=97 && temp[j]<123) || (temp[j]>=48 &&temp[j]<=57)){
                       if(temp[i]==temp[j]){
                           i++;
                           j--;
                       }else{
                           return false;
                       }
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
       return true;
    }
}
