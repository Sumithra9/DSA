// User function Template for Java

class Solution {
    static boolean operator(char c){
        if(c=='-'||c=='+'||c=='*'||c=='/'||c=='%'||c=='^'){
            return true;
        }
        return false;
    }
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> s=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            char c=pre_exp.charAt(i);
            if(operator(c)){
                String op1=s.pop();
                String op2=s.pop();
                String exp="("+op1+c+op2+")";
                s.push(exp);
            }
            else s.push(String.valueOf(c));
        }
        return s.pop();
    }
}
