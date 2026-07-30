class TwoSumv2{
    public static void main(String[] args) {
        TwoSumv2 twoSumv2 = new TwoSumv2();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumv2.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target)
                return new int[]{left, right};
            else if (sum < target)
                left++;
            else
                right--;
        }
        return new int[]{-1, -1};
    }
}