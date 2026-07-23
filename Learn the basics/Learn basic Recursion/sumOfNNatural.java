class sumOfNNatural {
    public static void main(String[] args) {
        int n = 5;
        sumOfNNatural obj = new sumOfNNatural();
        int result = obj.sumOfSeries(n);
        System.out.println("Sum of series: " + result);
    }
    int sumOfSeries(int n) {
        int result = 0;
        if(n == 0)
            return 0;
        result = result + (n*n*n) + sumOfSeries(n - 1);
        return result;
    }
}