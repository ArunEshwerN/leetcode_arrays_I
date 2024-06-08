class Solution {
    public int longestConsecutive(int[] nums) {

        // Optimal
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        int longest = 0;

        for (int i : set){
            if (set.contains(i-1)){
                continue;
            }
            else{
                int count = 1;
                while (set.contains(i+1)){
                    i++;
                    count++;
                }
                longest  = Math.max(longest, count);
            }
        }

        return longest;



    }
}