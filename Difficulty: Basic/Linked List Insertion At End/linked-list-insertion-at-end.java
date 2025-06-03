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
        Node curr=head;
        Node tail=new Node(x);
        if(head==null) return tail;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=tail;
        return head;
    }
}