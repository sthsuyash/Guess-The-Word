package game;

import java.util.Scanner;

public class GuessTheWord {
	private boolean play = true;
	private Words randomWord = new Words();
	private Scanner scan = new Scanner(System.in);
	private int rounds = 10;
	private char lastRound;
	
	public void start() {
		do {
			showWord();
			getInput();
			checkInput();
		} while (play);
	}
	
	void showWord() {
		System.out.printf("You have: %d try left.\n", rounds);
		System.out.println(randomWord);
	}
	
	void getInput() {
		System.out.print("Enter a letter to guess the word: ");
		String userGuess = scan.nextLine();
		lastRound = userGuess.charAt(0);
	}
	
	void checkInput() {
		// get first character from user input
		boolean isGuessedRight = randomWord.guess(lastRound);
		
		if (isGuessedRight) {
			if (randomWord.isGuessRight()) {
				System.out.println("Congratulations! You won!!");
				System.out.printf("The word is: %s", randomWord);
				play = false;
			}
		} else {
			rounds--;
			if (rounds == 0) {
				System.out.println("Game Over!!");
				play = false;
			}
		}
	}
	
	public void end() {
		scan.close();
	}
}
