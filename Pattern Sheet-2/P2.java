import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first =1;
        int second=1;
        int third=first+second;
        int k=n*(n+1)/2;
        int arr[]=new int[k+1];
        arr[0]=first;
        arr[1]=second;
        for(int i = 2;i<=n*(n+1)/2;i++)
        {
            third=first+second;
            first=second;
            second=third;
            arr[i]=third;
        }
        int p=0;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(arr[p++]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
