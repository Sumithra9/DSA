class Solution {
    public int countNodesinLoop(Node head) {
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int count=1;
                fast=fast.next;
                while(fast!=slow){
                    fast=fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
