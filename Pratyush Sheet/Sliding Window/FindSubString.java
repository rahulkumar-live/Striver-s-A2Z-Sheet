import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FindSubString {
    public static void main(String[] args) {
        FindSubString findSubString = new FindSubString();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(findSubString.findSubstring(s, words));
    }
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLength = words[0].length(), wordCount = words.length;
        HashMap<String, Integer> wordMap = new HashMap<>();
        for(int i = 0; i < words.length; i++)
            wordMap.put(words[i], wordMap.getOrDefault(words[i], 0) + 1);
        List<Integer> result = new ArrayList<>();
        if (s.length() < (wordLength * wordCount))
            return result;
        for(int i = 0; i < wordLength; i++){
            int low = i, high = i, count = 0;
            HashMap<String, Integer> sMap = new HashMap<>();
            while((high + wordLength) <= s.length()){
                String highWord = s.substring(high, high + wordLength);
                if(!wordMap.containsKey(highWord)){
                    sMap.clear();
                    count = 0;
                    low = high + wordLength;
                    high += wordLength;
                    continue;
                }
                sMap.put(highWord, sMap.getOrDefault(highWord, 0) + 1);
                count++;
                while(sMap.get(highWord) > wordMap.get(highWord)){
                    String lowWord = s.substring(low, low + wordLength);
                    sMap.put(lowWord, sMap.get(lowWord) - 1);
                    low += wordLength;
                    count--;
                }
                if(count == wordCount){
                    result.add(low);
                    String lowWord = s.substring(low, low + wordLength);
                    sMap.put(lowWord, sMap.get(lowWord) - 1);
                    low += wordLength;
                    count--;
                }
                high += wordLength;
            }
        }
        return result;
    }
}
