import java.util.HashMap;

public class minMaxFrequency {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        minMaxFrequency mmf = new minMaxFrequency();
        int[] result = mmf.minMaxFreq(arr);
        System.out.println("Min Frequency: " + result[0]);
        System.out.println("Max Frequency: " + result[1]);
    }

    public int[] minMaxFreq(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num : arr)
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for (int freq : hash.values()) {
            minFreq = Math.min(minFreq, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        return new int[]{minFreq, maxFreq};
    }
}
