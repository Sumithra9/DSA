/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int x=count-n+1;
        if(x==1) return head.next;
        temp=head;
        for(int i=1;i<x-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next== null) return head;
        temp.next=temp.next.next;
        return head;
    }
}