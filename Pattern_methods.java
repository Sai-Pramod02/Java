import java.util.Scanner;
public class Pattern_methods {
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        System.out.println("Enter your number :");
        int a = sc.nextInt();
        pattern(a);

    }
}
