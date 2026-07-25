import java.util.HashMap;
public class basic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        int[] queries = {1, 2, 5};
        int[] result = hashing(arr, queries);
        for (int count : result) {
            System.out.println(count);
        }
    }
    public static int[] hashing(int[] arr, int[] queries) {
        int m = queries.length;
        int[] result = new int[m];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            result[i] = frequencyMap.getOrDefault(queries[i], 0);
        }
        return result;
    }
}
