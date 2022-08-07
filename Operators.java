package com.orthofx;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter 1st number:");
         int num1 = input.nextInt();
         System.out.print("Enter 2nd number:");
         int num2 = input.nextInt();
         System.out.print("Enter operation(+-*/):");
         char c = input.next().charAt(0);
         input.close();
         
         if(c=='+')
         {
        	 System.out.print(num1+num2);
         }
         else if(c=='-')
         {
        	 System.out.print(num1-num2);
         }
         else if(c=='*')
         {
        	 System.out.print(num1*num2);
         }
         else if(c=='/')
         {
        	 System.out.print(num1/num2);
         }
             
	}

}
