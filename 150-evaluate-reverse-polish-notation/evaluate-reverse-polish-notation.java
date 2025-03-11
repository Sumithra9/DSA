class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                int a=stack.pop();
                int b=stack.pop();
                switch (tokens[i]){
                    case "+":
                        stack.push(b+a);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(b*a);
                        break;
                    case "/":
                        stack.push(b/a);
                        break; 
                }
            }
            else{
                    stack.push(Integer.parseInt(tokens[i]));
                }
        }
        int ans =stack.pop();
        return ans;
    }
}