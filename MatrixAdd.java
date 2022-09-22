package com.orthofx;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int m = input.nextInt();
		System.out.print("Enter number of columns:");
		int n = input.nextInt();

		int firstMat[][] = new int[m][n];
		int secondMat[][] = new int[m][n];
		int resultMat[][] = new int[m][n];

		System.out.print("Enter values of 1st matrix:\n");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				firstMat[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Enter values of 2nd matrix:\n");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				secondMat[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				resultMat[i][j] = firstMat[i][j] + secondMat[i][j];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%-4d",resultMat[i][j]);
			}
			System.out.print("\n");
		}
		input.close();

	}

}
