public class removeDuplicatesInArray {
    
    public static void main(String[] args) {
        removeDuplicatesInArray obj = new removeDuplicatesInArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = obj.removeDuplicate(nums);
        System.out.println(result); // Output: 5
    }

    public int removeDuplicate(int[] nums) {
        if(nums.length < 2)
            return nums.length;
        int left = 2, right = nums.length - 1, result = 2;
        while(left <= right){
            if(nums[left] != nums[result - 2]){
                nums[result] = nums[left];
                result++;
            }
            left++;
        }
        return result;
    }
}
