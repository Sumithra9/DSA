// User function Template for Java//User function Template for Java
class Solution {
    public void subsets(int[]arr,int ind,int sum,ArrayList<Integer> ans){
        ans.add(sum);
        for(int i=ind;i<arr.length;i++){
            sum+=arr[i];
            subsets(arr,i+1,sum,ans);
            sum-=arr[i];
        }
        
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        subsets(arr,0,0,ans);
        return ans;
        
    }
}