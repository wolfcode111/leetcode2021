package array.twoAndScroll;

public class MaxCount {

    public static void main(String[] args) {

        int[][] num = {};
        System.out.print(maxCount(3,3,num));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        // 其实这一题就是要找到最小的行值和列值
        // 那么重复累加的数就是最大的数
        // 返回值就是m*n了

        for(int i=0;i<ops.length;i++){
            m=Math.min(m,ops[i][0]);
            n=Math.min(n,ops[i][1]);
        }
        return m*n;
    }
}
