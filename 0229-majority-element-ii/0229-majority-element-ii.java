class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int count = 1;
        // List<Integer> al = new ArrayList<>();
        // int temp = 0;

        // for (int i = 0; i<nums.length; i++){
            
        //     temp = nums[i];
        //     count = 1;
            
        //     for (int j = i+1; j<nums.length; j++){
                
                

        //         if (nums[j] == temp){
        //             count++;
        //         }

        //     }
            
        //     if (count>(nums.length/3)&& !al.contains(temp)){
        //         al.add(temp);
        //     }
            
        // }

        // // if (nums.length == 1){
        // //     al.add(nums[0]);
        // // }
        // return al;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        int min = ((nums.length)/3) + 1;

        for (int i = 0; i< nums.length; i++){
            int key = nums[i];
            int freq = 0;
            

            if (map.containsKey(key)){

                freq = map.get(key);
                map.put(key, freq+1);

                if ((freq+1) == min && !al.contains(key)){
                // temp = key;
                al.add(key);
                }
            }
            else{
                
                map.put(key, freq+1);
                if ((freq+1) == min && !al.contains(key)){
                // temp = key;
                al.add(key);
                }
                
            }
                
        }
        // int temp = 0;
        // for (Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     int key = entry.getKey();
        //     int value = entry.getValue();
        //     if (map.get(key)>((nums.length)/3)&&!al.contains(key)){
        //         temp = key;
        //         al.add(temp);
        //     }
        // }

        return al;
    }
}