public class isPrime {
    public static void main(String[] args) {
        int n = 7;
        if(isPrimeNum(n))
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
    static boolean isPrimeNum(int n) {
        // code here
        if(n == 1)
            return false;
        int count = 2, i = 2;
        while(i <= n/2 + 1){
            if(n%i == 0)
                count++;
            i++;
        }
        return count>2?false: true;
    }
}
