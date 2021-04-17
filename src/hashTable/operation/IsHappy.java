package hashTable.operation;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author:徐华东
 * @Date:2021/04/23:02
 * @Description:     202. 快乐数
 */
public class IsHappy {

    public static void main(String[] args) {
        System.out.println(19);
    }

    public static boolean isHappy(int n) {
        int number = n;
        List<Integer> list = new ArrayList<>();
        while (number != 1) {
            int temp = 0;
            while (number > 0) {
                temp += Math.pow(number % 10, 2);
                number /= 10;
            }
            if (list.contains(temp)) {
                return false;
            } else {
                list.add(temp);
            }
            number = temp;
        }
        return true;
    }
}
