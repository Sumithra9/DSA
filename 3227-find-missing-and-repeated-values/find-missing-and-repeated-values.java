class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int sum=0;
        int s=n*n;
        int realsum=(s*(s+1))/2;
        int repeating=-1;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    repeating=grid[i][j];
                    break;
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
        }
        sum-=repeating;
        int missing=realsum-sum;
        int[] arr=new int[2];
        arr[0]=repeating;
        arr[1]=missing;
        System.out.println(sum);
        System.out.println(realsum);
        return arr;


    }
}