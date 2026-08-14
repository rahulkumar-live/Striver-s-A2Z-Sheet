import java.util.HashMap;
public class CheckInclusion {
    public static void main(String[] args) {
        CheckInclusion checkInclusion = new CheckInclusion();
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion.checkInclusion(s1, s2));
    }
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++)
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
        int low = 0, high = 0, n = s2.length();
        while(high < n){
            s2Map.put(s2.charAt(high), s2Map.getOrDefault(s2.charAt(high),0) + 1);
            if(high - low + 1 > s1.length()){
                s2Map.put(s2.charAt(low), s2Map.getOrDefault(s2.charAt(low),0) - 1);
                if(s2Map.get(s2.charAt(low)) == 0)
                    s2Map.remove(s2.charAt(low));
                low++;
            }
            if(s1Map.equals(s2Map))
                return true;
            high++;
        }
        return false;
    }
}
