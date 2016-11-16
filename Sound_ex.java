/*
Try This 2-1
Compute the distance to a lightning strike who sound takes 7.2 seconds to reach you.
*/

class Sound_ex{
	public static void main(String args[]){
		double echo = 6.9; //echo timing (to object and back)
		double echo_one_way = echo / 2; //time (one way trip)
		double dist = echo_one_way * 1100; // time * feet per second 
				
		System.out.println("The strange sound is " + dist + " feet away from your face!");
		System.out.println("RUN, SON....RUN!!!!!");
	}
}
