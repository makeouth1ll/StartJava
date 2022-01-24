

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 10);
 		Scanner console = new Scanner(System.in);

 		System.out.println("Game has been started!");
		System.out.print("Input the number: ");
		int userInput = console.nextInt();

		while (userInput != number) {
			System.out.println("You missed! Try again.");
			System.out.println(number);
			userInput = console.nextInt();
		}

		if (userInput == number) {
			System.out.println("You're right! Game over.");
		}

	}
}