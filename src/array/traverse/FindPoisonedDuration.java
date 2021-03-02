package array.traverse;

public class FindPoisonedDuration {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int number = 2;
        System.out.println(findPoisonedDuration(nums,number));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0 || duration == 0) {
            return 0;
        }
        int res = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            res += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        }
        return res;
    }
}