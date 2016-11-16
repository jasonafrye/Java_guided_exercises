/* 
Try this 1-2

Self-test program modificaiton

Call this program "GalToLitTable2.java"
*/

class GalToLitTable2 {
	public static void main(String args[]) {
		double inches, meters;
		int counter = 0;
				for(inches=1; inches<= 36; inches++){
			meters = inches / 39.37; // convert to meters
			System.out.println(inches + " inches is " + meters + "meters." );
			counter++;
			//every 10th line, print a blank line
			if (counter == 12) {
				System.out.println();
				counter = 0; //reset the line counter
			}
		}
	}
}

	