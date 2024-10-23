package exercises;

public class ReturnArgumentsAddedUp{

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("Invalid arguments");
			System.exit(-1);
		}
		
		try {
			
			int number1 = Integer.parseInt(args[0]), number2 = Integer.parseInt(args[1]);
			
			int result = number1 + number2;
			
			System.out.println("Result: " + result);
			
			System.exit(result);
			
		} catch (NumberFormatException e) {
			System.out.println("Invalid numbers");
		}
		
		
	}

}
