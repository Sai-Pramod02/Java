public class Avg_Nums {
    static float avg(float ...arr){
        float sum=0f;
        for(float element: arr){
            sum +=element;

        }
        float average = sum/arr.length;
    return average;

    }

    public static void main(String[] args) {
        System.out.println(avg(2,3,4));
        System.out.println(avg(2,7,9,11,76.3f));
    }
}
