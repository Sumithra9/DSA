// User function Template for Java

class Solution {
    public Node insertAtBegining(Node head, int x) {
        // Code here
        Node insert=new Node(x);
        if(head==null) return insert;
        insert.next=head;
        return insert;
    }
}