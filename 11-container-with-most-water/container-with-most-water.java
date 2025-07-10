class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int maxwater=0;
        while(left<right){
            int water=(Math.min(height[left],height[right]))*(right-left);
            maxwater=Math.max(water,maxwater);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxwater;
    }
}