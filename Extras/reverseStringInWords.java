package Extras;

public class reverseStringInWords {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseStringInWords.reverseWords(str);
        System.out.println(reversedStr);
    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' ')
                i--;
            if(i < 0)
                break;
            int j = i;
            while(j >= 0 && s.charAt(j) != ' ')
                j--;
            if(res.length() > 0)
                res.append(' ');
            res = res.append(s.substring(j + 1, i + 1));
            i = j - 1;
        }
        return res.toString();
    }
}
