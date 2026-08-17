public class MaxAbsoluteSum {
    public static void main(String[] args) {
        MaxAbsoluteSum obj = new MaxAbsoluteSum();
        int[] arr = {1, -3, 2, 3, -4};
        System.out.println(obj.maxAbsoluteSum(arr));
    }
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0], minSum = nums[0], currMax = nums[0], currMin = nums[0];
        for(int i = 1; i < nums.length; i++){
            currMax = Math.max(nums[i] + currMax, nums[i]);
            currMin = Math.min(nums[i] + currMin, nums[i]);
            maxSum = Math.max(maxSum, currMax);
            minSum = Math.min(minSum, currMin);
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}