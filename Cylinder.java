class cylind{
    private float radius;
    private float height;
    private float surface_area;
    private float volume;

    public cylind(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public void setSurface_Area(){
        surface_area=(2*3.14f*radius*height)+(2*3.14f*radius*radius);
    }
    public float getSurface_Area(){
        return surface_area;
    }
    public void setVolume(){
        volume = 3.14f*3.14f*radius*radius;
    }
    public float getVolume(){
        return volume;
    }



}
public class Cylinder {
    public static void main(String[] args) {
        cylind cy = new cylind(3.55f,4.22f);
        cy.setSurface_Area();
        System.out.println("The surface area of cylinder is :"+cy.getSurface_Area());
        cy.setVolume();
        System.out.println("The Volume of cylinder is :"+cy.getVolume());
    }

}
