class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Brute My Own Intuition
        // int index = 0;

        // for (int i = m; i<(m+n); i++){

        //     if (index == n){
        //         break;
        //     }
            
        //     if (nums2[index] == 0){
        //         index++;
        //         continue;
        //     }

        //     else{
        //     nums1[i] = nums2[index];
        //     index++;
        //     }
        // }

        // Arrays.sort(nums1);

        //Optimal
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p2>=0){
            if (p1 >= 0 && nums1[p1]>nums2[p2]){
                nums1[p3--] = nums1[p1--];
            }
            else{
                nums1[p3--] = nums2[p2--];
            }
        }



    }
}