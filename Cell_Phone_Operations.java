import java.util.Scanner;
class cellphone {
    public void ringing() {
        System.out.println("Ringing...");
    }

    public void vibrating() {

        System.out.println("Vibrating..");
    }

    public void silent() {
        System.out.println("Silent.");
    }
}
public class Cell_Phone_Operations {
    public static void main(String[] args) {
        cellphone apple = new cellphone();
        Scanner sc = new Scanner(System.in);
        System.out.println("PRESS 1 TO RING  \n PRESS 2 TO VIBRATE \n PRESS 3 TO SILENT ");
        int n = sc.nextInt();
        if(n==1){
            apple.ringing();
        }
        else if(n==2){
            apple.vibrating();
        }
        else if(n==3){
            apple.silent();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

