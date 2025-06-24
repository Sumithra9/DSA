class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==0) return 0;
        List<Integer>list=new ArrayList<>();
        for(int num:nums1) list.add(num);
        for(int num:nums2) list.add(num);
        Collections.sort(list);
        int n=list.size();
        double ans;
        if(n%2==0){
            int n1=(n-1)/2;
            int n2=n1+1;
            System.out.println(n1+" "+n2);
            ans=(((double)list.get(n1)+(double)list.get(n2))/2);
        }
        else{
            int a=(n-1)/2;
            System.out.println(a);
            ans=(double)(list.get(a));
        }
        return ans;
    }
}