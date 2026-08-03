class findDuplicates {
    public static void main(String[] args) {
        findDuplicates obj = new findDuplicates();
        int[] nums = {1,3,4,2,2};
        System.out.println(obj.findDuplicate(nums));
    }
    public int findDuplicate(int[] nums) {
        int result = nums[0], slow = nums[0], fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                while(result != slow){
                    result = nums[result];
                    slow = nums[slow];
                }
                return slow;
            }
        }
    }    
}
