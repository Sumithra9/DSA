/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node findmiddle(Node head){
        Node fast=head;
        Node slow=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        return prev;
    }
    static Node merge(Node l1,Node l2){
        Node head=new Node(-1);
        Node temp=head;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        while(l1!=null){
            temp.next=l1;
            l1=l1.next;
            temp=temp.next;
        }
        while(l2!=null){
            temp.next=l2;
            l2=l2.next;
            temp=temp.next;
        }

        return head.next;
    }
    static Node segregate(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node middle=findmiddle(head);
        Node left=head;
        Node right=middle.next;
        middle.next=null;
        left=segregate(left);
        right=segregate(right);
        return merge(left,right);
    }
}