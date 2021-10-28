public class SumArray {
    public static void main(String[] args) {

    }
    public static int[] runningSum(int[] nums) {
        int[] sumNum = new int[nums.length];
        sumNum[0] = nums[0];
        for(int i = 1; i <= nums.length-1; i++){
            sumNum[i] = sumNum[i-1] + nums[i];
        }
        return sumNum;
    }
}
