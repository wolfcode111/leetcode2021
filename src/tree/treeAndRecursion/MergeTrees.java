package tree.treeAndRecursion;

import tree.TreeNode;

/**
 * @Author:徐华东
 * @Date:2021/04/16:13
 * @Description:  617. 合并二叉树
 */
public class MergeTrees {

    public static void main(String[] args) {

    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1 == null && root2 == null) return null;
//        TreeNode node = new TreeNode(0);
//        if(root1 == null){
//            node.val = root2.val;
//            node.left = mergeTrees(null,root2.left);
//            node.right = mergeTrees(null,root2.right);
//        }else if(root2 == null){
//            node.val = root1.val;
//            node.left = mergeTrees(root1.left,null);
//            node.right = mergeTrees(root1.right,null);
//        }else{
//            node.val = root1.val + root2.val;
//            node.left = mergeTrees(root1.left,root2.left);
//            node.right = mergeTrees(root1.right,root2.right);
//        }
//        return node;
        if(root1 == null || root2 == null){
            return root1 == null ? root2 : root1;
        }
        return dfs(root1,root2);
    }

    static TreeNode dfs(TreeNode r1,TreeNode r2){
        if(r1 == null || r2 == null){
            return r1 == null ? r2:r1;
        }
        r1.val += r2.val;
        r1.left = dfs(r1.left,r2.left);
        r2.right = dfs(r1.right,r2.right);
        return r1;
    }
}
