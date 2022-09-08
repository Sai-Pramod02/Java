public class Find_MaxNo_Array {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {5, 3, 6, 4, 2, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum) {
                sum = arr[i];
            }
        }
        System.out.println(sum);
    }
}

