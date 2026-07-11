public class rotateArray {
    public static void main(String[] args) {
        rotateArray obj = new rotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        obj.rotate(nums, k);
        for(int num : nums){
            System.out.print(num + " "); // Output: 5 6 7 1 2 3 4
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
