class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = (m * n) - 1;
        int var = rec(matrix, target, low, high, n);

        if (var == 0){
            return false;
        }

        return true;
        
    }

    public static int rec(int[][] matrix, int target, int low, int high, int n){
        
        int mid = (low + high) / 2;

        int mid_row = mid / n;
        int mid_col = mid % n;
        int count = 0;

        if (low>high){
            return count;
        }

        if (matrix[mid_row][mid_col] == target){
            count = 1;
            return count;
        }

        if (matrix[mid_row][mid_col] > target){
            return rec(matrix, target, low, mid - 1, n);
        }

        return rec(matrix, target, mid + 1, high, n);
    }
}