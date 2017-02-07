package com.syntel.training;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	String original = "";
	String Str = new String();
	System.out.println("Enter String");
	Scanner inputString = new Scanner(System.in);
	Str = inputString.nextLine();
	int length = Str.length();
		for(int i = length-1; i >= 0; i-- )
	{
		original+= Str.charAt(i);
		}
		System.out.println("Reverse of String is  "+original);
	
	}

}
