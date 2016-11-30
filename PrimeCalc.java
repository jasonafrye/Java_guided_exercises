/* prime number calculator
more about syntax than math
let's do this
*/

class PrimeCalc{
	public static void main(String args[]){
		
		for(int i=2; i < 100; i++){ //go through each iteration
		boolean isPrime = true;
		for (int div = 2; div <= i/div; div++) 
				if ((i%div)==0) isPrime=false;
					 
			if(isPrime) System.out.println(i + " is TOTALLY a prime number, son!!!!!!");
				
			
		}
	}
}


