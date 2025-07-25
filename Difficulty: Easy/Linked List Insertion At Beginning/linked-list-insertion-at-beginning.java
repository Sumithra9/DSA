// User function Template for Java

class Solution {
    public Node insertAtBegining(Node head, int x) {
        // Code here
        Node insert=new Node(x);
        insert.next=head;
        return insert;
    }
}