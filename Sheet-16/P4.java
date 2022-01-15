import java.util.Arrays;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        kBubbleSort(arr, n, k);
        sc.close();
    }

    private static void kBubbleSort(int[] arr, int n, int k) {
        boolean swapped=false;
        for(int i=0; i<n-1-k; i++){
            swapped=false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
