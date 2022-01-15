import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        bubbleSort(arr, n);
        sc.close();
    }

    private static void bubbleSort(int[] arr, int n) {
        boolean swapped=false;
        for(int i=0; i<n-1; i++){
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
