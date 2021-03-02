package array.statistical;

public class FindErrorNums {

    public static void main(String[] args) {
        int[] num = {1,1};
        int[] result = new int[2];
        result = findErrorNums(num);
    }

    public static int[] findErrorNums(int[] nums) {
        int[] number = new int[2];
        int[] result = new int[nums.length+1];
        for(int i = 0 ;i<nums.length;i++){
            result[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(result[i]==2){
                number[0]=nums[i];
            }
            if(result[i]==0){
                number[1]=i;
            }
        }
        return number;
    }
}
