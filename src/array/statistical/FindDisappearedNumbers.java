package array.statistical;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public static void main(String[] args) {

        int[] num = {4,3,2,7,8,2,3,1};
        List<Integer> list  = new ArrayList<>();
        list = findDisappearedNumbers(num);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> col = new ArrayList<>();
        int[] result = new int[nums.length+1];
        for(int i=0;i< nums.length;i++){
            result[nums[i]]++;
        }
        for(int i=1;i<result.length;i++){
            if(result[i]==0){
                col.add(i);
            }
        }
        return col;
    }
}
