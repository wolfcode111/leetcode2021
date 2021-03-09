package array.twoAndScroll;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

public class Generate {

    public static void main(String[] args) {
       int n = 5;
       generate(n);
        System.out.print("1111");
    }
    public static List<List<Integer>> generate(int numRows) {

        //本题是杨辉三角，这里要注意的是，list.add(temp)时，temp清空后list空了
        //所以要在循环中重复的进行定义
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows<1){
            return list;
        }else{
            for(int i=0;i<numRows;i++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0;j<i+1;j++){
                    if(j==0 || j==i){
                        temp.add(1);
                    }else{
                        ArrayList<Integer> pre = (ArrayList<Integer>)list.get(i-1);
                        int left = pre.get(j-1);
                        int right = pre.get(j);
                        temp.add(left+right);
                    }
                }
                list.add(temp);
            }
        }
        return list;
    }
}
