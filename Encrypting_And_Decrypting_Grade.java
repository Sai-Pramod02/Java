import java.util.Scanner;
public class Encrypting_And_Decrypting_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade :");
        char grade = sc.next().charAt(0);
         grade += 8;
        System.out.println("Encrypted grade is : "+grade);
        grade -= 8;
        System.out.println("Decrypted grade is : "+grade);



    }
}
