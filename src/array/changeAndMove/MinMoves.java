package array.changeAndMove;

import java.util.Arrays;

public class MinMoves {

    public static void main(String[] args) {

        int[] num = {1,1000000};
        System.out.println(minMoves(num));
    }
    public static int minMoves(int[] nums) {
        int min=Integer.MIN_VALUE;
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            count+=nums[i]-nums[0];
        }
        return count;
    }
}
