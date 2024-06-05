class Solution {
    public int majorityElement(int[] nums) {
        
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i<nums.length; i++){
        //     if (nums[i]>max){
        //         max = nums[i];
        //     }
        // }

        // for (int i = 0; i<nums.length; i++){
        //     if (nums[i]<min){
        //         min = nums[i];
        //     }
        // }

        // int size = Math.max(max, nums.length);

        // int[] hasharr = new int[size+1];

        // for (int i = 0; i < nums.length; i++){
        //     int temp = nums[i];
        //     hasharr[temp] = hasharr[temp] + 1;
        // }

        // int temp = 0;

        // for (int i = 1; i< hasharr.length; i++){
        //     if (hasharr[i]>(nums.length/2)){
        //         temp = i;
        //     }
        // }

        // return temp;

        //Striver's almost inspired Brute Force
        // int count = 1;
        // int temp = 0;

        // for (int i = 0; i<nums.length-1; i++){
        //     for (int j = 1; j<nums.length; j++){
                
        //         temp = nums[i];

        //         if (nums[j] == temp){
        //             count++;
        //         }

        //     }
        //     if (count>(nums.length/2)){
        //         break;
        //     }
        //     count = 1;
        // }

        // if (nums.length == 1){
        //     temp = nums[0];
        // }
        // return temp;

        //Striver Better Solution
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i< nums.length; i++){
        //     int key = nums[i];
        //     int freq = 0;
        //     if (map.containsKey(key)){
        //         freq = map.get(key);
        //         map.put(key, freq+1);
        //     }
        //     else{
                
        //         map.put(key, freq+1);
                
        //     }
            
        // }
        // int temp = 0;
        // for (Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     int key = entry.getKey();
        //     int value = entry.getValue();
        //     if (map.get(key)>((nums.length)/2)){
        //         temp = key;
        //     }
        // }

        // return temp;

        //Striver's Optimal - Moore's Voting Algo
        //Own Try - Has Fallacies

        // int el = 0;
        // int count = 0;
        // int index = 0;
        // int i = 0;
        // int j = 1;

        // while(index<nums.length && j<nums.length){
        //     el = nums[i];
        //     count++;
            
        //     if (nums[j] == el){
        //         count++;
        //     }
        //     j++;
        //     else{
        //         count--;
        //     }

        //     // if (nums[j] == el){
        //     //     count++;
        //     // }
        //     // else{
        //     //     count--;
        //     // }
        //     if (count == 0){
        //         i++;
        //     }
        //     index++;

        // }
        // int count2 = 0;
        // for (int i = 0; i<nums.length; i++){
        //     if (nums[i] == el){
        //         count2++;
        //     }
        // }

        // if (count2>((nums.length)/2)){
        //     return el;
        // }

        // return 0;

        //Striver's Most Optimal
        // Learnt 

        int el = 0;
        int count = 0;

        for (int i = 0; i< nums.length; i++){
            if (count == 0){
                el = nums[i];
                count++;
            }
            else{
                if (nums[i] == el){
                    count++;
                }
                else{
                    count--;
                }
            }
        }

        int count2 = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == el){
                count2++;
            }
        }

        if (count2>((nums.length)/2)){
            return el;
        }

        return 0;

        
    }
}