class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        int start=0;
        int end=str.length-1;
        while(start<=end){
            String temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        String result="";
        for(String r:str){
            result+=r;
            result+=" ";
        }
        return result.substring(0,result.length()-1);
    }
}