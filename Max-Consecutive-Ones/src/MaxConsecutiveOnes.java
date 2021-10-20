public class MaxConsecutiveOnes {
    public static void main(String[] args) {
//        findMaxConsecutiveOnes1(new int[]{1,1,1,0,0,0,1,1,1,1,1,0,1,1});
//        findMaxConsecutiveOnes2(new int[]{1,1,1,0,0,0,1,1,1,1,1,0,1,1});
//        findMaxConsecutiveOnes3(new int[]{1,1,1,0,0,0,1,1,1,1,1,0,1,1});
        findMaxConsecutiveOnes4(new int[]{1,1,1,0,0,0,1,1,1,1,1,0,1,1});

    }

    //My solution
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
    // Best
    public static int findMaxConsecutiveOnes2(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums) {
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
            System.out.println(n + "  " + maxHere );
        }
        return max;
    }

    //Use of Math.max
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
    // clever Solution without If statements
    public static int findMaxConsecutiveOnes4(int[] nums) {
        int maxSum = 0, sum = 0;
        for (int n : nums) {
            sum *= n;
            sum += n;
            System.out.println(sum);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
