import java.util.Scanner;
public class GambalingChallangeGame 
{
	static int totalDice=0;
	public static int main(String[] args) 
	{
		boolean gameContinue = true;
		int money = 100;
		while (gameContinue==true);
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println(" you have " + money + " dollars to gamble how much would you like to bet in this game of chance?");
		int gambled = userInput.nextInt();
		{
			if(gambled > money)
			{
				System.out.println("You cant bet that much!");
			}
			else if (gambled < 0)
			{
				System.out.println("Just don't");
			}
			else
			{
				System.out.println(" you have gambled " + gambled + " dollars lets see if you win anything.");
				{
					for(int i = 0; i < 5; i++)						
					{
						int dieRoll=(int)(Math.random()*5)+1;
						totalDice= total + dieRoll;
					}
				return totalDice;
						money=money-gambled;
						System.out.println("");
					}
					
				}
			}
			
			
			
		}
		}
		


	}


