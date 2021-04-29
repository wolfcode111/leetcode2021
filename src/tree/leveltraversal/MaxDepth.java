package tree.leveltraversal;
import java.util.List;
/**
 * @Author:徐华东
 * @Date:2021/04/13:32
 * @Description:
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class MaxDepth {

    public int maxDepth(Node root) {
        int max = 0;
        if(root == null) return 0;
        if(root.children == null) return 1;
        for(Node n : root.children){
            max = Math.max(maxDepth(n),max);
        }
        return max;
    }
}
