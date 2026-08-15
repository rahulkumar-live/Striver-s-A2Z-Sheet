class MaximumSum {
    public static void main(String[] args) {
        MaximumSum obj = new MaximumSum();
        int[] arr = {1, -2, 0, 3};
        System.out.println(obj.maximumSum(arr));
    }
    public int maximumSum(int[] arr) {
        int result = arr[0], noDeleteSum = arr[0], oneDeleteSum = -1000000000;
        for(int i = 1; i < arr.length; i++){
            oneDeleteSum = Math.max(noDeleteSum, oneDeleteSum + arr[i]);
            noDeleteSum = Math.max(noDeleteSum + arr[i], arr[i]);
            result = Math.max(result, Math.max(noDeleteSum, oneDeleteSum));
        }
        return result;
    }
}