class Solution {
    public void reverse(int[] nums){
        int s=0;
        int e=nums.length-1;
        int temp;
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    public void swap(int nums[],int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1) reverse(nums);
        else{
            int min=Integer.MAX_VALUE;
            int sindex=-1;
            for(int i=index+1;i<nums.length;i++){
                if(nums[i]<min && nums[i]>nums[index]){
                    sindex=i;
                    min=nums[i];
                }
            }
            swap(nums,index,sindex);
            for(int i=index+1;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                        swap(nums,i,j);
                    }
                }
            }
        }
    }
}