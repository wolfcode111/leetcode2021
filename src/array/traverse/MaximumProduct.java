package array.traverse;

import java.util.Arrays;

public class MaximumProduct {

    public static void main(String[] args) {
        int[] num = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(num));
    }


    public static int maximumProduct(int[] nums) {
             int sum = 1;
             Arrays.sort(nums);
             //不管是正数还是负数，都只会有三种情况而已
             //一种是全是正数，那么最后三个数最大
             //一种全是负数，那么也是最后三个最大，是最大的负数
             //一种是有正有负，那么要不就是最小的负的有二个相乘再乘上一个正的
        //              要么就是最后三个数最大
             return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);
    }
}
