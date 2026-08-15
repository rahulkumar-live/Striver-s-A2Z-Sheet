public class MaxProduct {
    public static void main(String[] args) {
        MaxProduct solution = new MaxProduct();
        int[] nums = {2, 3, -2, 4};
        System.out.println(solution.maxProduct(nums));
    }
    public int maxProduct(int[] nums){
        int result = nums[0], maxProd = nums[0], minProd = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);
            result = Math.max(result, maxProd);
        }
        return result;
    }
}
