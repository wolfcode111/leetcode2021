package array;

import java.util.Arrays;

public class ThirdMax {

    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        long a1 = (long) Integer.MIN_VALUE-1;   //赋初值的时候 如果是最小值就-1 ，最大值就加1
        long a2 = (long) Integer.MIN_VALUE-1;
        long a3 = (long) Integer.MIN_VALUE-1;
        for (int num:nums) {
            if(num>a3 && num!=a2 && num!=a1){
                if(num>a2){
                    if(num>a1){
                        a3=a2;
                        a2=a1;
                        a1=num;
                    }else{
                        a3=a2;
                        a2=num;
                    }
                }else{
                    a3=num;
                }
            }
        }
        return (int) (a3!=(long)Integer.MIN_VALUE-1?a3:a1);
    }
}