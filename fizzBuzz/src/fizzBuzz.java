import java.util.*;
import java.lang.String;
public class fizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(3));

    }
    public static List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<String>();
        for (int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) array.add("FizzBuzz");
            else if(i % 3 == 0) array.add("Fizz");
            else if(i % 5 == 0) array.add("Buzz");
            else array.add(String.valueOf(i));
        }
        return array;
    }
}
