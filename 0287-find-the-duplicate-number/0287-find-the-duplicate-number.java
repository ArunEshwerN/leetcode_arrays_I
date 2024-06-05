class Solution {
    public int findDuplicate(int[] nums) {
        
        // Brute Force
        // int index = -1 ;

        // for (int i = 0; i<nums.length; i++){
        //     for (int j = i + 1; j< nums.length;j++){
        //         int temp = nums[i];
        //         if(nums[j] == temp ){
        //             index = nums[j];
        //             break;
        //         }
        //     }
        // }

        //Optimal Approach

        // int i = 0;
        // int j = 1;
        // int index = -1;
        // int length = nums.length;

        // while(i<(length-1)){

        //     // j = i + 1;

        //     if(j>=length){
        //         i++;
        //         j = i + 1;
        //     }

        //     if (i<(length-1) && j<length){
        //         int temp = nums[i];

        //         if (nums[j] == temp){
        //             index = nums[j];
        //             break;
        //         }
        //         else{
        //             j++;
        //         }
        //     }

        //     else{
        //         break;
        //     }

        
        // }

        // return index;

        //Actual Optimal
        int start = nums[0];
        int fin = nums[0];

        do{
            start = nums[start];
            fin = nums[nums[fin]];
        }while(start != fin);

        fin = nums[0];

        while(start != fin){
            start = nums[start];
            fin = nums[fin];
        }

        return fin;


    }
}