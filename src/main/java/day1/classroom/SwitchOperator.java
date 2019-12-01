	package day1.classroom;
	
	public class SwitchOperator {
	
		/*
		 * Goal: Perform calculation based on the user input operations
		 * 
		 * inputs: 2,3 and "add" output: added value: 5
		 * 
		 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
		 * create a Switch case: type 'switch', followed by: ctrl + space + down arrow +
		 * enter
		 * 
		 * What are my learnings from this code? 
		 * 1) Declare all the possible operations using switch case. 
		 * 2) Perform the required operation by passing it in the switch case. 
		 * 3) Have a default case to throw a comment if none of the operations matches. 
		 * 
		 */
	
		public static void main(String[] args) {
	
			// Declare 2 integer numbers
			// Declare a String variable with input as operations (Tip:
			// Initiate switch case for operations
			// Within switch, include as case for add operation
			// Within switch, include as case for sub operation
			// Within switch, include as case for mul operation
			// Within switch, include as case for div operation
			// Within switch, include 'default' to handle other operations
			// end of switch case
	
			int i = 2, j = 3;
			String val = "add";
			switch (val) 
			{
			case "add":
				System.out.println(i + j);
				break;
			case "sub":
				System.out.println(i - j);
				break;
			case "mul":
				System.out.println(i * j);
				break;
			case "div":
				System.out.println(i / j);
				break;
			default:
				System.out.println("Not a valid operator");
				break;
	
			}
		}
	
	}
