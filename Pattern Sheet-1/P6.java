public class P6 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i+=2)
        {
            for (int j=9-i; j>1; j--)
                System.out.print(" ");
            for (int j=i; j>=1; j-- )
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
