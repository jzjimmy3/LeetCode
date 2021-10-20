public class evenDigits {
    public static void main(String[] args) {
    }
    // mySolutions
    public static int findNumbers1(int[] nums) {
        int evenDigits = 0;
        for(int elem : nums){
            int counter = 0;
            if (elem == 0) evenDigits = 1;
            while(elem > 0){
                elem /= 10;
                counter++;
            }
            if(counter % 2 == 0){
                evenDigits++;
            }
        }
        return evenDigits;
    }
    // Good use of Math
    public static int findNumbers2(int[] nums) {
        int count=0;
        for (int num : nums) {
            if (Math.floor(Math.log10(num) % 2) != 0)
                count++;
        }
        return count;
    }
    // Considered Constraints, best solution!
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i =0 ; i< nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        return count;
    }
}
