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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root == null ) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode current=queue.poll();
                level.add(current.val);
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
            }
            result.add(level);
        }
        for(int i=0;i<result.size();i++){
            if(i%2!=0){
                Collections.reverse(result.get(i));
            }
        }
        return result;
        
    }
}