import java.util.Scanner;

public class TicTacToe {
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String[][] board = new String[ROW][COL];
    private static Scanner in = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        boolean playAgain;
        do {
            clearBoard();
            playGame();
            playAgain = SafeInput.getYNConfirm(in, "Do you want to play again?");
        } while (playAgain);
    }
    // Clears board for new game
    private static void clearBoard() {
        for (int row = 0; row < ROW; row++)
        {
            for (int col = 0; col < COL; col++)
            {
                board[row][col] = " ";
            }
        }
    }
    // Displays TicTacToe Board
    private static void display() {
        System.out.println("  1 2 3");
        for (int row = 0; row < ROW; row++)
        {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < COL; col++)
            {
                System.out.print(board[row][col]);
                if (col < COL - 1)
                {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < ROW - 1)
            {
                System.out.println("  -----");
            }
        }
    }
    // Helper Method
    private static boolean isValidMove(int row, int col) {
        return board[row][col].equals(" ");
    }
    // Helper Method
    private static boolean isWin(String player) {
        return isRowWin(player) || isColWin(player) || isDiagonalWin(player);
    }
    // Helper Method
    private static boolean isRowWin(String player) {
        for (int row = 0; row < ROW; row++) {
            if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player))
            {
                return true;
            }
        }
        return false;
    }
    // Helper Method
    private static boolean isColWin(String player) {
        for (int col = 0; col < COL; col++)
        {
            if (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player))
            {
                return true;
            }
        }
        return false;
    }
    // Helper Method
    private static boolean isDiagonalWin(String player) {
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player))
        {
            return true;
        }
        if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))
        {
            return true;
        }
        return false;
    }
    // Helper Method
    private static boolean isTie() {
        for (int row = 0; row < ROW; row++)
        {
            for (int col = 0; col < COL; col++)
            {
                if (board[row][col].equals(" "))
                {
                    return false;
                }
            }
        }
        return true;
    }
    // User input & Game results
    private static void playGame() {
        String currentPlayer = "X";
        boolean gameWon = false;
        boolean gameTied = false;

        while (!gameWon && !gameTied) {
            display();
            int rowMove = SafeInput.getRangedInt(in, "Enter row (1-3) for " + currentPlayer + ": ", 1, 3) - 1;
            int colMove = SafeInput.getRangedInt(in, "Enter column (1-3) for " + currentPlayer + ": ", 1, 3) - 1;

            if (isValidMove(rowMove, colMove))
            {
                board[rowMove][colMove] = currentPlayer;
                gameWon = isWin(currentPlayer);
                gameTied = isTie();

                if (gameWon)
                {
                    display();
                    System.out.println("Player " + currentPlayer + " wins!");
                }
                else if (gameTied)
                {
                    display();
                    System.out.println("It's a tie!");
                }

                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
            }
            else
            {
                System.out.println("Invalid move, try again.");
            }
        }
    }
}





