import java.util.HashMap;
public class LongestOnes {
    public static void main(String[] args) {
        LongestOnes longestOnes = new LongestOnes();
        int[] nums = {1,1,0,0,1,1,1,0,0,1};
        int k = 2;
        System.out.println(longestOnes.longestOnes(nums, k));
    }
    public int longestOnes(int[] nums, int k) {
        int low = 0, high = 0, n = nums.length, result = 0, maxFreq = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        while(high < n){
            freq.put(nums[high], freq.getOrDefault(nums[high], 0) + 1);
            if(nums[high] == 1)
                maxFreq = Math.max(maxFreq, freq.get(nums[high]));
            while((high - low + 1) - maxFreq > k){
                freq.put(nums[low], freq.get(nums[low]) - 1);
                low++;
            }
            result = Math.max(result, high - low + 1);
            high++;
        }
        return result;
    }
}
