package array.twoAndScroll;

import java.util.ArrayList;
import java.util.List;

public class GetRow {

    public static void main(String[] args) {
        int n =0;
        List<Integer> temp = new ArrayList<>();
        temp = getRow(n);
        System.out.print(temp.toString());
    }

    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (rowIndex < 1) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        } else {
            for (int i = 0; i <=rowIndex; i++) {
                ArrayList<Integer> temp = new ArrayList<>();  //这一步是关键，每一次都相当于重新定义
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0 || j == i) {
                        temp.add(1);
                    } else {
                        ArrayList<Integer> pre = (ArrayList<Integer>) list.get(i - 1);
                        int left = pre.get(j - 1);
                        int right = pre.get(j);
                        temp.add(left + right);
                    }
                }
                list.add(temp);
            }
        }
        return list.get(rowIndex);
    }
}
