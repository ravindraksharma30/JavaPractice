package com.syntel.poly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DayFourMain {

	public static void main(String[] args) {
		
String fileNameWithPath = "C:/Users/RXS8784/Desktop/Projects/Test.txt";
DayFourMain D4 = new DayFourMain();
D4.readFile(fileNameWithPath);
	}
		public void readFile(String fileNameWithPath)
		{
			FileReader fr = null;
			BufferedReader br = null;
			
		try{
			fr = new FileReader(fileNameWithPath);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null)
			{
			System.out.println(""+line);
			line = br.readLine();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		finally
		{
			try{
				if(br!=null)
				{
				br.close();	
				}
				if(fr!=null)
				{
					fr.close();
				}
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		}
		}
		
}


