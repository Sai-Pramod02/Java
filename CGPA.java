import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        System.out.println("CALCULATING CGPA USING MARKS OF 3 SUBJECTS ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in maths :");
        float maths = sc.nextFloat();
        System.out.println("Enter your marks in science :");
        float science = sc.nextFloat();
        System.out.println("Enter your marks in english :");
        float english = sc.nextFloat();
        float total = maths + science + english;
        float CGPA = total/30;
        System.out.println("Your CGPA is : "+CGPA);

    }
}
