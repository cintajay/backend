package com.orthofx;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of layers for pyramid:");
        int n=input.nextInt();
        input.close();
        int i=0;
        int j=0;
        
        while(i!=n) {
        	while(j!=n) {
        		if(i+j>=n-1) {
        			System.out.print("* ");
        		}
        		else {
        			System.out.print(" ");
        		}
        		
        	   j++;
        	}
          i++;
          j=0;
          System.out.print("\n");
        }
   }

}
