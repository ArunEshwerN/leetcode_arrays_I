class Solution {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int pb4 = -1;

        // Step 1: Find the pivot
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pb4 = i;
                break;
            }
        }

        // If no pivot is found, the array is in descending order
        if (pb4 == -1) {
            reverse(nums, 0, length - 1);
            return;
        }

        // Step 2: Find the smallest number greater than nums[pb4]
        int indexp = -1;
        for (int i = length - 1; i > pb4; i--) {
            if (nums[i] > nums[pb4]) {
                indexp = i;
                break;
            }
        }

        // Step 3: Swap nums[pb4] with nums[indexp]
        int temp = nums[pb4];
        nums[pb4] = nums[indexp];
        nums[indexp] = temp;

        // Step 4: Reverse the subarray from pb4 + 1 to the end
        reverse(nums, pb4 + 1, length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
