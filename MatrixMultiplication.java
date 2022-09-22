package com.orthofx;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("MAT 1 \n Enter number of rows:");
		int m1 = input.nextInt();
		System.out.print(" Enter number of columns:");
		int n1 = input.nextInt();
		System.out.print("MAT 2 \n Enter number of rows:");
		int m2 = input.nextInt();
		System.out.print(" Enter number of columns:");
		int n2 = input.nextInt();

		if (n2 != m1) {
			System.out.print("Number of columns of 1st matrix is not equal to number of rows of 2nd matrix");
		} else {
			int firstMat[][] = new int[m1][n1];
			int secondMat[][] = new int[m2][n2];

			int resultMat[][] = new int[m1][n2];

			System.out.print("Enter values of 1st matrix:\n");
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n1; j++) {
					firstMat[i][j] = input.nextInt();
				}
			}
			System.out.print("Enter values of 2nd matrix:\n");
			for (int i = 0; i < m2; i++) {
				for (int j = 0; j < n2; j++) {
					secondMat[i][j] = input.nextInt();
				}
			}

			System.out.print("Result:\n");

			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					for (int k = 0; k < m2; k++) {
						resultMat[i][j] += firstMat[i][k]*secondMat[k][j];
					}
				}
			}
			System.out.print("\n");
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					System.out.printf("%-4d", resultMat[i][j]);
				}
				System.out.print("\n");
			}
		}

		input.close();
	}
}
