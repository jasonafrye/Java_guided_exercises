//vehicle demo to illustrate objects
//let's do this

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
}


class VehicleDemo{
	public static void main(String args[]){
	Vehicle minivan = new Vehicle();
	int range;
	
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	
	range = minivan.fuelcap * minivan.mpg;
	System.out.println("This is my minivan! It can hold " + 7 + " passengers, and has a range of " + range + "mi!");
	}
}
