package com.orthofx;

import java.util.Scanner;
import java.util.Stack;

public class ArrLiStack {

	public static void main(String[] args) {
		Stack<Integer> count = new Stack<>();
		Stack<String> result = new Stack<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter pattern:\n");
		String pattern = input.next();
		
		int i=0;
		result.push("");
		
		while(i<pattern.length()) {
			char ch= pattern.charAt(i);
			if(ch>='0' && ch<='9') { //if number
				int start=i;
				while(pattern.charAt(i+1)>='0' && pattern.charAt(i+1)<='9') {
					i++; //for 2 digit numbers	
				}
				int times=Integer.parseInt(pattern.substring(start, i+1));
				count.push(times);
			}
			else if(ch=='[') {
				result.push("");
			}
			else if(ch==']') {
				String word=result.pop(); //get the word inside [ ]
				StringBuilder sb= new StringBuilder();
				int times=count.pop();
				for(int j=0;j<times;j++) {
					sb.append(word); //word is multiplied based on times
				}
				result.push(result.pop()+sb.toString()); //line 16 to prevent error here
				                                         //push combined string to stack
			}
			else {
				result.push(result.pop() + ch); //adding letter to stack
			}
			i=i+1;
		}
		System.out.print(result.pop());
		input.close();
	}
	
}
