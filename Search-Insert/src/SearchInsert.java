public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,2,3,4,5,6,7,8,9},7));
    }
    public static int searchInsert(int[] nums, int target){
        // input[1,2,3,4,5,6,7,8,9] Target 7
        // output: Integer, index
        int min = 0; //index values
        int max = nums.length - 1; // index values

        while(max >= min){
            int mid = (min + max)/2;
            if(target < nums[mid]){
                max = mid - 1;
            }
            else if (target > nums[mid]){
                min = mid + 1;
            }
            else{
                return mid;
            }
        }
        return min;
    }
}
