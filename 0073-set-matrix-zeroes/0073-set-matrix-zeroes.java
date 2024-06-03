class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        for (int i = 0; i< m; i++){
            for (int j = 0; j<n;j++){
                
                if (matrix[i][j] == 0){
                al.add(i);
                al2.add(j);
                }

                
            }
        }

        int index_row = 0;
        int temp = 0;

        for (int j = 0; j < al.size(); j++){

            for (int i = 0; i < n; i++){
                
                temp = al.get(j);
                matrix[temp][i] = 0;
            }
        }

        int index_col = 0;
        int temp2 = 0;

        for (int j = 0; j < al2.size(); j++){
            
            for (int i = 0; i < m; i++){
                
                temp = al2.get(j);
                matrix[i][temp] = 0;
            }
        }

        

        
    }
}