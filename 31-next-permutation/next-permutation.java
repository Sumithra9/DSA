class Solution {
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void swap(int nums[],int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public void nextPermutation(int[] nums) {
        int b=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                b=i;
                break;
            }
        }
        System.out.println(b);
        if(b==-1){
            reverse(nums,0,n-1);
        }
        else{
            int maxafterb=Integer.MAX_VALUE;
            int index=-1;
            for(int i=b+1;i<n;i++){
                if(nums[i]<maxafterb && nums[i]>nums[b]){
                    maxafterb=nums[i];
                    index=i;
                }
            }
            System.out.println(maxafterb+" "+index);
            swap(nums,b,index);
            for(int i=b+1;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                        swap(nums,i,j);
                    }
                }
            }
        }
    }
}