public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        DutchNationalFlagProblem dnf = new DutchNationalFlagProblem();
        dnf.sortColors(arr);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high--);
                    break;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
