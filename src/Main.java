import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int rows = in.nextInt();
	int cols = in.nextInt();
	int count = 0;
	in.nextLine();
	char[][] matrix = new char[rows][];
	for (int i = 0; i < rows; i++) {
        String temp = in.nextLine();
        char[] arr = temp.toCharArray();
        matrix[i] = arr;
    }
	for (int i = 0; i < rows; i++) {
	    for (int j = 0; j < cols; j++) {
	        if (matrix[i][j] == 'L') {
	            count++;
                flood(i, j, matrix);
            }
        }
    }
        System.out.println(count);
    }

    public static void flood(int rowInd, int colInd, char[][] mat) {
        mat[rowInd][colInd] = 'V';
        if ((rowInd - 1) >= 0 && (mat[rowInd - 1][colInd] == 'L' || mat[rowInd - 1][colInd] == 'C')) {
            mat[rowInd - 1][colInd] = 'V';
            flood(rowInd - 1, colInd, mat);
        }
        if((rowInd + 1) < mat.length && (mat[rowInd + 1][colInd] == 'L' ||  mat[rowInd + 1][colInd] == 'C')) {
            mat[rowInd + 1][colInd] = 'V';
            flood(rowInd + 1, colInd, mat);
        }
        if ((colInd - 1) >= 0 && (mat[rowInd][colInd - 1] == 'L' || mat[rowInd][colInd - 1] == 'C')) {
            mat[rowInd][colInd - 1] = 'V';
            flood(rowInd, colInd - 1, mat);
        }
        if ((colInd + 1) < mat[0].length && (mat[rowInd][colInd + 1] == 'L' || mat[rowInd][colInd + 1] == 'C')) {
            mat[rowInd][colInd + 1] = 'V';
            flood(rowInd , colInd + 1, mat);
        }
    }
}
