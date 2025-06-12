class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int left=0;
        int right=0;
        int ln=g.length;
        int rn=s.length;
        while(left<ln && right<rn){
            if(s[right]>=g[left]){
                count++;
                left++;
            }
            right++;
        }
        return count;
    }
}