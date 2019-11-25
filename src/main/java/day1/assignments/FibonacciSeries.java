package day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Fibonacci series is sum of the previous 2 numbers.
	 * 2) Assign values for the first 2 numbers and set range.
	 * 3) ++i increments the value before the initializing the value 
	 *  whereas i++ initialize the value and then increments the value of the variable. 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int firstNum=0, secondNum=1, range = 8;
		// Iterate from 1 to the range
		for (int i=1; i<=range; ++i)
		{
			System.out.println(firstNum);
			
			int sum= firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
		}
		// Print first number 
		// add first and second number
		// Assign second number to the first number
		// Assign sum to the second number
	}

}
