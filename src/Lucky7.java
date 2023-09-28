import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		String startPlaying;
		String keepPlaying;
		int num1;
		int num2;
		int num3;
		int money;
		
		System.out.println("Hello. Welcome to play Lucky7.");
		System.out.println("Are you ready to play, y/n?");
		startPlaying = in.nextLine();
		
		// if the player isn't ready to play
		// the game will not start
			if (startPlaying.equals("n"))
			{
				System.out.println("We'll be here when you're ready.");
			}
			
		// if the player is ready to play
		// the game will start
			else if (startPlaying.equals("y"))
			{
				System.out.println("Let's play!");
			
			// the game will ask how much money they want to play with
					System.out.println("How much money would you like to play with?");
					money = in.nextInt();
			
					in.nextLine();
					
				// if the player decides to play with less than 100€
				// one round costs 1€ and the winnings are 5€, 25€ and 100€
					if (money < 100)
					{
						do
						{
							money--;
							System.out.println("Rolling numbers:");
							System.out.println((num1 = r.nextInt(10)+1) + ", " + (num2 = r.nextInt(10)+1) + ", " + (num3 = r.nextInt(10)+1));

//							Use the two lines below if you want the rolled numbers on different lines
//							System.out.println(num2 = r.nextInt(10)+1);
//							System.out.println(num3 = r.nextInt(10)+1);
								if (num1 == 7 && num2 == 7 && num3 == 7)
									{
									System.out.println("You won 100€");
									money += 100;
									}
								else if (num1 == 7 && num2 == 7 || num1 == 7 && num3 == 7 || num2 == 7 && num3 == 7)
									{
									System.out.println("You won 25€");
									money += 25;
									}
								else if (num1 == 7 | num2 == 7 || num3 == 7)
									{
									System.out.println("You won 5€");
									money += 5;
									}
								else 
									{
									System.out.println("You lost.");
									}
							
								if (money == 0)
								{
									System.out.println("You don't have any money to play with!");
									break;
								}
								
							System.out.println("You have " + money + "€");
							
							System.out.println("Do you want to continue playing? y/n");
							keepPlaying = in.nextLine();
							
							
						}while (keepPlaying.equals("y"));
						
						System.out.println("Thanks for playing!");
					}
						
					// if the player decides to play with 100€ or more
					// one round costs 5€ and the winnings are 15€, 75€ and 150€
					else
					{
							do
							{
								money -= 5;
								System.out.println("Rolling numbers:");
								System.out.println(num1 = r.nextInt(10)+1);
								System.out.println(num2 = r.nextInt(10)+1);
								System.out.println(num3 = r.nextInt(10)+1);
									if (num1 == 7 && num2 == 7 && num3 == 7)
										{
										System.out.println("You won 150€");
										money += 150;
										}
									else if (num1 == 7 && num2 == 7 || num1 == 7 && num3 == 7 || num2 == 7 && num3 == 7)
										{
										System.out.println("You won 75€");
										money += 75;
										}
									else if (num1 == 7 | num2 == 7 || num3 == 7)
										{
										System.out.println("You won 15€");
										money += 15;
										}
									else 
										{
										System.out.println("You lost.");
										}
								
									if (money == 0)
									{
										System.out.println("You don't have any money to play with!");
										break;
									}
									
								System.out.println("You have " + money + "€");
								
								System.out.println("Do you want to continue playing? y/n");
								keepPlaying = in.nextLine();
								
								
							}while (keepPlaying.equals("y"));
							
							System.out.println("Thanks for playing!");
						}
					}
			
				// if the player doesn't answer either y or n
				// the game will not start
				else 
				{
		            System.out.println("Invalid input. We'll be here when you're ready.");
		        }
						
				}	
			}
				