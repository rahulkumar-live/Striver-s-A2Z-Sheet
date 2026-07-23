public class printN {
    public static void main(String[] args) {
        int n = 5;
        printN obj = new printN();
        obj.printNos(n);
    }
    void printNos(int n) {
        // code here
        if(n == 0)
            return;
        System.out.print(n + " ");
        printNos(n - 1);
    }    
}
