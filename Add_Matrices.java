public class Add_Matrices {
    public static void main(String[] args) {
        int sum=0;
        int [][]matrix1 = new int[2][3];
        matrix1[0][0] = 3;
        matrix1[0][1] = 4;
        matrix1[0][2] = 5;
        matrix1[1][0] = 6;
        matrix1[1][1] = 7;
        matrix1[1][2] = 8;
        int [][]matrix2 = new int[2][3];
        matrix2[0][0] = 8;
        matrix2[0][1] = 7;
        matrix2[0][2] = 6;
        matrix2[1][0] = 5;
        matrix2[1][1] = 4;
        matrix2[1][2] = 9;
        for(int i =0;i< matrix1.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                sum = matrix1[i][j]+matrix2[i][j];
                System.out.print(" ");
                System.out.print(sum);

            }
            System.out.println();
        }
    }
}
