import java.util.Scanner;
public class Km_To_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("KM TO  MILES CONVERTER");
        System.out.println("Enter no.of km : ");
        double km = sc.nextFloat();
        double miles = km*0.621371;
        System.out.println(miles+" miles");
    }
}
