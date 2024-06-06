class Solution {
    public int reversePairs(int[] nums) {

        // ArrayList<Integer> al = new ArrayList<Integer>();
        
        // int temp = 0;
        // long temp2 = 0;
        // int count = 0;
        
        // for (int i = 0; i < nums.length-1; i++){
        //     for (int j = i+1; j< nums.length; j++){
        //         // temp = nums[i];
        //         // temp2 = nums[j] * 2;
        //         if ((long)nums[i]> (long)2 * nums[j]){
        //             count++;
        //         }

        //     }
        // }

        // return count;

        int count = sort(nums, 0 , (nums.length-1));

        return count;

    }

    public static int countpairs(int[] arr, int i, int mid, int j){
        
        int lp = 0;
        int rp = mid + 1;
        int count = 0;

        for (int k = i; k<= mid; k++){
            while(rp<=j && (long)arr[k]>2*(long)arr[rp]){
                rp++;
            }
            count = count + (rp - (mid + 1));
        }

        return count;
    }

    public static int sort(int arr[], int i, int j) {
        int count = 0;
        
        if (i >= j) {
            return count;
        }

        int mid = (i + j) / 2;

        count += sort(arr, i, mid);
        count += sort(arr, (mid + 1), j);
        count += countpairs(arr, i, mid, j);
        merge(arr, i, mid, j);
        return count;

    }

    public static void merge(int arr[], int i, int mid, int j) {
        int[] temparr = new int[j - i + 1];
        int left = i;
        int right = mid + 1;
        int temp = 0;

        while (left <= mid && right <= j) {
            if (arr[left] <= arr[right]) {
                temparr[temp] = arr[left];
                left++;
            } else {
                temparr[temp] = arr[right];
                right++;
            }
            temp++;
        }

        while (left <= mid) {
            temparr[temp] = arr[left];
            left++;
            temp++;
        }

        while (right <= j) {
            temparr[temp] = arr[right];
            right++;
            temp++;
        }

        // Copy the sorted elements back to the original array
        for (int k = 0; k < temparr.length; k++) {
            arr[i + k] = temparr[k];
        }

    }
}