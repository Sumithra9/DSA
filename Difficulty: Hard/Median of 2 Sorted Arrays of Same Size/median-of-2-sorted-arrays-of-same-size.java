// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        if(a.length==0 || b.length==0) return 0;
        int m1=a.length-1;
        int m2=m1+1;
        List<Integer>list=new ArrayList<>();
        for(int num:a) list.add(num);
        for(int num:b) list.add(num);
        Collections.sort(list);
        double ans=(double)(list.get(m1)+list.get(m2))/2;
        return ans;
    }
}