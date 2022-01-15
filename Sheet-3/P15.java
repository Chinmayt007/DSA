import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
        sc.close();
    }

    private static void towerOfHanoi(int n, char from, char aux, char to) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, from, aux, to); 
        System.out.println("Move disk "+ n + " from rod " + from +" to rod " + to ); 
        towerOfHanoi(n - 1, aux, to, from);
    }
}
