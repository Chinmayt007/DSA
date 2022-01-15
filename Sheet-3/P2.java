import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNnaturalReverse(n);
        sc.close();
    }

    private static Object printNnaturalReverse(int n) {
        if(n==0)
            return null;
        System.out.print(n+" ");
        return printNnaturalReverse(n-1);
    }
}
