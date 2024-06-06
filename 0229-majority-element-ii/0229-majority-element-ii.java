class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int count = 1;
        List<Integer> al = new ArrayList<>();
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

        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> al = new ArrayList<>();
        // int min = ((nums.length)/3) + 1;

        // for (int i = 0; i< nums.length; i++){
        //     int key = nums[i];
        //     int freq = 0;
            

        //     if (map.containsKey(key)){

        //         freq = map.get(key);
        //         map.put(key, freq+1);

        //         if ((freq+1) == min && !al.contains(key)){
        //         // temp = key;
        //         al.add(key);
        //         }
        //     }
        //     else{
                
        //         map.put(key, freq+1);
        //         if ((freq+1) == min && !al.contains(key)){
        //         // temp = key;
        //         al.add(key);
        //         }
                
        //     }
                
        // }
        // int temp = 0;
        // for (Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     int key = entry.getKey();
        //     int value = entry.getValue();
        //     if (map.get(key)>((nums.length)/3)&&!al.contains(key)){
        //         temp = key;
        //         al.add(temp);
        //     }
        // }

        //Optimal
        int c1 = 0;
        int c2 = 0;
        int e1 = 0;
        int e2 = 0;

        for (int i = 0; i< nums.length; i++){

            if (c1 == 0 && nums[i] != e2){
                e1 = nums[i];
                c1++;
            }

            else if (c2 == 0 && nums[i] != e1){
                e2 = nums[i];
                c2++;
            }

            else if (nums[i] == e1){
                c1++;
            }

            else if (nums[i] == e2){
                c2++;
            }

            else{
                c1--;
                c2--;
            }
        }

        int c3 = 0;
        int c4 = 0;

        int min = ((nums.length)/3) + 1;

        for (int i = 0; i<nums.length; i++){
            if(nums[i]== e1){
                c3++;
            }
            else if(nums[i] == e2){
                c4++;
            }
        }
        if (c3 >= min){
            al.add(e1);
        }
        if (c4 >= min){
            al.add(e2);
        }



        return al;
    }
}