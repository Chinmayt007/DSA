import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        int k=n;
        for(i=0;i<=n;i++){
            int t=k;
            for(j=0;j<=i;j++){
                System.out.print(t--);
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            int t=k;
            for(j=n-1;j>=i;j--){
                System.out.print(t--);
            }
            System.out.println();
        }
        sc.close();
    }
}
