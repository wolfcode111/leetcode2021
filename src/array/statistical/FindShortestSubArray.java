package array.statistical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {

    public static void main(String[] args) {

    }

    public static int findShortestSubArray(int[] nums) {
        int len = nums.length,maxCount=0,minWindow=0;
        Map<Integer,int[]> map = new HashMap<>();     //最重要的就是构建了这样一个数据结构，
        //使得我们可以直接得到一个数字最开始出现的位置信息和次数信息
        for(int i=0;i<len;i++){
            int[] pair = map.get(nums[i]);  //每个元素第一个次出现的位置，和当前出现了几次
            if(pair == null){
                pair = new int[]{i,1};    //在 i 的位置出现了一次
                map.put(nums[i],pair);    //map 里面的内容是 元素num[i]在i的位置出现了1次
            }else{
                pair[1]++;
            }
            if(pair[1]>maxCount){
                maxCount=pair[1];
                minWindow=i-pair[0]+1;
            }else if(pair[1]==maxCount){
                 minWindow = Math.min(minWindow,i-pair[0]+1);
            }
        }
        return minWindow;
    }

}
