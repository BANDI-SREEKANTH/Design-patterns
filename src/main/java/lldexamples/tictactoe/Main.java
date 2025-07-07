package lldexamples.tictactoe;

// The main method serves as the entry point for the Tic-Tac-Toe game
// application. It initializes the player strategies and starts the game.
public class Main {
    public static void main(String[] args) {
        PlayerStrategy playerXStrategy = new HumanPlayerStrategy("Player X");
        PlayerStrategy playerOStrategy = new HumanPlayerStrategy("Player O");
        TicTacToeGame game = new TicTacToeGame(playerXStrategy, playerOStrategy, 3, 3);
        game.play();
    }
}