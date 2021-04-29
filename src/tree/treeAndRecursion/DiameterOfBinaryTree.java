package tree.treeAndRecursion;

import tree.TreeNode;

/**
 * @Author:徐华东
 * @Date:2021/04/9:51
 * @Description: 543. 二叉树的直径
 * 这题有一个问题就是最长的路径是有可能不穿过跟节点的
 */
public class DiameterOfBinaryTree {

    private static int max;
    public int diameterOfBinaryTree(TreeNode root) {
          if(root ==null) return 0;
          return len(root.left)+len(root.right);
    }

    public static int len(TreeNode node){
        if(node==null) return 0;
        int num = 1+Math.max(len(node.left),len(node.right));
        if(max<num) num = max;
        return num;
    }
}
