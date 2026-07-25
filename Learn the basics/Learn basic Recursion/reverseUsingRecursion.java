public class reverseUsingRecursion {
    public static void main(String[] args) {
        reverseUsingRecursion obj = new reverseUsingRecursion();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(s);
        System.out.println(s);
    }
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        solve(s, i, j);
    }
    public void solve(char[] s, int i, int j){
        if(i >= j)
            return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        solve(s, ++i, --j);
    }
}
