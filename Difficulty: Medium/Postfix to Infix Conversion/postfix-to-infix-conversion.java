// User function Template for Java

class Solution {
    static boolean operator(char c){
        if(c=='-'||c=='+'||c=='*'||c=='/'||c=='%'||c=='^'){
            return true;
        }
        return false;
    }
    static String postToInfix(String exp) {
        // code here
        Stack<String> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(operator(c)){
                String op1=s.pop();
                String op2=s.pop();
                String ex="("+op1+c+op2+")";
                s.push(ex);
            }
            else s.push(String.valueOf(c));
        }
        String reversed=s.pop();
        char[] arr = reversed.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(')arr[i]=')';
            else if(arr[i]==')') arr[i]='(';
            else continue;
        }
        return new String(arr);
    }
}
