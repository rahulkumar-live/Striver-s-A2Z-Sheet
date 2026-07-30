import java.util.Arrays;
public class CountTripletsLessThanTarget {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};
        int sum = 12;
        CountTripletsLessThanTarget c = new CountTripletsLessThanTarget();
        int result = c.countTriplets(sum, arr);
        System.out.println("Count of triplets: " + result);
    }
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i < arr.length - 2; i++){
            int left = i + 1, right = arr.length - 1;
            while(left < right){
                int total = arr[i] + arr[left] + arr[right];
                if(total < sum){
                    result = result + (right - left);
                    left++;
                }
                else
                    right--;
            }
        }
        return result;
    }
}
