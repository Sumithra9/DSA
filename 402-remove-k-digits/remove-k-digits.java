class Solution {
    public String removeKdigits(String num, int k) {
        String result="";
        char[] arr=num.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char a: arr){
            while(!stack.isEmpty() && k>0 && stack.peek()>a){
                stack.pop();
                k--;
            }
            stack.push(a);
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        int l=stack.size();
        for(int i=0;i<l;i++){
            result+=stack.pop();
        }
        StringBuilder reversed = new StringBuilder(result).reverse();
        while (reversed.length() > 0 && reversed.charAt(0) == '0') {
            reversed.deleteCharAt(0);
        }
        if(reversed.length()==0) return "0";
        else return reversed.toString();
    }
}