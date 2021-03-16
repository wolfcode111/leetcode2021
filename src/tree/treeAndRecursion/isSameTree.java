package tree.treeAndRecursion;
import tree.TreeNode;
public class isSameTree {

    public static void main(String[] args) {
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p1 = new TreeNode(1,p2,p3);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(3);
        TreeNode q1 = new TreeNode(1,q2,q3);
        System.out.print(isSameTree(p1,q1));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
          if(p == null && q==null)
              return true;
          if(p == null || q==null)
              return false;
          if(p.val !=q.val)
              return false;
          return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}