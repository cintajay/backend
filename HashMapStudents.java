package com.orthofx;

import java.util.*;

public class HashMapStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students:\n");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			String name = "";
			int mark = 0;
			System.out.print("Enter name of student:");
			name = input.next();
			System.out.print("Enter mark of student:");
			mark = input.nextInt();
			map.put(name, mark);
		}
		System.out.print("Enter name of student to fetch marks:");
		String item = input.next();
		if (map.containsKey(item)) {
			int value = map.get(item);
			System.out.print("Marks of " + item + " is:" + value);
		}
		input.close();
	}

}
