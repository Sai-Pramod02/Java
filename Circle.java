class circle1{
    private float radius;
    private float area;
    private float perimeter;
    public void setRadius(float n){
        this.radius = n;
    }
    public float getRadius(){
        return this.radius;
    }
    public void setArea(float a){
        area = 3.14f*radius*radius;
        if(a==area){
            area=a;
        }
        else{
            System.out.println("The entered area value is invalid ");
        }

    }
    public float getArea(){
        return this.area;
    }
}
public class Circle {
    public static void main(String[] args) {
        circle1 c = new circle1();
        c.setRadius(5.5f);
        System.out.println("The radius of circle is : "+c.getRadius());
        c.setArea(94.985f);
        System.out.println("The original area of circle is : "+c.getArea());

    }

}
