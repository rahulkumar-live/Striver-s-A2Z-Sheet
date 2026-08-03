public class subarrayProductLessThanK {

    public static void main(String[] args) {
        int[] nums = {686, 28, 455, 675, 605, 29, 942, 48, 502, 889, 854, 206, 231, 796, 272, 565, 887, 969, 558, 13, 22, 455, 145, 804, 15};
        int k = 515854;
        subarrayProductLessThanK sp = new subarrayProductLessThanK();
        int result = sp.numSubarrayProductLessThanK(nums, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + result);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k){
        int count = 0;
        int product = 1;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            product *= nums[right];

            while(product >= k && left <= right){
                product /= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}
