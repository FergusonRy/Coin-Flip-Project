import java.util.Scanner;
public class gambalingProject 
{
	static int diceTotal;
	static Scanner userInput = new Scanner(System.in);
	static int money = 100;

	public static void main(String[] args) 
		{
		greetPlayer();
		money();
		gamble();
		}		
	public static void greetPlayer()
		{
		System.out.println("hello what is your name?");
		String name = userInput.nextLine();
		System.out.println(" Hello " + name + "!");
		}
	public static void money()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println(" you have " + money + " dollars to gamble how much would you like to bet in this game of chance?");
		}
	public static void gamble()	
		{
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
						if (money=money-gambled)
						{
							System.out.println("lol you lost.");
						}
						else if (money=money + gambled)
						{
							System.out.println("you won!")
						}
	
						
					}
						
		}
		

}
