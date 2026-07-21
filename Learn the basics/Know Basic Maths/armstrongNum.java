public class armstrongNum {
    public static void main(String[] args) {
        int n = 153;
        if(armstrongNumber(n))
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }

    public static boolean armstrongNumber(int n) {
        // code here
        int temp = n, armNum = 0;
        while(temp > 0){
            armNum = armNum + cube(temp%10);
            temp = temp/10;
        }
        if(armNum == n)
            return true;
        return false;
    }
    static int cube(int num){
        return num*num*num;
    }  
}
