package array.changeAndMove;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums={0,0,1};
        moveZeroes(nums);
        System.out.print("1111");
    }

    public static void moveZeroes(int[] nums){
       int i=0;
       int j=0;
       int[] temp = new int[nums.length];
       for(;i<nums.length;i++){
           if(nums[i]==0){
               continue;
           }else{
               temp[j++]=nums[i];
           }
       }
       if(j<nums.length){
           temp[j++]=0;
       }
       for(int count=0;count<nums.length;count++){
           nums[count]=temp[count];
       }
    }

}
