public class sumOfDivisors {
    public static void main(String[] args) {
        long n = 6;
        System.out.println(sumOfDivisor(n));
    }
    public static long sumOfDivisor(long n) {
        // code here
        long result = 0;
        for(long i = 1; i <= n + 1; i++)
            result += i * (n/i);
        return result;
    }    
}
