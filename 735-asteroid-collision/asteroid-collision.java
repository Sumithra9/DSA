class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int a:asteroids){
            boolean dest=false;
            while(!stack.isEmpty() && a<0 && stack.peek()>0){
                if(stack.peek()<-a){
                    stack.pop();
                }
                else if(stack.peek()==-a){
                    stack.pop();
                    dest=true;
                    break;
                }
                else{
                    dest=true;
                    break;
                }
            }
            if(!dest){
                stack.push(a);
            }
        }
        int n=stack.size();
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }
}