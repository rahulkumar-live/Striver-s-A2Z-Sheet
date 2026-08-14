import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FindAnagrams {
    public static void main(String[] args) {
        FindAnagrams findAnagrams = new FindAnagrams();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams.findAnagrams(s, p));
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> pMap = new HashMap<>();
        for(int i = 0; i < p.length(); i++)
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        int low = 0, high = 0, n = s.length();
        List<Integer> result = new ArrayList<>();
        while(high < n){
            sMap.put(s.charAt(high), sMap.getOrDefault(s.charAt(high),0) + 1);
            if(high - low + 1 > p.length()){
                sMap.put(s.charAt(low), sMap.getOrDefault(s.charAt(low),0) - 1);
                if(sMap.get(s.charAt(low)) == 0)
                    sMap.remove(s.charAt(low));
                low++;
            }
            if(pMap.equals(sMap)){
                result.add(low);
            }
            high++;
        }
        return result;
    }    
}
