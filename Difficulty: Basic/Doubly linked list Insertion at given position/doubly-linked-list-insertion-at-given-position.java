/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        Node node = new Node(x);
        Node temp = head;
        int count = 0;

        // Traverse to the p-th node
        while (count < p && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) return head; // Position is out of bounds
        node.next=temp.next;
        node.prev=temp;
        if(temp.next!=null) temp.next.prev=node;
        temp.next=node;
        return head;
        
    }
}