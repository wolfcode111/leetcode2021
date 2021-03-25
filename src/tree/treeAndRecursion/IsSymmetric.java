package tree.treeAndRecursion;

import tree.TreeNode;

public class IsSymmetric {

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left,root.right);

    }

    public  static  boolean isSame(TreeNode left,TreeNode right){
        if(left==null && right == null) return true;
        if((left==null && right != null)||(left!=null && right == null)) return false;
        if(left.val == right.val)
            return isSame(left.left,right.right) && isSame(left.right,right.left);
        else return false;
    }
}
