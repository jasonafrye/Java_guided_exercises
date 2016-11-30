/*
This is a simple Java Program. 
Call this file Example.java
*/
class ChangeCase{
		public static void main(String args[])
		throws java.io.IOException  	{
		char choice;
		int mod = 32;
		System.out.println("Type a letter and watch magic happen!");
		do{
			
			choice = (char) System.in.read();
			if (choice >= 'A' & choice <= 'Z'){ 
				choice = (char) (choice + mod);
				System.out.print(choice);
				
			} else if (choice >= 'a' & choice <= 'z'){
				choice = (char) (choice - mod);
				System.out.print(choice);
			}
		}while (choice != '.');
	}
}

