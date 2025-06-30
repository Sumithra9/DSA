class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            int count=n-i;
            if(count<=citations[i]){
                return count;
            }
        }
        return 0;
    }
}