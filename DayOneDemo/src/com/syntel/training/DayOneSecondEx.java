package com.syntel.training;

import java.util.Scanner;

public class DayOneSecondEx extends DayOne{

		public static void main(String[] args) {
		DayOne D1 = new DayOne();
	System.out.println("Enter First and Second Number");
	Scanner inp= new Scanner(System.in);
int num1, num2;
num1 = inp.nextInt();
num2 = inp.nextInt();
System.out.println("Enter 1 for Addition " + "2 for Subtraction " + "3 for Multiply ");
int choose;
choose = inp.nextInt();
inp.close();
switch (choose){
case 1:
	System.out.println(add(num1,num2));
	break;
case 2:
	System.out.println(D1.sub(num1,num2));
	break;
case 3:
	System.out.println(mult(num1,num2));
	break;
}

	}
	
}
