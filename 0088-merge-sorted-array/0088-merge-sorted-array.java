class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = 0;

        for (int i = m; i<(m+n); i++){

            if (index == n){
                break;
            }
            
            if (nums2[index] == 0){
                index++;
                continue;
            }

            else{
            nums1[i] = nums2[index];
            index++;
            }
        }

        Arrays.sort(nums1);



    }
}