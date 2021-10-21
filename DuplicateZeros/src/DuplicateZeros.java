import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{1,0,2,3,0,4,5,0})));
    }

    //my Solution
    public static int[] duplicateZeros1(int[] arr){
        //input: [1,0,2,3,0,4,5,0]
        //Output: [1,0,0,2,3,0,0,4]
        for (int i = arr.length - 1; i > 0; i--){
            if(arr[i] == 0){
                for (int j = arr.length -1; j > i; j--){
                    arr[j] = arr[j-1];
                }
            }
        }
        return arr;
    }

    // Two Pointers
    public static int[] duplicateZeros2(int[] arr) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZero++;
        }
        int len = arr.length + countZero;
        //We just need O(1) space if we scan from back
        //i point to the original array, j point to the new location
        for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
            //{1,0,2,3,0,4,5,0} _ _ _
            //         1   2

            //{1,0,2,3,0,
            if (arr[i] != 0) {
                if (j < arr.length){
                    System.out.println(j + " " + i);
                    arr[j] = arr[i];
                    System.out.print("Array1: ");
                    System.out.println(Arrays.toString(arr));
                }
            } else {
                if (j < arr.length) {
                    System.out.println(j + " " + i);
                    arr[j] = arr[i];
                    System.out.print("Array2: ");
                    System.out.println(Arrays.toString(arr));
                }
                j--;
                if (j < arr.length) {
                    System.out.println(j + " " + i);
                    arr[j] = arr[i]; //copy twice when hit '0'
                    System.out.print("Array3: ");
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}
