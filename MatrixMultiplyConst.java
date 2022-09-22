package com.orthofx;

import java.util.Scanner;

public class MatrixMultiplyConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int m = input.nextInt();
		System.out.print("Enter number of columns:");
		int n = input.nextInt();
		System.out.print("Enter constant to be multiplied:");
		int c = input.nextInt();

		int Mat[][] = new int[m][n];
		
		System.out.print("Enter values of matrix:\n");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Mat[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				Mat[i][j] = Mat[i][j]*c;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%-4d",Mat[i][j]);
			}
			System.out.print("\n");
		}
		input.close();

	}

}
