import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printEven(n, 2);
        sc.close();
    }

    private static Object printEven(int n, int number) {
        if(n==0)
            return null;
        System.out.print(number+" ");
        n--;
        number+=2;
        return printEven(n, number);
    }
}
