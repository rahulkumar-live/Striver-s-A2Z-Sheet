public class MaxSubarraySum {

    public static int maxSubArray(int[] nums,int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        int windowSum = sum;
        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i]-nums[i-k];
            sum = Math.max(sum,windowSum);
        }        
        return sum;
    }
}
