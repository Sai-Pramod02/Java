import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum marks per subject");
        float total = sc.nextFloat();
        System.out.println("Enter your marks in maths");
        float maths = sc.nextFloat();
        System.out.println("Enter your marks in science ");
        float science = sc.nextFloat();
        System.out.println("Enter your marks in english");
        float english = sc.nextFloat();
        System.out.println("Enter your marks in social");
        float social = sc.nextFloat();
        System.out.println("Enter your marks in hindi");
        float hindi = sc.nextFloat();
        float full = maths+science+english+social+hindi;
        float percentage = (full/5*total)*100;
        System.out.println("Your percentage is : "+percentage);

    }

}
