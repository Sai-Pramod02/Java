import java.util.Scanner;
public class Multiplication_Table_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n +"x"+i+"="+n*i);
        }
    }
}
