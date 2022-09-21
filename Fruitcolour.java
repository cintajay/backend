package com.orthofx;

import java.util.Scanner;

public class Fruitcolour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter fruit name:");
		String fruit = input.next();
		input.close();
		
		switch(fruit) {
		case "apple":System.out.print("red");
		break;
		case "banana":System.out.print("yellow");
		break;
		default:System.out.print("green"); 
		break;
		
		}
		
	}

}
