class dog{
    int legs;
    int tail;
    int head;
    public void setLegs(int x){
        this.legs = x;
    }
    public int getLegs() {
        return legs;
    }
    public void setTail(int y){
        this.tail = y;
    }

    public int getTail() {
        return tail;
    }
}
class golden_retriever extends dog{
    int age;
    int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
public class Pets {
    public static void main(String[] args) {
        golden_retriever g = new golden_retriever();
        System.out.println("Golden retriever");
        g.setLegs(4);
        System.out.println("legs : "+g.getLegs());
        g.setTail(1);
        System.out.println("tail : "+g.getTail());
        g.setAge(7);
        System.out.println("age :"+g.getAge()+" Years");
        g.setWeight(40);
        System.out.println("Weight :"+g.getWeight()+" Kgs");
    }

}
