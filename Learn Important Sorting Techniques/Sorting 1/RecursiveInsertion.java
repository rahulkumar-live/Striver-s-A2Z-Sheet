public class RecursiveInsertion {
    public static void main(String[] args) {
        int[] nums = {5, 4, 4, 1, 1};
        RecursiveInsertion ri = new RecursiveInsertion();
        int[] sorted = ri.insertionSort(nums);
        System.out.println("Sorted array: " + java.util.Arrays.toString(sorted));   
    }    
    public int[] insertionSort(int[] nums) {
        return sort(nums, nums.length);
    }
    public int[] sort(int[] nums, int right){
        if(right == 1)
            return nums;
        sort(nums, right - 1);
        int end = nums[right - 1];
        int j = right - 2;
        while(j >= 0 && nums[j] > end){
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = end;
        return nums;
    }
}