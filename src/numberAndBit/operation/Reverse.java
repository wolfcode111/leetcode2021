package numberAndBit.operation;

public class Reverse {

    public static void main(String[] args) {

        System.out.print(reverse(-2147483412));
    }

    public static int reverse(int x) {
        int number = 0 ;
        int count = 1;
        int flag=1;
        if(x<0){
           x=-x;
            while(x>0){
                if(number>214748364){
                    return 0;
                }
                number*=10;
                number += x %10;
                x/=10;
            }
            return -number;
        }else{
            while(x>0){
                if(number>214748364){
                    return 0;
                }
                number*=10;
                number += x %10;
                x/=10;

            }
            return number;
        }

    }
}
