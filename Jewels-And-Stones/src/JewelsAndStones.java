import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
//        System.out.println(numJewelsInStones1("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones2("aAcd", "aAAbbbb"));
//        System.out.println(numJewelsInStones3("aA", "aAAbbbb"));

    }
    public static int numJewelsInStones1(String jewels, String stones){
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static int numJewelsInStones2(String J, String S) {
        int counter = 0;
        Set setJ = new HashSet();
        System.out.println(setJ);
        for (char j: J.toCharArray())
            setJ.add(j);
        System.out.println("loop 1 " + setJ);
        for (char s: S.toCharArray())
            if (setJ.contains(s)){
                System.out.println("loop 2 " + setJ);
                counter++;
            }
        return counter;
    }
    public static int numJewelsInStones3(String J, String S) {
        int[] cnt = new int[128];
        for (char c : S.toCharArray())
            cnt[c]++;
        int ans = 0;
        for (char c : J.toCharArray())
            ans += cnt[c];
        return ans;
    }
}
