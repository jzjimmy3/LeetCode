public class MergedSortedArray {
    public static void main(String[] args) {

    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        //Inputs: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        //outputs:        [1,2,2,3,5,6]
        // 1) Create a forloop to insert nums2 into nums1
        //loop through every element from index m to nums1.length == m+n
        //insert nums1[i] = nums2[i-n]
        // 2) Sort nums1
        //loop through every element from 0 + m+n;
        //if current element is > next element, I want to switch places.
        // repeat until the entire loop is sorted.

        for(int i = m; i < m + n; i++){
            if(i<n){
                nums1[i] = nums2[i];
            }
            else {
                nums1[i] = nums2[i-n];
            };
        }
        boolean changed = true;
        do{
            changed = false;
            for (int j = 0; j < m + n - 1; j++){
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                    changed = true;
                }
            }
        }while(changed);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        //Inputs: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        //outputs:        [1,2,2,3,5,6]
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
    }
}
