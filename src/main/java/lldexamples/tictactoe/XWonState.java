package lldexamples.tictactoe;

// Concrete State: XWonState
public class XWonState implements GameState {
    @Override
    public void next(GameContext context, Player player , boolean hasWon) {
        // Game over, no next state
    }
    @Override
    public boolean isGameOver() {
        return true;
    }
}