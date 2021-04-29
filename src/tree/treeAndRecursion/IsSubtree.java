package tree.treeAndRecursion;

import tree.TreeNode;

/**
 * @Author:徐华东
 * @Date:2021/04/23:09
 * @Description:  572. 另一个树的子树
 *
 * 其实就是三种情况，就是当前我们完全相等
 * 我得左子树跟你相等
 * 我得右子树跟你相等
 */
public class IsSubtree {

    public static void main(String[] args) {

    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true; //二者都遍历完了那就是返回正确
        if(s == null || t == null) return false; //二者有一方还没有遍历完，那就是返回假

        return isEqual(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public static boolean isEqual(TreeNode s,TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.val != t.val) return false;
        //这个二者必须要都是相同得我们才给他返回真值
        return isEqual(s.left,t.left) && isEqual(s.right,s.right);
    }
}
