import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNnatural(n, 1);
        sc.close();
    }

    private static Object printNnatural(int n, int a) {
        if(a>n)
            return null;
        System.out.print(a+" ");
        return printNnatural(n, a+1);
    }
}
