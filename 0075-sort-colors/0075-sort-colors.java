class Solution {
    public void sortColors(int[] nums) {
        
        int length = nums.length;

        for(int i = 0;i<(length-1);i++){
            for (int j = i; j<length;j++){
                if (nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
    }
}