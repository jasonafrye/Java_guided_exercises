/* set up simple help menu 
this exercise displays the functions of Use Case

let's do this*/

class Help{
	public static void main(String args[])
		throws java.io.IOException {
		System.out.println("Help on:\n 1. if\n 2. switch\nChoose One: ");
		char choice = (char) System.in.read();
		
		switch(choice){
			case '1': 
			System.out.println("The if: \n if(condition) statement;\n else statement;");
			break;
			case '2':
			System.out.println("The switch: \n switch (expression) { \n  case constant: \n   statement sequence	\n    break;\n  //  ...\n }");
			break;
			default:
			System.out.println("Nope!");
		}
	}
}