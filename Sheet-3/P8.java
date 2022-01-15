import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("1+3+");
        printPatter(n, 2);
        sc.close();
    }

    private static Object printPatter(int n, int i) {
        if(i==n)
            return null;
        if(i+1==n)
            System.out.println((int)Math.pow(3, i));
        else
            System.out.print((int)Math.pow(3, i)+"+");
        return printPatter(n, i+1);
    }
}
