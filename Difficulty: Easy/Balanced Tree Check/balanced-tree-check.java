/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public int check(Node root){
        if(root==null) return 0;
        int lh=check(root.left);
        if(lh==-1) return -1;
        int rh=check(root.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;
        return Math.max(rh,lh)+1;
    }
    public boolean isBalanced(Node root) {
        int h=check(root);
        return (h!=-1);
        
    }
}