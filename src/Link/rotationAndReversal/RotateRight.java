package Link.rotationAndReversal;

import Link.ListNode;

/**
 *@Author:徐华东
 *@Date:2021/04/17:32
 *@Description:  61. 旋转链表
 */public class RotateRight {

    public static void main(String[] args) {

    }

    public static ListNode rotateRight(ListNode head, int k) {

       if(k==0 || head == null || head.next == null){
           return head;
       }
       int n=1;
       ListNode temp = head;
       while(temp.next != null){
           n++;
           temp = temp.next;
       }
       int add = n-k%n;
       if(add == n){
           return head;
       }
       temp.next=head; //将整个链表进行收尾相连
       while(add -- >0){
           temp=temp.next;
       }
       ListNode res = temp.next;
       temp.next=null;
       return res;

    }

}
