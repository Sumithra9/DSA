/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    void leftboundary(Node node,ArrayList<Integer> result){
        Node curr=node.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                result.add(curr.data);
            }
            if(curr.left!=null) curr=curr.left;
            else curr=curr.right;
        }
    }
    void rightboundary(Node node,ArrayList<Integer> result){
        Node curr=node.right;
        Stack<Integer>stack=new Stack<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                stack.push(curr.data);
            }
            if(curr.right!=null) curr=curr.right;
            else curr=curr.left;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
    }
    void leafnodes(Node node,ArrayList<Integer> result){
        if(isLeaf(node)){
            result.add(node.data);
            return;
        }
        if(node.left!=null) leafnodes(node.left,result);
        if(node.right!=null) leafnodes(node.right,result);
    }
    boolean isLeaf(Node node){
        return (node.left==null && node.right==null);
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> result=new ArrayList<>();
        if(node==null) return result;
        if(!isLeaf(node)) result.add(node.data);
        leftboundary(node,result);
        leafnodes(node,result);
        rightboundary(node,result);
        return result;
    }
}