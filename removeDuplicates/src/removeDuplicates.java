import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{5,5,10,10,10,20,20,30,30,40}));
    }
    public static int removeDuplicates(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(i != nums.length-1 && nums[i] == nums[i+1]) continue;
            nums[count] = nums[i];
            count++;
        }
        for(int j = count; j < nums.length;j++){
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
