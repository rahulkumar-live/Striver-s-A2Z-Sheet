public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        int n = 121;
        System.out.println(obj.isPalindrome(n));
    }
    public boolean isPalindrome(int x) {
        int rev = reverse(x);
        if(x < 0)
            return false;
        if(rev == x)
            return true;
        return false;
    }
    public int reverse(int x) {
        int sign = x > 0 ? 1: -1;
        int result = 0, temp = x * sign;
        while(temp > 0){
            int digit = temp % 10;
            if(result > (Integer.MAX_VALUE - digit)/10)
                return 0;
            result = (result * 10) + digit;
            temp = temp / 10; 
        }
        return result * sign;
    }
}