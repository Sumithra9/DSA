// User function Template for Java

class Solution {
    static boolean operator(char c){
        if(c=='-'||c=='+'||c=='*'||c=='/'||c=='%'||c=='^'){
            return true;
        }
        return false;
    }
    static String preToPost(String exp) {
        // code here
        Stack<String> s=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char c=exp.charAt(i);
            if(operator(c)){
                String op1=s.pop();
                String op2=s.pop();
                String ex=op1+op2+c;
                s.push(ex);
            }
            else s.push(String.valueOf(c));
        }
        return s.pop();
    }
}
