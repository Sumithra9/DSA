/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    static public Node reverse(Node head){
        if(head==null||head.next==null) return head;
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        head=reverse(head);
        int carry=1;
        Node temp=head;
        while(temp!=null){
            temp.data=temp.data+carry;
            if(temp.data<10){
                carry=0;
                break;
            }
            else{
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }
        head=reverse(head);
        if(carry==1){
            Node start=new Node(1);
            start.next=head;
            return start;
        }
        return head;
    }
}