import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("1+");
        printPattern(n, 1);
        sc.close();
    }

    private static Object printPattern(int n, int a) {
        if(a==n)
            return null;
        if(a+1==n)
            System.out.print((int)Math.pow(2, a));
        else
            System.out.print((int)Math.pow(2, a)+"+");
        return printPattern(n, a+1);
    }
}
