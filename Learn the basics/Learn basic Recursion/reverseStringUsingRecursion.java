public class reverseStringUsingRecursion {
    
    public static void main(String[] args) {
        String str = "amanaplanacanalpanama";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
