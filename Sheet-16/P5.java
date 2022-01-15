import java.util.Arrays;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        kSelectionSort(arr, n, k);
        sc.close();
    }

    private static void kSelectionSort(int[] arr, int n, int k) {
        for (int i= 0; i<n-1-k; i++)
        {
            int min_idx = i;
            for (int j= i+1; j<n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx= j;
            int temp= arr[min_idx];
            arr[min_idx]= arr[i];
            arr[i]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
