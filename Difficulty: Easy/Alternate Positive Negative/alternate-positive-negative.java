// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int k=0;
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        int i=0;
        int j=0;
        for(Integer num:arr){
            if(num>=0) pos.add(num);
            else neg.add(num);
        }
        int pn=pos.size();
        int nn=neg.size();
        while(i<pn && j<nn){
            if(k%2==0){
                arr.set(k,pos.get(i));
                i++;
            }
            else{
                arr.set(k,neg.get(j));
                j++;
            }
            k++;
        }
        while(i<pn){
            arr.set(k,pos.get(i));
            i++;
            k++;
        }
        while(j<nn){
            arr.set(k,neg.get(j));
            j++;
            k++;
        }
    }
}