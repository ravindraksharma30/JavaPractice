package com.syntel.training;

public class DayOne {

	int g = 35;
	int h = 25;
	public static void main(String[] args) {
//		int A = 10;
//		int B = 20;
//		int C;
//		C = A + B;

//System.out.println("Value of A: "+ A);
		DayOne D1 = new DayOne();
		int a = add (5,10);
		int b = mult (5,10);
		int c = div (5,10);
		int d = D1.sub(10,5);
		int k = add(D1.g,D1.h);
		System.out.println ("value of a - " + a);
		System.out.println ("value of b - " + b);
		System.out.println ("value of c - " + c);
		System.out.println ("value of d - " + d);
		System.out.println ("value of k - " + k);
		
	}
public static int add (int x, int y){
	int result = x + y;
	return result;
}
//method is not defined static so we need to use object to call this method.
public int sub (int x, int y){
	int result = x - y;
	return result;
}
public static int mult (int x, int y){
	int result = x * y;
	return result;
}
public static int div (int x, int y){
	int result = y/x;
	return result;
}
}
