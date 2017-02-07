package com.syntel.training;

public class DayTwoString {

	public static void main(String[] args) {
		Bean1 beanObj1 = new Bean1();
		Bean2 beanObj2 = new Bean2();
		beanObj1.setName("Ravi");
		beanObj2.setName("Ravi");
		
		String a = "Hi";
		String b = "Hi";
		String c = new String("Hi");
		String d = new String("Hi").intern();
		int [] num = {1,2,3,4,5};  //defining Array
		String [] names = {"James","Peter","Rob","Tom"};
    System.out.println("(a == b) " + (a==b));
    System.out.println("(a == c) " + (a==c));
    System.out.println("(a == d) " + (a==d));
    System.out.println("a =" + a.toUpperCase());
    
    for(int k : num) {
    	System.out.println(k);
    }
    for(String name : names)
    {
    	System.out.print(name);
    	if (!name.equals("Tom"))
    		System.out.print(",");
    		
    }
	}

}
