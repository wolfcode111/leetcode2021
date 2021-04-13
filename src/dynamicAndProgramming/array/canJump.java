package dynamicAndProgramming.array;

/**
 * @Author:徐华东
 * @Date:2021/04/9:45
 * @Description:   55. 跳跃游戏
 */
public class canJump {

    public static void main(String[] args) {

        int[] nums ={2,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        //这个表示的是能达到的最大距离
        //这里的maxLen一直就是能到达的最大距离，而不是在给定范围内的数组最大值
        int maxLen = 0;
        int len = nums.length;
        //如果跳不到位置i,直接返回false;
        for(int i=0;i<nums.length;i++){
            if(i>maxLen) return false;
            //如果能跳到位置i,就更新所能跳的最大距离
            maxLen = Math.max(maxLen,i+nums[i]);
            //如果能跳到最后的位置，说明能够成功，直接终止循环
            if(maxLen>len) return true;
        }
        return true;
        }
}
