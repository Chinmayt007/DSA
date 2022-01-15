import java.util.Arrays;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        kInsertionSort(arr, n, k);
        sc.close();
    }

    private static void kInsertionSort(int[] arr, int n, int k) {
        for (int i= 1; i<n-k; i++) {
            int key= arr[i];
            int j= i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]= arr[j];
                j= j-1;
            }
            arr[j+1]= key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
