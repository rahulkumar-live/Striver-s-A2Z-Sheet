import java.util.HashMap;
public class CharacterReplacement {
    public static void main(String[] args) {
        CharacterReplacement characterReplacement = new CharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement.characterReplacement(s, k));
    }
    public int characterReplacement(String s, int k){
        int low = 0, high = 0, n = s.length(), result = 0, maxFreq = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        while(high < n){
            charMap.put(s.charAt(high), charMap.getOrDefault(s.charAt(high), 0) + 1);
            maxFreq = Math.max(maxFreq, charMap.get(s.charAt(high)));
            while((high - low + 1) - maxFreq > k){
                charMap.put(s.charAt(low), charMap.get(s.charAt(low)) - 1);
                low++;
            }
            result = Math.max(result, high - low + 1);
            high++;
        }
        return result;
    }
}
