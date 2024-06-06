class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ArrayList<Integer> al = new ArrayList<Integer>();

        // for (int i = 0; i<nums.length-1; i++){
        //     for (int j = i+1; j< nums.length; j++){
        //         if (nums[i]+nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        // return new int[]{0};

        //Better Solution

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int temp = 0;
        for (int i = 0; i< nums.length; i++){
            
            temp = target - nums[i];

            if (map.containsKey(temp)){
                int temp2 = map.get(temp);
                return new int[]{i, temp2};
            }

            else{
                map.put(nums[i], i);
            }
        }

        return new int[]{0};
    }
}