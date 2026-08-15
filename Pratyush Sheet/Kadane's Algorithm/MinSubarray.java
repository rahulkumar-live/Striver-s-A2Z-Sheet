public class MinSubarray {
    public static void main(String[] args) {
        MinSubarray solution = new MinSubarray();
        int[] nums = {3, -4, 2, -3, -1, 7, -5};
        System.out.println(solution.minSubArray(nums));
    }
    public int minSubArray(int[] nums) {
        int result = nums[0], sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.min(sum + nums[i], nums[i]);
            result = Math.min(result, sum);
        }
        return result;
    }
}
