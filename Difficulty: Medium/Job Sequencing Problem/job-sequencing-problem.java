class Solution {
    class Job{
        int deadline;
        int profit;
        Job(int d,int p){
            deadline=d;
            profit=p;
        }
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n=deadline.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
        }
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxi=0;
        for(Job job:jobs){
            maxi=Math.max(maxi,job.deadline);
        }
        int[] arr=new int[maxi+1];
        int total=0;
        int count=0;
        Arrays.fill(arr,-1);
        for(Job job:jobs){
            for(int i=job.deadline;i>0;i--){
                if(arr[i]==-1){
                    arr[i]=job.profit;
                    count++;
                    total+=job.profit;
                    break;
                }
            }
        }
        ArrayList<Integer>result=new ArrayList<>();
        result.add(count);
        result.add(total);
        return result;
    }
}