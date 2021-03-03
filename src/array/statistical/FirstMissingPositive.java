package array.statistical;

import java.util.Arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] num = {0,2,2,1,1};
        System.out.println(firstMissingPositive(num));

    }

    public static int firstMissingPositive(int[] nums) {
         //经典的桶排序问题
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>=1 && nums[i]<=n && nums[i]!=i+1 && nums[i] != nums[nums[i]-1]){  //最后一个判断是在有重复元素下其起作用
                swap(nums,i,nums[i]-1);   //i是当前的位置，nums[i]-1是应该去的目的地
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return n+1;
    }

    static void swap(int[] nums ,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;

    }
}
