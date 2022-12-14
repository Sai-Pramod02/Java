abstract class Pen{
   abstract void write();
   abstract void refill();
   public void learn(){
       System.out.println("Learning....");
   }
}
class FountainPen extends Pen{
    void ChangeNib(){
        System.out.println("Nib is changed");
    }
    void write(){
        System.out.println("Writing!!!");
    }
    void refill(){
        System.out.println("Refilled!!!");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        FountainPen fountainPen = new FountainPen();
        fountainPen.ChangeNib();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.learn();
    }


}
