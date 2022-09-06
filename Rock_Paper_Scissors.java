import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random st = new Random();

        System.out.println("Enter 1 for ROCK \nEnter 2 for PAPER\nEnter 3 for scissors");
        int user_input = sc.nextInt();
        int system_input = st.nextInt(1,3);
        System.out.println("Your number is : "+user_input+"\nSystem number is :"+system_input);

        if(user_input==1&&system_input==2){
            System.out.println("System Wins!");
        }
        else if(user_input==1&&system_input==3){
            System.out.println("User Wins!");
        }
        else if(system_input==1&&user_input==2){
            System.out.println("User Wins");
        } else if (system_input==1&&user_input==3) {
            System.out.println("System Wins!");
        }
        else if(user_input==2&&system_input==3){
            System.out.println("System Wins!");
        }
        else if(system_input==2&&user_input==3){
            System.out.println("User Wins!");

        }
        else{
            System.out.println("TIE!");
        }

    }
}
