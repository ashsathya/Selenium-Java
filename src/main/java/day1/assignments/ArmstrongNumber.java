package day1.assignments;

public class ArmstrongNumber {

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153 output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a While loop, type 'while' followed by: ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) Armstrong number is sum of cubes of
	 * each digit is actual digit. Example = 1*1*1 + 5*5*5 + 3*3*3 =1 + 125+27 =
	 * 153. 
	 * 2) "/=" - operator is used to perform divide operation and assign it to the variable. 
	 * 3)
	 * 
	 */

	// Assign input into variable original
	// Use loop to calculate: which loop to use until the number greater than 0??
	// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
	// Within loop: get the quotient when done by 10 (Tip: Assign the result to
	// input)
	// Within loop: Add calculated with the cube of remainder & assign it to
	// calculated
	// Check whether calculated and original are same
	// When it matches print it as Armstrong number
	public static void main(String[] args) {

		int num = 153, number, temp, total = 0;

		number = num;
		while (number != 0) {
			temp = number % 10;
			total = total + temp * temp * temp;
			number /= 10;
		}

		if (total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}
}