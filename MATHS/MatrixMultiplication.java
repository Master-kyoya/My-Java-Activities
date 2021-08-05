package matrixReloaded;
public class MatrixMultiplication {
	
	static int[][] m1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3 x 2 matrix
	static int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2 x 3 matrix

	public static void main(String[] args) {
		System.out.println("Michael Jan R. Tangalin\n1  - BSIT - 2");
		System.out.println("Discrete Structures");
		
			int[][] result = multiply(m1, m2);

			for (int row = 0; row < result.length; row++) {
				for (int column = 0; column < result[0].length; column++) {
					System.out.print(result[row][column] + "\t \t");
				}
				System.out.println();
			}
	}
	public static int[][] multiply(int[][] mat1, int[][] mat2) {
		// all elements are initialized to be zeros
		int[][] answer = new int[mat1.length][mat2[0].length];
		for (int r = 0; r < mat1.length; r++) {
			for (int c = 0; c < mat2[0].length; c++) {
				for (int i = 0; i < mat1[0].length; i++) {
					answer[r][c] += mat1[r][i] * mat2[i][c];
				}
			}
		}
		return answer;
	}
}
