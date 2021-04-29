package tree.leveltraversal;

import tree.TreeNode;

/**
 * @Author:徐华东
 * @Date:2021/04/14:53
 * @Description:
 */
public class FindSecondMinimumValue {


    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) return -1;

        //找到候选数，默认就是子节点值，如果子节点值和root值相同，递归，在子树中寻找候选数
        int left = root.left.val;
        int right = root.right.val;
        if (root.left.val == root.val) left = findSecondMinimumValue(root.left);
        if (root.right.val == root.val) right = findSecondMinimumValue(root.right);

        //如果左右二个候选数都正常，返回较小的
        if (left != -1 && right != -1) {
            return Math.min(left, right);
        }

        //如果候选数有-1,说明整个子树中是没有可供候选的数
        if (left == -1) {
            return right;
        }else{
            return left;
        }
    }
}
