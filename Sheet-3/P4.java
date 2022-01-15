import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printOdd(n, 1);
        sc.close();
    }

    private static Object printOdd(int n, int number) {
        if(n==0)
            return null;
        System.out.print(number+" ");
        n--;
        number+=2;
        return printOdd(n, number);
    }
}
