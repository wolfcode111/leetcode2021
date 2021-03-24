package Link.delete;

import Link.ListNode;

public class DeleteNode {

      public static void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
            //这种就是直接将值给覆盖掉，然后删除掉下一个节点
      }
}
