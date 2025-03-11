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
    public int treeHeight(TreeNode root){
        if(root==null) return 0;
        int leftHt=treeHeight(root.left);
        int rightHt=treeHeight(root.right);
        int height=Math.max(leftHt,rightHt)+1;
        return height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        int d3=treeHeight(root.left)+treeHeight(root.right);
        return Math.max(d3,Math.max(d1,d2));
    }
}