package com.bridgelabz.day13;

public class FindTheMaxInterger {
	public static Integer compareTo(Integer num1, Integer num2, Integer num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {

		FindTheMaxInterger integer = new FindTheMaxInterger();

		System.out.println("max Number for 1st test case=" + integer.compareTo(5, 3, 2));// Test case 1 :given max number for
																					// 1st position.
		System.out.println("max Number for 2nd test case=" + integer.compareTo(2, 6, 3));// Test case 2:given max number for
																					// 2nd position.
		System.out.println("max Number for 3rd test case=" + integer.compareTo(1, 2, 3));// Test case 3:given max number for
																					// the 3rd position.

	}

}