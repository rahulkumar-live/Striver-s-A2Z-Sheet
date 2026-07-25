public class PalindromeStringCheck {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        PalindromeStringCheck obj = new PalindromeStringCheck();    
        boolean isPalindrome = obj.isPalindrome(str);
        System.out.println(isPalindrome);   
    }
    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(Character.isLetterOrDigit(s.charAt(i)))
                temp.append(Character.toLowerCase(s.charAt(i)));
            i++;
        }
        String rev = reverseString(temp.toString());
        if(rev.equals(temp.toString()))
            return true;
        return false;
    }
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
