package numberAndBit.operation;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.print(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if(x<0)return false;
        int temp = x;
        int number = 0;
        while(x>0){
            number*=10;
            number += x%10;
            x=x/10;

        }
        if(temp==number)return true;
        else return false;
    }
}
