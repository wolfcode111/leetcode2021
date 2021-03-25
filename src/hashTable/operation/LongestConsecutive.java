package hashTable.operation;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {

        int[] num = {0,3,7,2,5,8,4,6,0,1};
        System.out.print(longestConsecutive(num));

    }

    public static int longestConsecutive(int[] nums) {
      // 1.先将数组转化为set集合，因为这样的话我们就能够利用集合的contain方法来判断有没有
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int number = nums[i];
            int count=0;
            if(!set.contains(number-1)){  //这样就是将一些不必要去判断的给去掉
                while(set.contains(number+1)){
                    count++;
                    number+=1;
                }
            }
            max = Math.max(count,max);
        }
        return max+1;
    }
}
