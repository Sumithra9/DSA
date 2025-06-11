class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack <Integer> nse=new Stack<>();
        Stack <Integer> pse=new Stack<>();
        int[] a=new int[arr.length];
        int[] b=new int[arr.length];
        int result=0;
        int mod=1_000_000_007;
        for(int i=0;i<arr.length;i++){
            while(!pse.isEmpty() && arr[i]<arr[pse.peek()]){
                pse.pop();
            }
            if(pse.isEmpty()) a[i]=i+1;
            else a[i]=i-pse.peek();
            pse.push(i);
        }
        for(int i=arr.length-1;i>=0;i--){
            while(!nse.isEmpty() && arr[i]<=arr[nse.peek()]){
                nse.pop();
            }
            if(nse.isEmpty()) b[i]=arr.length-i;
            else b[i]=nse.peek()-i;
            nse.push(i);
        }
        long total=0;
        for(int i=0;i<arr.length;i++){
            long prod=((long)(arr[i]*a[i]%mod)*b[i]%mod);
            total=(total+prod)%mod;
        }
        return (int)total;
    }
}