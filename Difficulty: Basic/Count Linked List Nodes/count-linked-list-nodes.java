/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        if(head==null) return 0;
        int count=1;
        Node current=head;
        while(current.next!=null){
            current=current.next;
            count++;
        }
        return count;
    }
}