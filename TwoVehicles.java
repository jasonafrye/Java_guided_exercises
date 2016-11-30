//vehicle demo to illustrate objects
//let's do this

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	int range;
}


class TwoVehicles{
	public static void main(String args[]){
	Vehicle minivan = new Vehicle();
	Vehicle truck = new Vehicle();
		
	minivan.passengers = 7;
	minivan.fuelcap = 16;
	minivan.mpg = 21;
	minivan.range = minivan.fuelcap * minivan.mpg;
	
	truck.passengers = 2;
	truck.fuelcap = 20;
	truck.mpg = 32;
	truck.range = truck.fuelcap * truck.mpg;
	//	range = minivan.fuelcap * minivan.mpg;
	System.out.println("This is my minivan! It can hold " + minivan.passengers + " passengers, and has a range of " + minivan.range + "mi!");
	System.out.println("This is my truck! It can hold " + truck.passengers + " passengers, and has a range of " + truck.range + "mi!");
	}
}
