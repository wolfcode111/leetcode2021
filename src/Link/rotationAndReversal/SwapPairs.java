package Link.rotationAndReversal;

import Link.ListNode;

/**
 *@Author:徐华东
 *@Date:2021/04/17:51
 *@Description:  24. 两两交换链表中的节点
 */public class SwapPairs {

    public static void main(String[] args) {

    }

    public static ListNode swapPairs(ListNode head) {
//        //在非递归中 ，可以先设置一个头结点，统一链表的格式
//        ListNode pre = new ListNode(0);
//        pre.next = head;
//        ListNode temp = pre;
//        while(temp.next!=null && temp.next.next !=null){
//            ListNode start = temp.next;
//            ListNode end = temp.next.next;
//            temp.next = end;
//            start.next = end.next;
//            end.next = start;
//            temp=start;
//        }
//        return pre.next;

        //在递归解法中
        if(head==null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next=head;
        return  next;
    }

}
