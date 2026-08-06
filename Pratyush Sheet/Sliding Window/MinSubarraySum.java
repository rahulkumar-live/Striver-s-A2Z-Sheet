public class MinSubarraySum {
    public static void main(String[] args) {
        MinSubarraySum minSubarraySum = new MinSubarraySum();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubarraySum.minSubArrayLen(target, nums));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0, n = nums.length, sum = 0, result = Integer.MAX_VALUE;
        while(high < n){
            sum += nums[high];
            while(sum >= target){
                int len = high - low + 1;
                result = Math.min(len, result);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return result == Integer.MAX_VALUE? 0: result;
    }
}
