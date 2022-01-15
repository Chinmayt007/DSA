import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printSeries(n, 1);
        sc.close();
    }

    private static Object printSeries(int n, int i) {
        if(n==i)
            return null;
        if(i+1==n)
            System.out.print(i+"^"+i);
        else
            System.out.print(i+"^"+i+"+");
        return printSeries(n, i+1);
    }
}
