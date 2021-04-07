package dynamicAndProgramming.array;

import java.util.Arrays;

/**
 * @Author:徐华东
 * @Date:2021/04/21:23
 * @Description:  45. 跳跃游戏 II
 */
public class Jump {

    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4,2,1};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
       int step = 0 ;
       int start = 0;
       int end = 0;
       int maxLen = 0;
       while(end<nums.length-1){
           for(int i =start;i<=end;i++){
               //找到每个元素按照此位置跳的位置，跳出最大的出来
               maxLen = Math.max(maxLen,nums[i]+i);
           }
           start=end+1;
           end = maxLen;
           step++;
       }
       return step;

    }

}
