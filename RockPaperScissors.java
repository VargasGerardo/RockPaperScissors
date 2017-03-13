package week04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Random random = new Random();//Random number generator
		
		Scanner scanner = new Scanner(System.in);
		//Scanner object for input
		
	/*
	 * Integer values needed to hold user and computer input
	 * 0 = Rock
	 * 1 = Paper
	 * 2 = Scissors
	 * 
	 */
	int userChoice, computerChoice;
	
	//Prompt and user input
	System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Scissors;");
	userChoice = scanner.nextInt();
	
	//Check if userChoice input is 0,1,0 using conditions
	if(userChoice < 0 || userChoice > 2)
	{
		System.out.println("Invalid choice. Ending program.");
		System.exit(0);
	}
	
	//Generating random computer choice
	computerChoice = random.nextInt(3);
	
	//Determining the winner
	
	//If both the user and computer inputs are the same results in a tie
	if(userChoice == computerChoice)
	{
		if(userChoice == 0) 
		{
			System.out.println("Both player chose Rock!");
		}
		else if(userChoice == 1)
		{
			System.out.println("Both players chose Paper!");
		}
		else
		{
			System.out.println("Both players chose Scissors!");
		}
		
		//Therefore exit the program
		System.exit(0);
	}

	//User chooses Rock
	if(userChoice == 0)
	{
		if(computerChoice == 1)
		{
			System.out.println("You chose Rock, Computer chose Paper");
			System.out.println("Compuer Wins!");
		}
		else
		{
			System.out.println("You chose Rock, Computer chose Scissors");
			System.out.println("You Win!");
		}
	}
	
	//User chooses Paper
	if(userChoice == 1)
	{
		if(computerChoice == 0)
		{
			System.out.println("You chose Paper, Computer chose Rock");
			System.out.println("You Win!");
		}
		else
		{	
			System.out.println("You chose Paper, Computer chose Scissors");
			System.out.println("Computer Wins!");
	}
		
	//User choose Scissors
	if(userChoice == 2)
	{	
		if(computerChoice == 0) 
		{
	
		System.out.println("You chose Scissors, Computer chose Rock");
		System.out.println("Computer Wins");
	}
	else
	{
		System.out.println("You chose Scissors, Computer chose Paper");
		System.out.println("You Win");
	}
	}
		scanner.close();
	}
		
	}
}

		