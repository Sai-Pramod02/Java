class Monkey{
    public void Jump(){
        System.out.println("Jumping..");
    }
    public void Bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void greet(){
        System.out.println("Hello!");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        human human = new human();
        human.eat();
        human.sleep();
        human.greet();
        human.Jump();
        human.Bite();
    }
}
