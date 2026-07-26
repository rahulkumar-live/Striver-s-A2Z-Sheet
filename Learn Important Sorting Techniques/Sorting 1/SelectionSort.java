public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
    void selectionSort(int[] arr) {
        // code here
        for(int i = 0; i < arr.length; i++){
            int min = arr[i], minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
