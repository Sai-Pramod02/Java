public class Fibbonacci_Recursion {
    static int fibbonacci(int n){
        // 0,1,1,2,3,5,813,21
        //  n=(n-1)+(n-2)
        if (n == 0) {

            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return fibbonacci(n-1)+fibbonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int num=6;
        for(int i=0;i<num;i++){
            System.out.println(fibbonacci(i));
        }
    }
}
