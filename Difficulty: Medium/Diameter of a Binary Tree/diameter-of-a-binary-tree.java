/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int d=0;
    int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        d=Math.max(d,lh+rh);
        return Math.max(lh,rh)+1;
    }
    int diameter(Node root) {
        int h=height(root);
        return d;
        
    }
}