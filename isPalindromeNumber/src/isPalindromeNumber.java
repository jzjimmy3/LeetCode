public class isPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        //By taking into account certain conditions, the integer does not have tto go through the loop later on.
        if (x<0 || (x!=0 && x%10==0)) return false;
        // input: int x --> 121 321
        // output boolean: true if palindrome

        // convert number to a string, stringX
        // reverse the string x, ReverseX
        // write a forloop, start at stringX.length-1; i--
        // set reverseX += to.
        // if ReverseX = 121.. TRUE!

        String stringX = String.valueOf(x);
        String reverseX = "";

        for(int i = stringX.length()-1; i >= 0; i--){
            char element = stringX.charAt(i);
            reverseX += element;
        }

        if(stringX.equals(reverseX)){
            return true;
        }
        return false;
    }
}
