public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }
    public static int findMaxConsecutiveOnes1(int[] nums) {
        int max = 0;
        int counter = 0;
        for ( int i = 0; i < nums.length; i++){
            if(nums[i] == 1) counter++;
            else counter = 0;
            if(counter > max) max = counter;
        }
        return max;
    }

    public static int findMaxConsecutiveOnes2(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max;
    }

    public static int findMaxConsecutiveOnes3(int[] nums) {
        int result = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
            else count = 0;
        }

        return result;
    }

    public static int findMaxConsecutiveOnes4(int[] nums) {
        int maxSum = 0, sum = 0;
        for (int n : nums) {
            sum *= n;
            sum += n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
