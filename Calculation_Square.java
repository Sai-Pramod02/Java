import java.util.Scanner;
class square{
    float side;
    float a;
    float p;
    public float area(float side){
        a = side*side;
        return a;
    }
    public float perimeter(float side){
        p = 4*side;
        return p;
    }
}
public class Calculation_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square sq = new square();
        System.out.println("Enter the side of the square :");
        float s = sc.nextFloat();
        System.out.println("PRESS 1 FOR FINDING AREA OF SQUARE : \n PRESS 2 FOR FINDING PERIMETER OF SQUARE : ");
        int z = sc.nextInt();
        if(z==1){
            System.out.println("The area of square is : "+sq.area(s));
        }
        else if(z==2){
            System.out.println("The perimeter of square is : "+sq.perimeter(s));
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
