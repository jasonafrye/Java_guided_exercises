/* this program demonstrates if statements

IfDemo.java
*/

public class IfDemo{
public static void main(String args[]){
	int a, b, c;
a=2;
b=3;
if (a<b) System.out.println("a is less than b");

//this won't display anything
if (a == b) System.out.println("you won't see this");

System.out.println(); //NOTHING, MWAHAHAHAHAHAHAHAHA

c = a-b; // math is -1

System.out.println("c contains " + c);
if (c >=0) System.out.println("c is non-negative");
if (c < 0) System.out.println("c is negative");

System.out.println();

c = b - a; // c now contains 1

System.out.println; //c now contains 1

System.out.println ("c contains " + c);
if (c >=0) System.out.println("c is non-negative");
if (c < 0) System.out.println("c is negative");
}
}



