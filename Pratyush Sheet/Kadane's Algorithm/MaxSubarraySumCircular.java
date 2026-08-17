class MaxSubarraySumCircular {
    public static void main(String[] args) {
        MaxSubarraySumCircular solution = new MaxSubarraySumCircular();
        int[] nums = {1,-2,3,-2};
        System.out.println(solution.maxSubarraySumCircular(nums));
    }
    public int maxSubarraySumCircular(int nums[]){
        int maxSum = nums[0], minSum = nums[0], currMax = nums[0], currMin = nums[0], total = nums[0];
        for(int i = 1; i < nums.length; i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSum = Math.max(currMax, maxSum);
            currMin = Math.min(currMin + nums[i], nums[i]);
            minSum = Math.min(currMin, minSum);
            total = nums[i];
        }
        if(maxSum < 0)
            return maxSum;
        return Math.max(maxSum, total - minSum);
    }
}
