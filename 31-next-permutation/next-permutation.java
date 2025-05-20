class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int b=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                b=i;
                break;
            }
        }
        if(b==-1){
            int start=0;
            int end=n-1;
            while(start<end){
                int x=nums[start];
                nums[start]=nums[end];
                nums[end]=x;
                start++;
                end--;
            }
        }
        else{
            int r=Integer.MAX_VALUE;
            int index=-1;
            for(int i=b+1;i<n;i++){
                if(nums[i]<r && nums[i]>nums[b]){
                    r=nums[i];
                    index=i;
                }
            }
            int temp=nums[b];
            nums[b]=r;
            nums[index]=temp;
            for(int i=b+1;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]>nums[j]){
                        int t=nums[i];
                        nums[i]=nums[j];
                        nums[j]=t;
                    }
                }
            }

        }
    }
}