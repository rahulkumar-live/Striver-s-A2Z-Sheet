public class factorialofN {
    public static void main(String[] args) {
        int n = 5;
        factorialofN obj = new factorialofN();
        int result = obj.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    int factorial(int n) {
        // code here
        int result = 1;
        if(n == 0)
            return 1;
        result = result *  n * factorial(n - 1);
        return result;
    }
}
