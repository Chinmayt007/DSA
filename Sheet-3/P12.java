import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findFactorial(n));
        sc.close();
    }

    private static int findFactorial(int n) {
        if(n==0 || n==1)
            return n;
        return n*findFactorial(n-1);
    }
}
