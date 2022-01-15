import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
            if(printPrime(i))
                System.out.print(i+" ");
        sc.close();
    }

    private static boolean printPrime(int n) {
        if(n==1||n==0)
            return false;
          for(int i=2; i<n; i++)
                if(n%i==0)
                    return false;
        return true;
    }
}
