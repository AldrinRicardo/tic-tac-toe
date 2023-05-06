package ticTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Match match = new Match();
		int turns = 0;
		char turn = 'X';
		String winner = null;
		
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println();
		match.printPositions();
		match.printBoard();
		try {
			while (winner == null){
				if (turns == 9) {
					System.out.println("Draw!");
					break;
				}
				System.out.println("Turn: " + turn);
				System.out.print("Choose the position you want (0-8): ");
				int chosenPosition = sc.nextInt();
				match.placeAndPrint(chosenPosition, turn);
				winner = match.checkWinner();
				if (turn == 'X') {
					turn = 'O';
				} else {
					turn = 'X';
				}		
				turns++;
				
			}	System.out.printf("Winner: %s ", winner); 
		} catch (InputMismatchException e) {
			System.out.println("Invalid position! Chosse a number between 0-8 next time");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Position out of bounds! Choose a position between 0-8 next time");
		}
		sc.close();
	}
}
