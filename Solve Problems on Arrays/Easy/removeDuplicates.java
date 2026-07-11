public class removeDuplicates {
    public static void main(String[] args) {
        removeDuplicates obj = new removeDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = obj.removeDuplicates(nums);
        System.out.println(result); // Output: 5
    }
    public int removeDuplicates(int[] nums) {
        int right = 0, left = nums.length - 1, result = 0;
        while(right < left){
            if(nums[right] == nums[right + 1]){
                right++;
            }
            else if(nums[right] < nums[right + 1]){
                nums[result + 1] = nums[right + 1];
                result++;
                right++;
            }
        }
        return result  + 1;
    }
}
