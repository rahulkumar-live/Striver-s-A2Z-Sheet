public class printTillN {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}
