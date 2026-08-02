public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        HappyNumber solution = new HappyNumber();
        boolean result = solution.isHappy(n);
        System.out.println("Is " + n + " a happy number? " + result);
    }
    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        int slow = n, fast = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(slow != fast);
        return slow == 1;
    }
    public int squareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n/10;
        }
        return sum;
    }
}
