class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;  // count of non-overlapping intervals
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            // If current interval starts after or at the end of last selected
            if (intervals[i][0] >= lastEnd) {
                count++;
                lastEnd = intervals[i][1];
            }
        }

        return intervals.length - count;
    }
}