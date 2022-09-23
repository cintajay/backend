package com.orthofx;

import java.util.*;

public class ArrLiMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("MENU:\n 1)Add 2)Add const 3)Multiplication\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter option:");
		int op = input.nextInt();
		if (op == 1) {
			System.out.print("Enter number of rows:");
			int m = input.nextInt();
			System.out.print("Enter number of columns:");
			int n = input.nextInt();

			ArrayList<ArrayList<Integer>> mat1 = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> mat2 = new ArrayList<ArrayList<Integer>>();

			System.out.print("Enter values of 1st matrix:\n");
			for (int i = 0; i < m; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>();
				for (int j = 0; j < n; j++) {
					int item = input.nextInt();
					row.add(item);
				}
				mat1.add(row);
			}

			System.out.print("Enter values of 2nd matrix:\n");
			for (int i = 0; i < m; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>();
				for (int j = 0; j < n; j++) {
					int item = input.nextInt();
					row.add(item);
				}
				mat2.add(row);
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int sum = mat1.get(i).get(j) + mat2.get(i).get(j);
					System.out.print(sum + " ");
				}
				System.out.print("\n");
			}

		}

		else if (op == 2) {
			System.out.print("Enter number of rows:");
			int m = input.nextInt();
			System.out.print("Enter number of columns:");
			int n = input.nextInt();
			System.out.print("Enter constant to be multiplied:");
			int c = input.nextInt();

			ArrayList<ArrayList<Integer>> mat1 = new ArrayList<ArrayList<Integer>>();

			System.out.print("Enter values of matrix:\n");
			for (int i = 0; i < m; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>();
				for (int j = 0; j < n; j++) {
					int item = input.nextInt();
					row.add(item);
				}
				mat1.add(row);
			}
			System.out.print("Result:\n");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int value = mat1.get(i).get(j) * c;
					System.out.print(value + " ");
				}
				System.out.print("\n");
			}
		} else if (op == 3) {
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
				ArrayList<ArrayList<Integer>> mat1 = new ArrayList<ArrayList<Integer>>();
				ArrayList<ArrayList<Integer>> mat2 = new ArrayList<ArrayList<Integer>>();

				System.out.print("Enter values of 1st matrix:\n");
				for (int i = 0; i < m1; i++) {
					ArrayList<Integer> row = new ArrayList<Integer>();
					for (int j = 0; j < n1; j++) {
						int item = input.nextInt();
						row.add(item);
					}
					mat1.add(row);
				}

				System.out.print("Enter values of 2nd matrix:\n");
				for (int i = 0; i < m2; i++) {
					ArrayList<Integer> row = new ArrayList<Integer>();
					for (int j = 0; j < n2; j++) {
						int item = input.nextInt();
						row.add(item);
					}
					mat2.add(row);
				}
//				for(ArrayList<Integer> item:mat1) {
//					System.out.print(item+"\n");
//				}
//				
				int sum;
				for (int i = 0; i < m1; i++) {
					for (int j = 0; j < n2; j++) {
						sum =0;
						for (int k = 0; k < m2; k++) {
							sum += mat1.get(i).get(k) * mat2.get(k).get(j);
						}
						System.out.print(sum + " ");
					}
					System.out.print("\n");
				}
			}
		}

		input.close();
	}

}
