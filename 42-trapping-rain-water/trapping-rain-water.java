class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack=new Stack<>();
        int trapwater=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && height[i]>height[stack.peek()]){
                int bottom=stack.pop();
                if(stack.isEmpty()) break;
                int left=stack.peek();
                int width=i-left-1;
                int bh=Math.min(height[i],height[left])-height[bottom];
                trapwater+=(width*bh);
            }
            stack.push(i);
        }
        return trapwater;
    }
}