package consoleApplications;
import java.util.Scanner;
public class TicTacToe {
	    static char[] board = {
	        ' ', ' ', ' ',
	        ' ', ' ', ' ',
	        ' ', ' ', ' '
	    };

	    static char currentPlayer = 'X';

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int moves = 0;

	        System.out.println("===== TIC TAC TOE =====");

	        while (true) {

	            displayBoard();

	            System.out.print("Player " + currentPlayer
	                    + ", enter position (1-9): ");

	            int position = sc.nextInt();

	            // Check valid position
	            if (position < 1 || position > 9) {
	                System.out.println("Please enter a number between 1 and 9.");
	                continue;
	            }

	            // Check position already used
	            if (board[position - 1] != ' ') {
	                System.out.println("Position already occupied!");
	                continue;
	            }

	            // Put X or O
	            board[position - 1] = currentPlayer;

	            moves++;

	            // Check winner
	            if (checkWinner()) {

	                displayBoard();

	                System.out.println("Player "
	                        + currentPlayer + " Wins!");

	                break;
	            }

	            // Check draw
	            if (moves == 9) {

	                displayBoard();

	                System.out.println("Game Draw!");

	                break;
	            }

	            // Change player
	            if (currentPlayer == 'X') {
	                currentPlayer = 'O';
	            } else {
	                currentPlayer = 'X';
	            }
	        }

	        sc.close();
	    }

	    static void displayBoard() {

	        System.out.println();

	        System.out.println(" " + board[0] + " | "
	                + board[1] + " | " + board[2]);

	        System.out.println("---+---+---");

	        System.out.println(" " + board[3] + " | "
	                + board[4] + " | " + board[5]);

	        System.out.println("---+---+---");

	        System.out.println(" " + board[6] + " | "
	                + board[7] + " | " + board[8]);

	        System.out.println();
	    }

	    static boolean checkWinner() {

	        int[][] win = {
	            {0, 1, 2},
	            {3, 4, 5},
	            {6, 7, 8},
	            {0, 3, 6},
	            {1, 4, 7},
	            {2, 5, 8},
	            {0, 4, 8},
	            {2, 4, 6}
	        };

	        for (int i = 0; i < win.length; i++) {

	            if (board[win[i][0]] == currentPlayer
	                    && board[win[i][1]] == currentPlayer
	                    && board[win[i][2]] == currentPlayer) {

	                return true;
	            }
	        }

	        return false;
	    }
}
	