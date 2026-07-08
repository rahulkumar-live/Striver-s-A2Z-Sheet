import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=5; j>=1; j--){
                if(j>i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}

