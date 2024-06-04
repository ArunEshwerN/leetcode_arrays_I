class Solution {
    public void sortColors(int[] nums) {
        
        int length = nums.length;
        int mid = 0;
        int high = length - 1;
        int low = 0;
        // int index = 0;

        while (high>=mid){

            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }   

            else if (nums[mid] == 1){
                mid++;
            }

            else if (nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
        
    }
}