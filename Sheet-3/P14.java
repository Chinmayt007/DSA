import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<=n; i++)
            System.out.print(printFibonacci(i)+" ");
        sc.close();
    }

    private static int printFibonacci(int n) {
        if(n==0 || n==1)
            return n;
        return printFibonacci(n-1)+printFibonacci(n-2);
    }
}
