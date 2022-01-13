import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coef=1;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if (j == 0 )
                    coef = 1;
                else
                    coef = coef*(i-j+1)/j;
                System.out.print(coef+"   ");
            }
            System.out.println();;
        }
        sc.close();
    }
}
