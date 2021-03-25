package Link.traverse;

import Link.Node;

public class Flatten {

    public static void main(String[] args) {

    }

    public static Node flatten(Node head) {
        processChild(head,null);
        return head;
    }
    public  static void processChild(Node head,Node father){
        if(head ==  null) return ;  //特殊情况的处理
        Node cur = head;            //设置当前的位置所在地
        while(cur != null && cur.next != null){
            if(cur.child !=null){
                processChild(cur.child,cur);   //这种情况是属于T字型的，就是当前节点的后面还有节点
                cur.child = null;
            }
            cur = cur.next;  //继续搞后面的节点
        }
        if(father != null){   //开始去掉下面一层，将下面一层与上面一层进行连接
            Node fatherNext = father.next;
            father.next = head;
            head.prev = father;
            if(fatherNext!=null){
                cur.next=fatherNext;
                fatherNext.prev = cur;
            }
        }
        if(cur.child != null){   //这是处理 1 字型的情况，也就是没有后面的节点，但是有子节点
            processChild(cur.child,cur);
            cur.child = null;
        }
    }
}
