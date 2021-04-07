package dynamicAndProgramming.array;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author:徐华东
 * @Date:2021/04/20:55
 * @Description:   338. 比特位计数
 */
public class CountBits {

    public static void main(String[] args) {

        int[] nums = new int[100];
        nums = countBits(2);
        for(int i : nums){
            System.out.println(i);
        }

    }
    public static int[] countBits(int num) {
//        int[] number = new int[num+1];
//        for (int i = 0; i <=num; i++) {
//            number[i] = toBinary(i);
//        }
//        return number;

        //一个数比如a，如果是偶数，那么a比特位1的个数和(a/2)比特位1的个数是一样的，
        // 因为一个数是偶数那么他的二进制比他的一半的二进制只是多了一个0而已。
        //如果是奇数就不一样了，他会比除以2的结果多了一个1
        // （比如9的二进制比4的二进制多一个1，19的二进制比9的二进制多一个1，等等）
        int[] bits = new int[num+1];
        for(int i= 1; i<=num;i++){
            //一个数的比特位1的个数先让他等于他一半的比特位量
            bits[i]=bits[i/2];
            //如果是奇数
            if((i%2)==1){
                bits[i]++;
            }

        }
        return bits;
    }

//    public static  int toBinary(int num){
//        int count=0;
//        while(num!=0){
//            if(num%2==1){
//                count++;
//             }
//            num/=2;
//        }
//        return count;
//    }


}
