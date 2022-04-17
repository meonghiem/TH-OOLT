
public class addMatrix {
	public static void main(String[] args) {
		int rows = 2, columns = 3;
        int[][] Matrix1 = { {3, -2, 4}, {-5, 2, 3} };
        int[][] Matrix2 = { {7, 10, 3}, {5, -6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }

       
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}
}
