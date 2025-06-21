/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        List<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> level=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr=queue.remove();
                list.add(curr.data);
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            result.add(list);
        }
        Collections.reverse(result);
        for(List<Integer>arr:result){
            for(Integer num:arr){
                level.add(num);
            }
        }
        return level;
    }
}