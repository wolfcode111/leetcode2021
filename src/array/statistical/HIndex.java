package array.statistical;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {

        int[] nums = {3,0,6,1,5};
        System.out.println(hIndex(nums));
    }

    public static int hIndex(int[] citations) {

        int n=1;
        Arrays.sort(citations);
        int len=citations.length-1;
        for(int i=len;i>=0;i--){
              if(citations[i]>=n){
                  n++;
                  continue;
              }else{
                  break;
              }
        }
        return n-1;
    }
}
