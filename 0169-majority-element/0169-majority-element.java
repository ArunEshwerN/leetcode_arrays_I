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
        int count = 1;
        int temp = 0;

        for (int i = 0; i<nums.length-1; i++){
            for (int j = 1; j<nums.length; j++){
                
                temp = nums[i];

                if (nums[j] == temp){
                    count++;
                }

            }
            if (count>(nums.length/2)){
                break;
            }
            count = 1;
        }

        if (nums.length == 1){
            temp = nums[0];
        }
        return temp;
    }
}