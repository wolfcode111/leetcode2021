package array.rotate;

public class Rotate {

    public static void main(String[] args) {
        int[] nums = {-1};
        rotate(nums,2);
        System.out.print(nums);
    }

    public static void rotate(int[] nums, int k) {

        int temp=0;
        if(k>nums.length) k=k%nums.length;
        int[] number = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            number[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=number[nums.length+i];
        }
        for(int i=k;i< nums.length;i++){
            nums[i]=number[i];
        }

        //第二种解法就是先将整个数组全部反转
        //然后反转前k个，再反转后面的剩下所有元素
    }
}
