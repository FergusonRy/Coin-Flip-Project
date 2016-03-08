import java.util.Scanner;
public class CoinFlipChallange1 
{

	public static void main(String[] args) 
	{
		int randomNumber =(int)(Math.random()*2)+1;
		
		System.out.println("please type in a number.");
		
		System.out.println("We will flip a coin until we reach that number.");
		
		System.out.println("Then, we will tell you how many are heads and how many are tails.");
		
		Scanner userInput = new Scanner(System.in);
		
		
		int input = userInput.nextInt();
		
		int heads = 0;
		
		int tails = 0;
		
		for (int i=1; i<=input; i++)
		{
			int flip=(int)(Math.random()*2+1);
			{
				if (flip==1)
				{
					heads = heads + 1;
				}
				else
				{
					tails = tails +1;
				}
			}
		}
		System.out.println(" there were " + heads + " heads and " + tails + " tails ");
		
	}

}
