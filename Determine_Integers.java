import java.util.Scanner;
public class Determine_Integers {
    public static void main(String[] args) {
        System.out.println("Detect if the number is integer or not");
        System.out.println("Enter your number ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
