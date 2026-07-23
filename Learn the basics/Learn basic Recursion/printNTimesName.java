class printNTimesName {
    public static void main(String[] args) {
        int n = 5;
        printName(n);
    }

    public static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("John");
        printName(n - 1);
    }
}
