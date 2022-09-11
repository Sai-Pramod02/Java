import java.util.Scanner;
 class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
     }
     public String getName(){
        return name;
     }
     public String setName(String n){
        name = n;
        return name;
     }
}
public class Details_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee pramod = new Employee();
        System.out.println("Enter your salary :");
        pramod.salary = sc.nextInt();
        System.out.println("Enter your name :");
        pramod.name = sc.next();
        pramod.getName();
        System.out.println("NAME :-  "+pramod.getName());
        System.out.println("SALARY :-   "+pramod.getSalary());
        System.out.println("Enter your changed name :");
        pramod.name = sc.next();
        System.out.println("CHANGED NAME : "+pramod.setName(pramod.name));

    }


}
