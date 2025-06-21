// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int num: arr){
            if(num>=0) pos.add(num);
            else neg.add(num);
        }
        int i=0;
        for(int j=0;j<pos.size();j++){
            arr[i]=pos.get(j);
            i++;
        }
        for(int j=0;j<neg.size();j++){
            arr[i]=neg.get(j);
            i++;
        }
        
    }
}