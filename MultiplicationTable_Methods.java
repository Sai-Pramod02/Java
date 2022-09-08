import java.util.Scanner;
public class MultiplicationTable_Methods {
    static void mul(int n){
       for( int i=0;i<=10;i++){
           System.out.println(n+"x"+i+"="+n*i);
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a =sc.nextInt();
        mul(a);
    }

}
