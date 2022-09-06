import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number : ");
        int num1 = sc.nextInt();
        int i;
        for(i=1;i<11;i++){
            System.out.println(num1 +"x"+ i +"=" +num1*i);
        }


    }


}
