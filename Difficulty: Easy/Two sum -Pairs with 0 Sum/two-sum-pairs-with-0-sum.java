// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int posindex=-1;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==0){
                ArrayList<Integer>ans=new ArrayList<>(Arrays.asList(arr[left],arr[right]));
                result.add(ans);
                int leftval=arr[left];
                int rightval=arr[right];
                while(left<right && arr[left]==leftval) left++;
                while(left<right && arr[right]==rightval) right--;
            }
            else if (sum>0) right--;
            else left++;
        }
        return result;
    }
}
