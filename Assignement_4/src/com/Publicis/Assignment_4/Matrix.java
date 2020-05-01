package com.Publicis.Assignment_4;

import java.util.Scanner;

public class Matrix {

	private int row;
	private int col;
	private int[][] matrix;
	Scanner scan = new Scanner(System.in);

	public Matrix() {
		this.row = 3;
		this.col = 3;
		this.matrix = new int[row][col];
		enterMatrix();
	}

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		this.matrix = new int[row][col];
		enterMatrix();
	}

	public Matrix(int[][] matrix) {
		this.row = matrix.length;
		this.col = matrix[0].length;
		this.matrix = matrix;
	}

	public void enterMatrix() {
		// System.out.println(matrix);
		System.out.println("Enter numbers into the Matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				this.matrix[i][j] = scan.nextInt();

			}

		}
	}

	public void readMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " \t");
			}
			System.out.println();
		}
	}

	public int[][] addMatrix(int[][] mat2) {
		if (matrix.length != mat2.length || matrix[0].length != mat2[0].length) {
			System.out.println("Matrix addition is not possible");
			return null;
		}

		int[][] sumMatrix = new int[row][col];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sumMatrix[i][j] = matrix[i][j] + mat2[i][j];
			}
		}
		readMatrix(sumMatrix);
		return sumMatrix;
	}

	public boolean scalarMatrixOrNot() {
		if (matrix.length != matrix[0].length)
			return false;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j) {
					if (matrix[i][i] != matrix[0][0])
						return false;
				} else if (matrix[i][j] != 0)
					return false;
			}
		}
		return true;
	}

	public int[][] multiplyMatrix(int[][] mat2) {
		if (matrix[0].length != mat2.length) {
			System.out.println("Matrix Multipication is not possible");
			return null;
		}

		int[][] mulMatrix = new int[col][mat2[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				for (int k = 0; k < mat2.length; k++) {
					mulMatrix[i][j] = mulMatrix[i][j] + matrix[i][k] * mat2[k][j];
				}
			}
		}
		readMatrix(mulMatrix);
		return mulMatrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 2, 1 }, { 1, 0 }, { 1, 1 } };
		int[][] matrix2 = { { 2, 1 }, { 1, 0 }, { 1, 1 } };
		Matrix mat = new Matrix(matrix);

		System.out.println("Matrix is a scalar " + mat.scalarMatrixOrNot());
		int[][] addMatrix = mat.addMatrix(matrix2);
		int[][] mulMatrix = mat.multiplyMatrix(matrix2);

	}

}
