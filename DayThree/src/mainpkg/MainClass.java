package mainpkg;

public class MainClass {

	public static void main(String[] args) {
  Student S1 = new Student ();
  Student S2 = new Student (18);
  Student S3 = new Student ("Kumar",2003);
  System.out.println();
  
  Truck truck = new Truck();
  truck.start();
  FireTruck ft = new FireTruck();
  
//	System.out.println("Number of Wheels in Car - " +car.numOfWheels);
//	System.out.println("Number of Seats in Car - " +car.numOfSeats);
//	System.out.println("Number of Length in Car - " +car.length);
//	System.out.println("Number of Height in Car - " +car.hight);
	}

}
