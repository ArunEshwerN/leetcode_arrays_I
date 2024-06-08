class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i< nums.length; i++){
        //     map.put(nums[i], i);
        // }

        // int sum = 0;
        // int temp = 0;

        // for (int i = 0; i<nums.length; i++){
        //     for (int j = i+1; j<nums.length; j++){
        //         sum = -(nums[i] + nums[j]);

        //         if (map.containsKey(sum)){
        //             temp = map.get(sum);
        //             if (temp!= i && temp!=j){
        //             List <Integer> li = new ArrayList<>();
        //             li.add(nums[i]);
        //             li.add(nums[j]);
        //             li.add(nums[temp]);

        //             Collections.sort(li);
        //             set.add(li);
        //             }

        //         }
        //     }
        // }

        // return new ArrayList<>(set);

        //Optimal - Striver


        //1. Sort
        Arrays.sort(nums);

        //2. 
        int i = 0;
       

        while(i<(nums.length-2)){
            
        int j = i + 1;
        int k = nums.length - 1;
            
        while(j<k){

          if(nums[i] + nums[j] + nums[k] < 0){
            j++;
          }

          else if (nums[i]+ nums[j]+nums[k]>0){
            k--;
          }

          else{
            List<Integer> al = new ArrayList<>();
            al.add(nums[i]);
            al.add(nums[j]);
            al.add(nums[k]);

            set.add(al);

            int temp = nums[j];
            int temp2 = nums[k];

            while(nums[j] == temp && j<k){
                j++;
            }

            while(nums[k] == temp2 && j<k){
                k--;
            }

            
          }
                
        }

        int temp3 = nums[i];
        while(nums[i] == temp3 && i<nums.length-2){
            i++;
        }
        }

        




        return new ArrayList<>(set);

    }
}

