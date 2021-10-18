//Jimmy Zhang LeetCode Problem 1. TwoSum 10/12/2021
// Add a what did you learn section

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){

    }
    // My attempt, incorrect!
    public static int[] twoSum1(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            };
        };
        return index;
    }

    //Solution with the fastest Runtime
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j-i] == target)  {
                    return new int[]{j, j-i};
                }
            }
        }

        return null;
    }

    // Most Effective solution with lower time complexitiy

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }


    /*
    - I did not know how to return a value with nothing, now I know to use return null
    - Today I learned that you can set j = i and use i as a a dependent factor. By relying on i, you
    can get i values before or after.

     */
}
