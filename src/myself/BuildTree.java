package myself;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
/**
 * @Author:徐华东
 * @Date:2021/04/2:43
 * @Description:  这个是一个根据一维数据去自己建立树的数据结构
 */
public class BuildTree {


   static class TreeNode{
       int val;
       TreeNode left;
       TreeNode rigth;
       TreeNode(int x){
           val = x;
       }
   }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        TreeNode root = createBT(arr,0);  //建立树结构

        LayOrder(root);

    }

    public static TreeNode createBT(int[] arr , int i){
       TreeNode root = null;  //定义根节点
       if(i>= arr.length) return null;
       root = new TreeNode(arr[i]); //根节点
        root.left  = createBT(arr,2*i+1); //递归建立左孩子
        root.rigth = createBT(arr,2*i+2); //递归建立右孩子
      return root;
    }

    //先序遍历
    public static void PreOrder(TreeNode root){
       if(root == null) return ;
       System.out.print(root.val+" ");
       PreOrder(root.left);
       PreOrder(root.rigth);
    }

    //中序遍历
    public static void InOrder(TreeNode root){
       if(root == null) return ;
       InOrder(root.left);
       System.out.print(root.val+" ");
       InOrder(root.rigth);
    }

    //后序遍历
    public static void PostOrder(TreeNode root){
       if(root == null) return ;
        PostOrder(root.left);
        PostOrder(root.rigth);
        System.out.print(root.val+" ");
    }

   //层次遍历
    public static void LayOrder(TreeNode root){
        if (root == null) return;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.pop();
            System.out.print(cur.val+" ");
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.rigth != null){
                queue.add(cur.rigth);
            }
        }
    }

}
