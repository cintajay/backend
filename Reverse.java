package com.orthofx;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string to reverse:");
		char[] str = input.next().toCharArray();	
		input.close();
		
		for(int i=0;i<str.length ;i++) {
			System.out.print(str[str.length-1]--);
			
		}
		
		
		
		

	}

}
