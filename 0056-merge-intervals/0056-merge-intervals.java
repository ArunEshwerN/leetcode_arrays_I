class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> al = new ArrayList<>();

        int n = intervals.length; 

        //Brute Force
        // for (int i = 0; i < n; i++) {
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];

        //     if (!al.isEmpty() && end <= al.get(al.size() - 1)[1]) {
        //         continue;
        //     }

        //     for (int j = i + 1; j < n; j++) {
        //         if (intervals[j][0] <= end) {
        //             end = Math.max(end, intervals[j][1]);
        //         } else {
        //             break;
        //         }
        //     }

        //     al.add(new int[] {start, end});
        // }

        // return al.toArray(new int[al.size()][]);

        //Optimal Approach
        for (int i = 0; i<n; i++){

            if (al.isEmpty() || intervals[i][0] > al.get(al.size()-1)[1]){
                al.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            else{
                al.get(al.size()-1)[1] = Math.max(intervals[i][1], al.get(al.size()-1)[1]);
            }


        }

        return al.toArray(new int[al.size()][]);

    }
}