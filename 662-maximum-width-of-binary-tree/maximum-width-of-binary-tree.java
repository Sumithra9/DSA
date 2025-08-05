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
    class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        int maxwidth=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            int start=0,end=0;
            for(int i=0;i<size;i++){
                Pair pair=queue.remove();
                TreeNode curr=pair.node;
                int ind=pair.index;
                if(i==0) start=ind;
                if(i==size-1) end=ind;
                if(curr.left!=null) queue.add(new Pair(curr.left,(2*ind)+1));
                if(curr.right!=null) queue.add(new Pair(curr.right,(2*ind)+2));
            }
            maxwidth=Math.max(maxwidth,end-start+1);
        }
         return maxwidth;
    }
}