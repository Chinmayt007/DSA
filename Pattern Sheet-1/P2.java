public class P2 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int k=1; k<=5-i; k++)
                System.out.print(" ");
            for(int j=5; j>5-i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
