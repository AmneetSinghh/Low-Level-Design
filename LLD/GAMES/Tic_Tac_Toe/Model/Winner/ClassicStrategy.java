package LLD.GAMES.Tic_Tac_Toe.Model.Winner;

class ClassicStrategy implements WinnerStrategy{

    @Override
    public Boolean isWinner(int row, int col) {
        /*
         * check every row col and diaganol
         * row , col , diaganol somewhere eqquals to same playingPIece
         */
        return null;
    }
}

//    public boolean isThereWinner(int row, int column) {
//
//        boolean rowMatch = true;
//        boolean columnMatch = true;
//        boolean diagonalMatch = true;
//        boolean antiDiagonalMatch = true;
//
//        // match all equal
//        for(int i=0;i<gameBoard.size;i++) {
//
//            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
//                rowMatch = false;
//            }
//        }
//
//        //need to check in column
//        // match all equal
//        for(int i=0;i<gameBoard.size;i++) {
//
//            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
//                columnMatch = false;
//            }
//        }
//
//        //need to check diagonals
//        // match all equal
//        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
//            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
//                diagonalMatch = false;
//            }
//        }
//
//        //need to check anti-diagonals
//        // match all equal
//        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
//            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
//                antiDiagonalMatch = false;
//            }
//        }
//
//        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
//    }