public class reverseInteger {
    public static void main(String[] args) {
        reverseInteger obj = new reverseInteger();
        int n = 123;
        System.out.println(obj.reverse(n));
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
