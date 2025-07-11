
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:a) map.put(num,map.getOrDefault(num,0)+1);
        for(int num:b){
            if(map.containsKey(num) && map.get(num)>0){
                map.put(num,map.get(num)-1);
            }
            else return false;
        }
        return true;
    }
}
