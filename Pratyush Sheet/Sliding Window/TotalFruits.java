import java.util.HashMap;
import java.util.Map;
public class TotalFruits {
    public static void main(String[] args) {
        TotalFruits totalFruits = new TotalFruits();
        int[] fruits = {1, 2, 1};
        System.out.println(totalFruits.totalFruit(fruits));
    }
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> fruitMap = new HashMap<>();
        int low = 0, high = 0, n = fruits.length, result = 0;
        while(high < n){
            fruitMap.put(fruits[high], fruitMap.getOrDefault(fruits[high], 0) + 1);
            while(fruitMap.size() > 2){
                fruitMap.put(fruits[low], fruitMap.getOrDefault(fruits[low], 0) - 1);
                if(fruitMap.get(fruits[low]) == 0)
                    fruitMap.remove(fruits[low]);
                low++;
            }
            if(fruitMap.size() <= 2)
                result = Math.max(result, high - low + 1);
            high++;
        }
        return result;
    }
}
