package tree.treeAndRecursion;

import tree.TreeNode;

public class CountNodes {

    public static int countNodes(TreeNode root) {
       return root==null?0:1+countNodes(root.left)+countNodes(root.right);
    }
}
