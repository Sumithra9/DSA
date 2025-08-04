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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null) return 0;
        queue.add(root);
        int maxsum=Integer.MIN_VALUE;
        int count=0;
        int maxcount=root.val;
        while(!queue.isEmpty()){
            int size=queue.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=queue.remove();
                sum+=curr.val;
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            count++;
            if(sum>maxsum){
                maxsum=sum;
                maxcount=count;
            }
        }
    return maxcount;
    }
}