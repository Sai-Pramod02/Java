import java.util.Scanner;
public class Fibonacci_nthTerm_Recursion {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {


            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int a = sc.nextInt();
        System.out.println("The "+a+"th term of fibonacci sequence is : "+fibonacci(a-1));

    }
}
