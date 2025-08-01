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
    public void inorder(List<Integer>arr,TreeNode root){
        if(root==null) return;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        inorder(arr,root);
        int min=Integer.MAX_VALUE;
        int n=arr.size();
        for(int i=1;i<n;i++){
            int diff=Math.abs(arr.get(i-1)-arr.get(i));
            min=Math.min(min,diff);
        }
        return min;
    }
}