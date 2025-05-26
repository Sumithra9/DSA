// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        long sum=(long)n*(n+1)/2;
        long asum=0;
        int r=0;
        for(int num:arr){
            asum+=num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key)==2){
                r=key;
                break;
            }
        }
        asum=asum-(long)r;
        int m=(int)(sum-asum);
        result.add(r);
        result.add(m);
        return result;
        
    }
}
