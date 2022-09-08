import java.util.Scanner;
public class Recursion_SumOfNumbs {
    static int sum(int n){
        // 5 -> 1+2+3+4+5
        // n+(n-1)
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
}
