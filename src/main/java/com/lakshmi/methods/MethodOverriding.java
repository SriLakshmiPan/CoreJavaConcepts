package com.lakshmi.methods;
//methodoverriding,same methodname with different parameters
public class MethodOverriding {
	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		double c = 7.3;
		double d = 9.4;
		int result1 = minFunction(a, b);
		double result2 = minFunction(c, d);
		System.out.println("Minimum Value = " + result1);
		System.out.println("Minimum Value = " + result2);
	}
	// for integer parameters
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}
	// for double parametrs
	public static double minFunction(double n1, double n2) {
		double min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}
	}
