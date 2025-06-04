class Solution {
    public int countNodesinLoop(Node head) {
        Node slow = head, fast = head;

        // Step 1: Detect Loop using Floyd's Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                // Step 2: Count nodes in loop
                return countLoopNodes(slow);
            }
        }
        return 0; // No loop
    }

    private int countLoopNodes(Node loopNode) {
        Node temp = loopNode;
        int count = 1;

        while (temp.next != loopNode) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
