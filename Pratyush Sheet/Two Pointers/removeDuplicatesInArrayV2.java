public class removeDuplicatesInArrayV2 {
    public static void main(String[] args) {
        removeDuplicatesInArrayV2 obj = new removeDuplicatesInArrayV2();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = obj.removeDuplicate(nums);
        System.out.println(result); // Output: 5
    }

    public int removeDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1, result = 0, count = 0;
        while(left < right){
            if(nums[left] == nums[left + 1]){
                left++;
                count++;
            }
            else if(nums[left] < nums[left + 1] && count > 1){
                nums[result + 1] = nums[left + 1];
                result++;
                left++;
                count = 0;
            }
        }
        return result  + 1;
    }

}
