package MachineCoding_HLD.Chess.model;

import MachineCoding_HLD.Chess.conditions.PieceCellOccupyBlocker;
import MachineCoding_HLD.Chess.enums.Color;
import MachineCoding_HLD.Chess.enums.PieceType;
import MachineCoding_HLD.Chess.model.player.Player;
import MachineCoding_HLD.Chess.moves.PossibleMovesProvider;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
public class Piece {

    private boolean isKilled = false;
    private final Color color;    // can't be changed - final
    private final List<PossibleMovesProvider> possibleMovesProviders; // can't be changed - final
    private final PieceType pieceType; // can't be changed - final
    private int numMoves;
    private Cell currentCell;// each piece on x cell.

    public Piece(Color color, List<PossibleMovesProvider> possibleMovesProviders, PieceType pieceType) {
        this.color = color;
        this.possibleMovesProviders = possibleMovesProviders;
        this.pieceType = pieceType;
    }

    public void killIt() {
        this.isKilled = true;
    }

    /**
     * Helper method to kill a piece in a given cell.
     */
    private void killPieceInCell(Cell targetCell) {
        if (targetCell.getCurrentPiece() != null) {
            targetCell.getCurrentPiece().killIt();
        }
    }

    /**
     * Method to move piece from current cell to a given cell.
     */

    public void move(Player player, Cell toCell, Board board, List<PieceCellOccupyBlocker> additionalBlockers) throws Exception {
        if (isKilled) {
            throw new Exception("Player is killed");
        }
        List<Cell> nextPossibleCells = nextPossibleCells(board, additionalBlockers, player);
        if (!nextPossibleCells.contains(toCell)) {
            throw new Exception("Invalid move exception");
        }

        killPieceInCell(toCell);
        this.currentCell.setCurrentPiece(null);
        this.currentCell = toCell;
        this.currentCell.setCurrentPiece(this);
        this.numMoves++;
    }

    public List<Cell> nextPossibleCells(Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> result = new ArrayList<>();
        for (PossibleMovesProvider movesProvider : this.possibleMovesProviders) {
            List<Cell> cells = movesProvider.possibleMovies(this,additionalBlockers,player,board);
            if (cells != null) {
                result.addAll(cells);
            }
        }
        return result;
        ///return removeDuplicates(result);
    }


    /**
     * Helper method to check if two pieces belong to same player.
     */
    public boolean isPieceFromSamePlayer(Piece piece) {
        return piece.getColor().equals(this.color);
    }
}
