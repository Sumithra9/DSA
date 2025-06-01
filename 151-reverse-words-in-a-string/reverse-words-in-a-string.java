class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        int start=0;
        int end=str.length-1;
        String result="";
        int n=str.length;
        for(int i=n-1;i>=0;i--){
            result+=str[i];
            result+=" ";
        }
        return result.substring(0,result.length()-1);
    }
}