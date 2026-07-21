public class lcmAndgcd {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int[] result = lcmAndGcd(a, b);
        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int small = a < b? a: b;
        int[] result = new int[2];
        while(small > 0){
            if(a%small == 0 && b%small == 0){
                result[1] = small;
                break;
            }
            small--;
        }
        result[0] = (a * b)/result[1];
        return result;
    }  
}
