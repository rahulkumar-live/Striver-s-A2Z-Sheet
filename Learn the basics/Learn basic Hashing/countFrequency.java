import java.util.ArrayList;
import java.util.HashMap;

public class countFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        countFrequency cf = new countFrequency();
        ArrayList<Integer> result = cf.frequencyCount(arr);
        for (int count : result) {
            System.out.println(count);
        }
    }
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num : arr)
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            res.add(i, hash.getOrDefault(i+1, 0));
        }
        return res;
    }
}
