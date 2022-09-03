import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = sc.next();
        System.out.println("Hello " +name+" Have a good Day!");

    }
}
