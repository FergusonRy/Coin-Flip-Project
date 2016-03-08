import java.util.Scanner;

public class ForLoopChallange5 
{

	public static void main(String[] args) 
	{
		int sum=0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please choose a number to start multiplying from.");
		
		int lowerBound = userInput.nextInt();
		
		System.out.println("Please choose a number to stop multiplying at.");
		
		int upperBound = userInput.nextInt();
		
		for(int i = lowerBound; i <= upperBound; i=i+1)
		{
			sum=sum+i;
			System.out.println(sum);
		}

	}

}
