public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr) {
        // code here
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
