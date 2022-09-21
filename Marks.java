package com.orthofx;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter marks:");
		int mark= input.nextInt();
		input.close();
		
		if(mark>=90) {
			System.out.print("Amazing");
		}
		else if(mark>=80 && mark<90) {
			System.out.print("Good");
		}
		else if(mark>=70 && mark<80) {
			System.out.print("All right");
		}
		else if(mark<70) {
			System.out.print("Okay");
		}
		else {
			System.out.print("Invalid output");
		}
		

	}

}
