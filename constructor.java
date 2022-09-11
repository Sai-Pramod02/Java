class constructors{
    private int salary;
    private String name;
     constructors(int n){
        salary = n;
        this.name = "Pramod";
    }
     constructors(){
        salary = 10000;
    }
     public int getSalary(){
        return salary;
     }
}
public class constructor {
    public static void main(String[] args) {
        constructors cn = new constructors();
        constructors cn1 = new constructors(5000000);
        System.out.println(cn.getSalary());
        System.out.println(cn1.getSalary());
    }
}
