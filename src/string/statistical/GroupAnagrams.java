package string.statistical;
import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.print(groupAnagrams(s));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);   // 这里得到的是一个排过序的数组
            String key = String.valueOf(c); //这里是将一个字符数组给转为字符串
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());  //这里是判断map集合里面有没有这个键，没有就添加上

            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
