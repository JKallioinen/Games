
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        
		String name = "Emma";
		String guess;
		int count = 0;
		
		do
		{
		
			System.out.println("Guess my name (type stop to exit)");
			guess = in.nextLine();
			
			if (guess.equals(name))
			{
				count++;
				System.out.println("Congratulations!");
				System.out.println("You guessed " + count + " times.");
				break;
			}
			else if (guess.equals("stop"))
			{
				System.out.println("You guessed " + count + " times.");
				break;
			}
			else
			{
				count++;
			}
		}while (guess != name);
	}
}
