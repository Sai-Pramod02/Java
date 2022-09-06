import java.util.Scanner;
public class Input_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name1 = sc.next();
        String letter = "Dear "+name1+", Thanks a lot";
        System.out.println(letter);
        System.out.println("Enter the new name");
        String name2 = sc.next();
        System.out.println("The replaced name is : "+letter.replace(name1,name2));


    }
}
