package com.syntel.training;

public class PrintStars {

	public static void main(String[] args) {
		
		for(int i = 0; i < 6; i++)
		{
			for(int j=i+1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
