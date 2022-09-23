package com.orthofx;

import java.util.*;

public class ArrListPeople {

	public static void main(String[] args) {
		int n=10;
		ArrayList<String> arrli = new ArrayList<String>(n);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter names of 10 people:\n");
		for(int i=0; i<n; i++) {
			String item=input.next().toLowerCase();
			arrli.add(item);
		}
		input.close();
		System.out.println("Before Sorting : " + arrli);
		Collections.sort(arrli);
		System.out.println("After Sorting : " + arrli);
	}

}
