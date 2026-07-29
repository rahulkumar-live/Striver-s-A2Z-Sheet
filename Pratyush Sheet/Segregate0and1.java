public class Segregate0and1 {
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 0};
        Segregate0and1 s = new Segregate0and1();
        s.segregate0and1(arr);
        System.out.println("Array after segregation: " + java.util.Arrays.toString(arr));
    }
    void segregate0and1(int[] arr) {
        // code here
        int left = 0, right = arr.length - 1;
        while(left < right){
            while(arr[left] == 0 && left < right){
                left++;
            }
            while(arr[right] == 1 && left < right){
                right--;
            }
            if(left < right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }    
    }
}
