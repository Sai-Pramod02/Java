import java.util.Scanner;
public class Pass_Fail_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in maths : ");
        float maths = sc.nextInt();
        System.out.println("Enter your marks in science : ");
        float science = sc.nextInt();
        System.out.println("Enter your marks in english : ");
        float english = sc.nextInt();
        float mp = (maths/100)*100;
        float sp = (science/100)*100;
        float ep = (english/100)*100;
        boolean cond1 = (((maths+science+english)/300)*100>=40);
        boolean cond2 = (mp>33 && sp>33 && ep>33);
        if(cond1&&cond2){
            System.out.println("Congrats you are passed!");

        }
        else{
            System.out.println("Better luck next time!");
        }

    }



}
