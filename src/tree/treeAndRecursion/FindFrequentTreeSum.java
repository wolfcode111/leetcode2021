package tree.treeAndRecursion;

import tree.TreeNode;

import java.util.*;

/**
 * @Author:徐华东
 * @Date:2021/04/13:47
 * @Description:  508. 出现次数最多的子树元素和
 *
 * 这题我们要学会使用map作为参数，传递给方法当中，在方法当中去改变值
 */
public class FindFrequentTreeSum {
       private int maxcount = 1;
       public int[] findFrequentTreeSum(TreeNode root){
           Map<Integer,Integer> hash = new HashMap<>();
           getSumAndCount(root,hash);
           int l=0;
           List<Integer> list = new ArrayList<>();
           Set key = hash.keySet();
           for(Object k :key){
               if(hash.get(k) == maxcount) list.add((int)k);
           }
           int[] ans = new int[list.size()];
           while(l<list.size()) ans[l]=list.get(l++);
           return ans;
    }
    public int getSumAndCount(TreeNode root,Map<Integer,Integer> map){
           if(root == null){
               return 0;
           }
           int l_sum = getSumAndCount(root.left,map);
           int r_sum = getSumAndCount(root.right,map);
           int ret = root.val+l_sum+r_sum;
           if(map.containsKey(ret)){
               int temp = map.get(ret)+1;
               map.put(ret,temp);
               if(maxcount < temp) maxcount = temp;
           }
           else map.put(ret,1);
           return ret;
    }
}
