public class rotateArrayFromStart {
    public static void main(String[] args) {
        rotateArrayFromStart obj = new rotateArrayFromStart();
        int[] nums = {1,2,3,4,5,6,7};
        int d = 3;
        obj.rotateArr(nums, d);
        for(int num : nums){
            System.out.print(num + " "); // Output: 4 5 6 7 1 2 3
        }
    }
    public void rotateArr(int arr[], int d) {
        // code here
        d = d % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - d);
        reverse(arr, arr.length - d, arr.length - 1);
    }
    static void reverse(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
