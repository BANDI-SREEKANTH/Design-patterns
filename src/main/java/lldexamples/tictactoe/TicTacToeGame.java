package lldexamples.tictactoe;

// Initializes the game board and players with their respective strategies.
// Sets the current player to playerX. can be set to playerO as well
// TicTacToe.java
public class TicTacToeGame implements BoardGames {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameContext gameContext;

    /*
    For extensibilty i have more than 2 players then i will maintain all players in the list
    private List<Player> players;
    public TicTacToe(List<PlayerStrategy> strtagies)
    {
        board=new Board();
        players=new ArrayList<>();
        Players.add(new Player(Symbol.X, strtagies.get(0)));
        Players.add(new Player(Symbol.X, strtagies.get(1)));
        currentPlayer=0; starts from first player from players list
    }
     */
    // Initializes the game board and players with their respective strategies.
    // Sets the current player to playerX. can be set to playerO as well
    public TicTacToeGame(PlayerStrategy xStrategy, PlayerStrategy oStrategy,
                         int rows, int columns) {
        board = new Board(rows, columns);
        playerX = new Player(Symbol.X, xStrategy);
        playerO = new Player(Symbol.O, oStrategy);
        currentPlayer = playerX;
        gameContext = new GameContext();
    }
    @Override
    // Loop continues until the game state indicates that the game is over.
    public void play() {
        do {
            // print the current state of the game
            board.printBoard();
            // current player makes the move
            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());
            // checks game state for win/draw
            board.checkGameState(currentPlayer,gameContext);
            switchPlayer();
        } while (!gameContext.isGameOver());
        announceResult();
    }
    // Alternates the current player after each move.
    // Ensures both players take turns
    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }
    // Displays the outcome of the game based on the final game state.
    private void announceResult() {
        GameState state = gameContext.getCurrentState();
        if (state instanceof XWonState) {
            System.out.println("Player X wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}