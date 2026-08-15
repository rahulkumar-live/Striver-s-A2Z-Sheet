public class MaxSubArraySum {
    public static void main(String[] args) {
        MaxSubArraySum solution = new MaxSubArraySum();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int result = nums[0], sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            result = Math.max(result, sum);
        }
        return result;
    }
}
