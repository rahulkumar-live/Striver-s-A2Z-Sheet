import java.util.HashMap;
import java.util.Map;
public class MinWindow {
    public static void main(String[] args) {
        MinWindow minWindow = new MinWindow();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow.minWindow(s, t));
    }
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++)
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        int low = 0, high = 0, n = s.length(), res = Integer.MAX_VALUE, start = 0;
        while(high < n){
            sMap.put(s.charAt(high), sMap.getOrDefault(s.charAt(high), 0) + 1);
            while(isSubString(sMap, tMap)){
                int len = high - low + 1;
                if(res > len){
                    res = len;
                    start = low;
                }
                sMap.put(s.charAt(low), sMap.get(s.charAt(low)) - 1);
                if(sMap.get(s.charAt(low)) == 0)
                    sMap.remove(s.charAt(low));
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }
     public boolean isSubString(HashMap<Character, Integer> sMap, HashMap<Character, Integer> tMap) {
        for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            char ch = entry.getKey();
            int required = entry.getValue();
            if (!sMap.containsKey(ch) || sMap.get(ch) < required)
                return false;
        }
        return true;
    }
}
