import java.util.Random;
import java.util.Scanner;
class Game {
    private int system_input;
    private int user_input;
    private int score;

    Game() {
        Random r = new Random();
        system_input = r.nextInt(0, 100);
    }
    public int getSystem_input(){
        return system_input;
    }

    public void setUser_input(int n) {
        user_input = n;
    }

    public int getUser_input() {
        return user_input;
    }


    public boolean isCorrectNumber() {
        if (user_input == system_input) {
            System.out.println("Congrats! your guess is correct");
            return true;
        }
         else if(user_input>system_input){
            System.out.println("The entered number is greater than the original number");
            System.out.println("Please try again");
            return false;
        }
         else{
            System.out.println("The entered number is lesser than the original number");
            System.out.println("Please try again");
            return false;
        }

    }
}
public class Guess_The_Num {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println(g.getSystem_input());

        while(true){
            System.out.println("Enter your number :");
            int a = sc.nextInt();
            g.setUser_input(a);
            if(g.getUser_input()==g.getSystem_input()){
            g.isCorrectNumber();
                break;
            }
            else {
                g.isCorrectNumber();
                count = count + 1;
            }
        }
        System.out.println("Your total score is :" + count);
    }
}
