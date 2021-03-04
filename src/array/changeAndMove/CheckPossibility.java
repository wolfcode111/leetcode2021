package array.changeAndMove;

public class CheckPossibility {

    public static void main(String[] args) {
        int[] nums = {1,4,1,2};
        System.out.print(checkPossibility(nums));

    }

    public static boolean checkPossibility(int[] nums) {
            boolean flag = true;  //本题最主要的思想，就是要保持数组前面的数尽可能的小,要使用贪心算法
            int i=0;
             for(;i<nums.length-1;i++){
               if(nums[i]<=nums[i+1]){
                   continue;
               }else if(flag){
                       flag=false;
                       if(i>0){
                           if(nums[i+1]>=nums[i-1]){
                               nums[i]=nums[i+1];
                           }else{
                               nums[i+1]=nums[i];
                           }
                       }else{
                           nums[i]=nums[i+1];
                       }
               }else{
                   break;
               }
           }
             return i==nums.length-1?true:false;
    }
}
