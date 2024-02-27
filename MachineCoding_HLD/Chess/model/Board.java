package MachineCoding_HLD.Chess.model;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private int boardSize;
    private Cell[][] cells;

    /**
     * Helper method to return cell to the left of current cell.
     */
    public Cell getLeftCell(Cell cell) {
        return getCellAtLocation(cell.getX(), cell.getY() - 1);
    }

    /**
     * Helper method to return cell to the right of current cell.
     */
    public Cell getRightCell(Cell cell) {
        return getCellAtLocation(cell.getX(), cell.getY() + 1);
    }

    /**
     * Helper method to return cell to the up of current cell.
     */
    public Cell getUpCell(Cell cell) {
        return getCellAtLocation(cell.getX() + 1, cell.getY());
    }

    /**
     * Helper method to return cell to the down of current cell.
     */
    public Cell getDownCell(Cell cell) {
        return getCellAtLocation(cell.getX() - 1, cell.getY());
    }

    /**
     * Helper method to return cell at a given location.
     */
    public Cell getCellAtLocation(int x, int y) {
        if (x >= boardSize || x < 0) {
            return null;
        }
        if (y >= boardSize || y < 0) {
            return null;
        }

        return cells[x][y];
    }



}
