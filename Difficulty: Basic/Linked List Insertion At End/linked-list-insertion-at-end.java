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
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node current=head;
        Node newnode=new Node(x);
        if(head==null) {
            head=newnode;
            return head;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
        return head;
    }
}