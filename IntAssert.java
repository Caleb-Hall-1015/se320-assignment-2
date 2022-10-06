public class IntAssert 
{
	public static void main(String[] args)
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double userInput;
		System.out.println("Please enter a number between 0 and 10");
		
		try
		{
			userInput = scan.nextDouble();
			System.out.println(userInput);
			assert userInput >= 0  && userInput <= 10: "The entered number is out of range";
		} catch (Exception e)
		{
			System.out.println("Invalid input, please enter a number");
		}
	}
}
