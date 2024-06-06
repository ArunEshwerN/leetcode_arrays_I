class Solution {
    public int uniquePaths(int m, int n) {
        
        // Brute
        // int call = rec(0, 0, m, n);

        // return call;

        // Optimal
        int[][] arr = new int[m][n];
        int call = rec(0, 0, m, n, arr);

        return call;

    }

    public static int rec(int start_row, int start_col, int m, int n, int[][] arr){
        
        // //Base Condition
        // if (start_row == (m - 1) && start_col == (n-1)){
        //     return 1;
        // }

        // //Out of Bound Condition
        // if (start_row >= m || start_col >= n){
        //     return 0;
        // }

        // //I can move down
        // int sum = 0;
        // sum += (rec(start_row+1, start_col, m, n) + rec(start_row, start_col+1, m, n));
        // //Move Right
        // return sum;

        //Base Condition
        if (start_row == (m - 1) && start_col == (n-1)){
            return 1;
        }

        //Out of Bound Condition
        if (start_row >= m || start_col >= n){
            return 0;
        }

        //I can move down
        int sum = 0;

        if (arr[start_row][start_col]!=0){
            return arr[start_row][start_col];
        }

        sum += (rec(start_row+1, start_col, m, n, arr) + rec(start_row, start_col+1, m, n, arr));

        arr[start_row][start_col] = sum;
        //Move Right
        return sum;
    }
}