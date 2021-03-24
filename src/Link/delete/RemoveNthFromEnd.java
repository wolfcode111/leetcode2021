package Link.delete;

import Link.ListNode;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //先走n步战略
        ListNode sitimal = new ListNode(0,head);
        ListNode prev = sitimal;
        ListNode curr = sitimal.next;
        for(int i=0;i<n;i++){
            curr= curr.next;
        }
        while(curr!=null){  //在这里不要去判断curr的下一个，因为可能会出现当前节点是空，下一个节点也会是空
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = prev.next.next;
        return sitimal.next;
    }
}
