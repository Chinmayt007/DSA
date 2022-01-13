import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j;
        char k=(char) (n+64);
        for(i=0;i<n;i++){
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
            System.out.println();
        }
        sc.close();
    }
}
