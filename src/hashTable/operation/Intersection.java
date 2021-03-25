package hashTable.operation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {

        int[] num1 ={4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] re = intersection(num1,num2);
        System.out.print(intersection(num1,num2).toString());

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set = new HashSet<>();
      Set<Integer> result = new HashSet<>();
      for(int i=0;i<nums1.length;i++){
          set.add(nums1[i]);
      }
      for(int i=0;i< nums2.length;i++){
          if(set.contains(nums2[i])){
               result.add(nums2[i]);
          }
      }
        Object[] ac = result.toArray();
         int[] temp = new int[result.size()];
         for(int i=0;i<result.size();i++){
             temp[i]=(int)ac[i];
         }
        return temp;
    }
}
