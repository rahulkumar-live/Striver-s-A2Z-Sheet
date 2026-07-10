class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        CheckIfArrayIsSortedAndRotated obj = new CheckIfArrayIsSortedAndRotated();
        int[] nums = {3, 4, 5, 1, 2};
        boolean result = obj.check(nums);
        System.out.println(result); // Output: true
    }
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i + 1) % nums.length])
                count++;
        }   
        return (count <= 1);
    }
}