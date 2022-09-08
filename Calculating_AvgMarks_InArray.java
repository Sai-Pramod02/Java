public class Calculating_AvgMarks_InArray {
    public static void main(String[] args) {
        float average=0f;
        float []physics = {50f,60f,70f,80f,90f};
        for(float element: physics){
            average = (average+element);
        }

        System.out.println("The everage of marks of 5 students in physics is : "+average/physics.length);
    }
}
