import java.util.Scanner;
public class Checking_Number_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched ");
        int num = sc.nextInt();
        int[] arr = {4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " is present in the array at the index " + i);
                break;
            }
        }

        System.out.println("Number is not present in the array");
    }
}

