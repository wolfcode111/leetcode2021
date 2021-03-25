package tree.treeAndRecursion;

import tree.TreeNode;

public class InvertTree {

    public static void main(String[] args) {
        
    }

    public static TreeNode invertTree(TreeNode root) {

            if(root == null) return null;
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
           invertTree(root.left);
           invertTree(root.right);
            return root;
    }
}
