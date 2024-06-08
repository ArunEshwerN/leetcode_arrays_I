class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        int i = 0;

        

        while (i < nums.length-3){

            int j = i + 1;

            while (j < nums.length - 2){

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum < target){
                        k++;
                    }

                    else if (sum > target){
                        l--;
                    }

                    else{
                        List <Integer> li = new ArrayList <>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        li.add(nums[l]);

                        set.add(li);

                        // Move `k` to the next different element
                        int tempK = nums[k];
                        while (k < l && nums[k] == tempK) {
                            k++;
                        }

                        // Move `l` to the next different element
                        int tempL = nums[l];
                        while (k < l && nums[l] == tempL) {
                            l--;
                        }
                    }
                }

                int temp2 = nums[j];
                while (nums[j] == temp2 && j < nums.length - 2){
                    j++;
                }
            }

            int temp = nums[i];
            while (nums[i] == temp && i < nums.length-3){
                i++;
            }

        }

        return new ArrayList <>(set);
    }
}