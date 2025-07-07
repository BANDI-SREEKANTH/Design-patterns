package lldexamples.tictactoe;

// GameState Interface
public interface GameState {
    void next(GameContext context, Player player , boolean hasWon);
    boolean isGameOver();
}
