package com.orthofx;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of layers for pyramid:");
        int n=input.nextInt();
        input.close();
        
        for(int i=0;i<n;i++) {
        	for(int j=0; j<n; j++) {
        		if(i+j>=n-1) {
        			System.out.print("* ");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
            System.out.print("\n");
        }
        		

	}

}
