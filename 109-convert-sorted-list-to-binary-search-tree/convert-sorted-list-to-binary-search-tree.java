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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ListNode findMiddle(ListNode start,ListNode end){
        ListNode fast=start;
        ListNode slow=start;
        while(fast!=end && fast.next!=end){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public TreeNode sortedListToBST(ListNode head) {
        return BSTHelper(head,null);
    }
    public TreeNode BSTHelper(ListNode start,ListNode end){
        if(start==end) return null;
        ListNode mid=findMiddle(start,end);
        TreeNode root=new TreeNode(mid.val);
        root.left=BSTHelper(start,mid);
        root.right=BSTHelper(mid.next,end);
        return root;
    }
}