package day1.classroom;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 
	 *  1) Factorial is product of the all the integers. 5! = 5*4*3*2*1 = 120
	 *  2) Using "for" loop iterate the given number in the increasing value. 
	 *  3) Initially fact value will be 1. After 1st iteration = 1*2*3*4*5 = 120!
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number
		int input = 5;
		// Declare and initialize an integer variable by name: fact
		int fact = 1;
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <= input; i++) 
		{
			fact = fact * i;
		}
		System.out.println(fact);
		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
		// the 'fact' variable)
		// End of loop
		// Print factorial (fact)
	}

}
