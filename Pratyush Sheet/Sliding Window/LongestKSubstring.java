import java.util.HashMap;
import java.util.Map;

public class LongestKSubstring {
    public static void main(String[] args) {
        LongestKSubstring longestKSubstring = new LongestKSubstring();
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstring.longestKSubstr(s, k));
    }
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character, Integer> charMap = new HashMap<>();
        int low = 0, high = 0, n = s.length(), result = -1;
        while(high < n){
            charMap.put(s.charAt(high), charMap.getOrDefault(s.charAt(high), 0) + 1);
            while(charMap.size() > k){
                charMap.put(s.charAt(low), charMap.get(s.charAt(low)) - 1);
                if (charMap.get(s.charAt(low)) == 0)
                    charMap.remove(s.charAt(low));
                low++;
            }
            if(charMap.size() == k)
                result = Math.max(result, high - low + 1);
            high++;
        }
        return result;
    }
}
