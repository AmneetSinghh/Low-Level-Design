package LLD.GAMES.Tic_Tac_Toe;

public interface TicTocGameI {
    public void initializeGame();
    /*
     * Initialize players and board
     */

    public void startGame();
    /*
     * Choose player from dequeue
     * check free cells
     * add piece into board
     * check winner.
     */
}
