package Extras;

import java.util.Arrays;

public class maxFrequencyAfterKOperations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;
        maxFrequencyAfterKOperations mf = new maxFrequencyAfterKOperations();
        int result = mf.maxFrequency(nums, k);
        System.out.println(result);
    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, result = 1;
        long sumOfSlidingWindow = nums[0];
        for(int j = 1; j < nums.length; j++){
            sumOfSlidingWindow += nums[j];
            long max = nums[j];
            while(sumOfSlidingWindow + k < max * (j - i + 1)){
                sumOfSlidingWindow -= nums[i];
                i++;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
