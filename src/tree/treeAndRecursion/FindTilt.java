package tree.treeAndRecursion;

import tree.TreeNode;

/**
 * @Author:徐华东
 * @Date:2021/04/14:33
 * @Description: 563. 二叉树的坡度
 */


public class FindTilt {

     static  int res = 0;
    public static void main(String[] args) {


    }

    public static int findTilt(TreeNode root) {

        DFS(root);
        return res;
    }

    public static int DFS(TreeNode node){
        if(node == null) return 0;
        int leftNum = DFS(node.left);
        int rightNum = DFS(node.right);
        res+= Math.abs(rightNum -leftNum);
        return leftNum+rightNum+node.val;
    }
}
