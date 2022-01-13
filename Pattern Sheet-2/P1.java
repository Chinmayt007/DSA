import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        k = 1;
        for (int i =1;i<=n;i++)
        {
            for (int j =1;j<=n;j++)
            {
                if (j <= k || j >= n - k + 1)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if (i <= n / 2)
                k++;
            else
                k--;
            System.out.println();
        }
        sc.close();
    }
}