import java.util.HashSet;
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int low = 0, high = 0, n = s.length(), result = 0;
        while(high < n){
            while(hs.contains(s.charAt(high))){
                hs.remove(s.charAt(low));
                low++;
            }
            hs.add(s.charAt(high));
            result = Math.max(result, high - low + 1);
            high++;
        }
        return result;
    }
}
