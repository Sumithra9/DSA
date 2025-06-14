class Solution {
    class Item{
        int value;
        int weight;
        double ratio;
        Item(int v,int w,double r){
            value=v;
            weight=w;
            ratio=r;
        }
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n=values.length;
        int current=0;
        double prof=0;
        double[] ratio=new double[n];
        for(int i=0;i<n;i++){
            ratio[i]=(double)values[i]/weights[i];
        }
        Item[] items=new Item[n];
        for(int i=0;i<n;i++){
            items[i]=new Item(values[i],weights[i],ratio[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        for(Item item: items){
            if(current+item.weight<=W){
                current+=item.weight;
                prof+=item.value;
            }
            else{
                prof+=(W-current)*item.ratio;
                break;
            }
        }
        return prof;
    }
}