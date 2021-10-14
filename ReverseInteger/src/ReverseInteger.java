public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(9878687));
    }
    public static int reverse(int x) {
        int topLimit = Integer.MAX_VALUE/10;
        int bottomLimit = Integer.MIN_VALUE/10;
        int reverse = 0;
        while(x != 0){
            if(reverse < bottomLimit || reverse > topLimit) return 0;
            reverse = reverse * 10 + x%10;
            x = x/10;
        }
        return reverse;
    }
}
