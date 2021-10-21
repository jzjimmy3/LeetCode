public class sortedArray {
    public static void main(String[] args) {

    }
    // mySolution
    public static int[] sortedSquares1(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) Math.pow(nums[i],2);
        }
        boolean changed = true;
        do{
            changed = false;
            for(int j = 0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    changed = true;
                }
            }
        }while(changed);
        return nums;
    }
    //2 pointers method
    public int[] sortedSquares2(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
