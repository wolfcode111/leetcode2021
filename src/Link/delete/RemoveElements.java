package Link.delete;

import Link.ListNode;

import java.awt.*;

public class RemoveElements {


    //为了避免头节点可能为空的情况，我们需要去设置一个哨兵节点来标准化整个链表
    //哨兵节点广泛应用于树和链表中，如伪头，伪尾，标记等
    //它们是纯功能的，通常不保存任何数据，使链表永不为空，永不无头，简单化插入和删除
    public static ListNode removeElements(ListNode head, int val) {
        ListNode sentimal = new ListNode(0);
        sentimal.next=head;
        ListNode prev,curr;
        prev=sentimal;
        curr=sentimal.next;
        while(curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return sentimal.next;
    }

}
