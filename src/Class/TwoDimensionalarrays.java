package Class;

//Task 1
public class TwoDimensionalarrays {
    public static void main(String[] args) {
//        // Task 1.1
//        int[][] mas1 = {{1, 2, 3}, {2, 3, 4}, {2, 3, 4}};
//        int[][] mas2 = {{3, 6, 3}, {2, 9, 1}, {9, 4, 2}};
//// Task 1.2
//        int[][] mas3 = new int[3][3];
//        for (int i = 0; i < mas3.length; i++){
//            for (int j = 0; j < mas3.length; j++){
//
//                System.out.print(mas1[i][j] +  mas2[i][j]);
//            }
//            System.out.println();
//        }

        //Task 2

        int[][] matrix = {{3, 4, 3}, {2, 5, 7}};
        int[][] matrix2 = {{1, 2, 3}, {2, 3, 4}};

        int[][] sum = new int[3][3];
        for (int i = 0; i <sum.length ; i++) {
            for (int j = 0; j < sum.length ; j++) {
                sum[i][j] = matrix[i][j] + matrix2[i][j];

                System.out.println(matrix[i][j] + "+" + matrix2[i][j] +" = " + sum[i][j] );

            }
        }

    }


}