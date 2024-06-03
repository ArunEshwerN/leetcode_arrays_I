class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        
        
        for (int j = 1; j <= numRows; j++) {

            List<Integer> row = new ArrayList<>();
            int temp = 1;
            row.add(temp);

            // temp2 = j - 1;
            // System.out.print("1" + " ");
            
            for (int i = 1; i < j; i++) {
                
                temp = temp * (j - i) /i;
                row.add(temp);
                
                
                // System.out.print((int) temp + " ");
            }
            // System.out.println();
            triangle.add(row);
        }

        return triangle;
    }
}