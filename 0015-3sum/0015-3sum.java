class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        int sum = 0;
        int temp = 0;

        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                sum = -(nums[i] + nums[j]);

                if (map.containsKey(sum)){
                    temp = map.get(sum);
                    if (temp!= i && temp!=j){
                    List <Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[temp]);

                    Collections.sort(li);
                    set.add(li);
                    }

                }
            }
        }

        return new ArrayList<>(set);
    }
}