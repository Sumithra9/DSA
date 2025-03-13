/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    private int findPeakIndex(MountainArray arr) {
        int left = 0, right = arr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }
        return left;
    }
    public int binarySearchAscending(MountainArray arr, int left, int right, int target){
        if(left>right) return -1;
        int mid=left+(right-left)/2;
        if(arr.get(mid)==target) return mid;
        else if (arr.get(mid)<target) return binarySearchAscending(arr,mid+1,right,target);
        else return binarySearchAscending(arr, left, mid - 1, target);
    }
    public int binarySearchDescending(MountainArray arr, int left, int right, int target){
        if(left>right) return -1;
        int mid=left+(right-left)/2;
        if(arr.get(mid)==target) return mid;
        else if (arr.get(mid)>target) return binarySearchDescending(arr,mid+1,right,target);
        else return binarySearchDescending(arr, left, mid - 1, target);
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeakIndex(mountainArr);
        int a=binarySearchAscending(mountainArr,0,peak,target);
        if(a!=-1) return a;
        return binarySearchDescending(mountainArr,peak+1,mountainArr.length()-1,target);
    }
}