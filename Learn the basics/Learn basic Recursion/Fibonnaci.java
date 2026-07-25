public class Fibonnaci {
    public static void main(String[] args) {
        Fibonnaci obj = new Fibonnaci();
        int n = 10; // Example input
        int result = obj.fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
