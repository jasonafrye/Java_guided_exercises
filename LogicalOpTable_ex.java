/* Try This 2-2: a truth table for logical operators. 
*/

class LogicalOpTable_ex{
	public static void main(String args[]){
		int p, q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		// TRUE/TRUE
		p=1;
		q=0;
		
		System.out.print((p=1) + "\t" + (q=1) + "\t");
		System.out.print(((p=1)&(q=1)) + "\t" + ((p=1)|(q=1)) + "\t");
		//System.out.println(((p=1)^(q=1)) + "\t" + !(p=1) );
		
		/*
		//TRUE/FALSE
		p= (boolean) true;
		q= (boolean) false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) );
		
		//FALSE/TRUE
		p= (boolean) false;
		q= (boolean) true;
		if (p){
			p = (int) 1;
		} else {
			p = (int) 0;
		}
		if (q) {
			q = (int) 1;
		} else {
			q = (int) 0;
		}	
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) );
		
		//FALSE/FALSE
		p= (boolean) false;
		q= (boolean) false;
		if (p){
			p = (int) 1;
		} else {
			p = (int) 0;
		}
		if (q) {
			q = (int) 1;
		} else {
			q = (int) 0;
		}	
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) );
		*/
	}
}
