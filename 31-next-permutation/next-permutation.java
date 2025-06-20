class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int start=0;
            int end=nums.length-1;
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        else{
            int maxi=Integer.MAX_VALUE;
            int index2=-1;
            for(int i=index+1;i<nums.length;i++){
                if(nums[i]<maxi && nums[i]>nums[index]){
                    maxi=nums[i];
                    index2=i;
                }
            }
            int tem=nums[index];
            nums[index]=nums[index2];
            nums[index2]=tem;
            for(int i=index+1;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
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