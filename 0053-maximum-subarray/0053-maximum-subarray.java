class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;

        int i = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

            while(i<length){

                sum = sum + nums[i];

                if (sum > max){
                    max = sum;
                }
                
                if (sum < 0){
                    sum = 0;
                }

                

                i++;
            }
        

        return max;
    }
}