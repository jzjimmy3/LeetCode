import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }
    public static int[] shuffle(int[] nums, int n){
        int[] newArray = new int[nums.length];
        for(int i = 0; i < n; i++){
            newArray[2 * i] = nums[i];
            newArray[2 * i + 1] = nums[i+n];
        }
        return newArray;
    }
}
