import java.math.BigDecimal;
import java.util.Scanner;

public class Income_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income tax amount : ");
        double IT = sc.nextDouble();
        if(IT<=250000){
            System.out.println("No Tax amount to be paid");

        }
        else if (IT>=250000 && IT<500000){

            System.out.println("Tax to be paid is : "+(IT*5)/100);
        }
        else if (IT>=500000 && IT<1000000){
            System.out.println("Tax to be paid is : "+(IT*20)/100);
        }
        else if (IT>1000000){
            System.out.println("Tax to be paid is :"+(IT*30)/100);
        }
    }
}
