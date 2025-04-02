import java.util.*;

public class TwoDimensionalArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[4][3];
		System.out.println("initializing a [4][3] matrix");
		for (int row = 0; row < matrix.length; ++row) { // number of rows
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				matrix[row][col] = 1 + (int) (Math.random() * 10);
			}
		}
		// print matrix
		for (int row = 0; row < matrix.length; ++row) { // number of rows
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				System.out.printf("%2d  ", matrix[row][col]);
			}
			System.out.println(); // advance to next row
		}
		// sum all elements
		int sum = 0;
		for (int row = 0; row < matrix.length; ++row) { // number of rows
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				sum += matrix[row][col];
			}

		}
		System.out.println("Sum is: " + sum);
		// Sum all elements by column

		for (int col = 0; col < matrix[0].length; ++col) { // number of columns
			int total = 0;
			for (int row = 0; row < matrix.length; ++row) { // number of rows

				total += matrix[row][col];
			}
			System.out.println("Sum for column " + col + " is " + total);
		}
		// Sum all elements by row

		for (int row = 0; row < matrix.length; ++row) { // number of rows
			int total = 0;
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				total += matrix[row][col];
			}
			System.out.println("Sum for row " + row + " is " + total);
		}
		// Which row has the largest sum
		// set max to sum of first row
		int max = 0;
		int rowNumber = 0;
		for (int col = 0; col < matrix[0].length; ++col) {
			max += matrix[0][col];
		}
		// find sum of rest of he rows and compare with max
		for (int row = 1; row < matrix.length; ++row) { // number of rows
			int total = 0;
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				total += matrix[row][col];
			}
			if (total > max) {
				max = total;
				rowNumber = row;
			}
		}
		System.out.println("Row number " + rowNumber + " has the largest sum " + max);
		// Finding the smallest index of the largest element
		// assume matrix[0][0] has the largest element
		max = matrix[0][0];
		// index is [0][0]
		int[] index = new int[2];
		// compare each element with max and keep track of largest element index
		for (int row = 0; row < matrix.length; ++row) { // number of rows
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				if (matrix[row][col] > max) {
					max = matrix[row][col];
					index[0] = row;
					index[1] = col;
				}
			}
		}
		System.out.println("smallest index of largest element " + max + " is [" + index[0] + "][" + index[1] + "]");
		// Random shuffling
		for (int row = 0; row < matrix.length; ++row) { // number of rows
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				int r = (int) (Math.random() * matrix.length); // random row number
				int c = (int) (Math.random() * matrix[row].length); // random col number
				// swap
				int temp = matrix[row][col];
				matrix[row][col] = matrix[r][c];
				matrix[r][c] = temp;
			}
		}
		// print matrix after shuffling
		for (int row = 0; row < matrix.length; ++row) { // number of rows
			for (int col = 0; col < matrix[row].length; ++col) { // number of columns
				System.out.printf("%2d  ", matrix[row][col]);
			}
			System.out.println(); // advance to next row
		}
	}
}