public class ShortestUnsortedArray {
    public static void main(String[] args) {
        ShortestUnsortedArray obj = new ShortestUnsortedArray();
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int result = obj.findUnsortedSubarray(nums);
        System.out.println(result); // Output: 5
    }
    public int findUnsortedSubarray(int[] nums) {
        int left = 0, right = nums.length - 1, s = 0, e = nums.length - 1;
        while(left < nums.length - 1){
            if(nums[left + 1] < nums[left]){
                s = left;
                left = 0;
                break;
            }
            left++;
        }
        while(right > 0){
            if(nums[right] < nums[right - 1]){
                e = right;
                right = nums.length - 1;
                break;
            }
            right--;
        }
        int start = s, end = e, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while(start <= end){
            min = Math.min(min, nums[start]);
            max = Math.max(max, nums[start]);
            start++;
        }
        while(left <= s){
            if(min < nums[left]){
                start = left;
                break;
            }
            left++;
        }
        while(right >= e){
            if(max > nums[right]){
                end = right;
                break;
            }
            right--;
        }
        return end - start + 1;
    }   
}
