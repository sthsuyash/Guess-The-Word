package game;

import java.util.Scanner;

public class GuessTheWord {
	private boolean play = true;
	private Words randomWord = new Words();
	private Scanner scan = new Scanner(System.in);
	
	public void start() {
		do {
			showWord();
			getInput();
			checkInput();
		} while (play);
	}
	
	void showWord() {
		System.out.println(randomWord);
	}
	
	void getInput() {
		System.out.print("Enter a letter to guess the word: ");
		String userGuess = scan.nextLine();
		char letter;
		
		// get first character from user input
		randomWord.guess(userGuess.charAt(0));
	}
	
	void checkInput() {
		System.out.println("check Input");
	}
	
	public void end() {
		scan.close();
	}
}
