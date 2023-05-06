package ticTacToe;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Match match = new Match();
		int turns = 0;
		char turn = 'X';
		String winner = null;
		
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println();
		match.printPositions();
		match.printBoard();
		while (winner == null){
			if (turns == 9) {
				System.out.println("Draw!");
				break;
			}
			System.out.println("Turn: " + turn);
			System.out.print("Choose the position you want: ");
			int chosenPosition = sc.nextInt();
			match.placeAndPrint(chosenPosition, turn);
			winner = match.checkWinner();
			if (turn == 'X') {
				turn = 'O';
			} else {
				turn = 'X';
			}		
			turns++;
			
		}	System.out.printf("%s won!", winner, turns); 
		
		sc.close();
	}
}
