import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        int k=1;
        for(i=0;i<n;i++){
            for(j=0;j<2*n;j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }
                else if(j==n-i-1)
                System.out.print(k);
                else if(j==n+i-1)
                System.out.print(k);
                else
                System.out.print(" ");
            }
            k++;
            System.out.println();
        }
        k=k-2;
        for(i=1;i<n;i++){
            for(j=0;j<2*n;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else if(j==i)
                System.out.print(k);
                else if(j==2*n-i-2)
                System.out.print(k);
                else
                System.out.print(" ");
            }
            k--;
            System.out.println();;
        }
        sc.close();
    }
}
