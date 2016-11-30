/* write a program that resd cahractes from the keybnoard until a period is received.
have the program count the number of spaces and report the total at the end

Let's do this
*/

class SpaceCounter{
	public static void main(String args[])
		throws java.io.IOException{
		char choice, ignore;
		int space = 0;
		
		System.out.println("Hey man! Pick a letter, any letter... q to quit:  ");
		do {
			choice = (char) System.in.read();
			if (choice == ' ') space++;
		} while (choice != 'q'); 
		System.out.println("Total number of spaces for chumps = " + space);
	}
}
