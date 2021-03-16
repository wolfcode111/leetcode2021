package array.rotate;

public class MaxRotateFunction {

    public static void main(String[] args) {

        int[] number ={1000000007};
        System.out.print(maxRotateFunction(number));
    }

    public static int maxRotateFunction(int[] A) {
//        int max=Integer.MIN_VALUE;
//        int count=0;
//        int number=0;
//        for(int i=0;i<A.length;i++){
//            count=0;
//            number=0;
//             for(int j=i;j<A.length+i;j++){
//                 number+=count*A[j%A.length];
//                 count++;
//             }
//             if(number>max) max=number;
//        }
//        return max;

        int cur=0;
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            cur+=i*A[i];
            sum+=A[i];
        }
        int res = cur;
        if(res>max) max=res;
        for(int i=A.length-1;i>0;i--){
            res+=sum;
            res-=A[i]*A.length;
            if(res>max)max = res;
        }

        return max;
    }
}
