class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    static class Meeting{
        int start;
        int end;
        Meeting(int s,int e){
            start=s;
            end=e;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        int n=start.length;
        Meeting[] meetings=new Meeting[n];
        for(int i=0;i<n;i++){
            meetings[i]=new Meeting(start[i],end[i]);
        }
        Arrays.sort(meetings,(a,b)->{
            if(a.end!=b.end) return a.end-b.end;
            else return a.start-b.start;
        });
        int count=1;
        int e=meetings[0].end;
        for(int i=1;i<n;i++){
            if(meetings[i].start>e){
                count++;
                e=meetings[i].end;
            }
        }
        return count;
    }
}
