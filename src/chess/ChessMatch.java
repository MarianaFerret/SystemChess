package chess;

import boardgame.Bord;
import boardgame.Position;
import chessPiece.King;
import chessPiece.Rook;

public class ChessMatch {

    private Bord bord;

    public ChessMatch(){
        bord = new Bord(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[bord.getRows()][bord.getColumns()];
        for(int i = 0; i < bord.getRows(); i++){
            for(int j = 0; j <bord.getColumns(); j++){
                mat[i][j] = (ChessPiece) bord.piece(i, j);
            }
        }

        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece picie){
        bord.placePiece(picie, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('a', 1, new Rook(bord, Color.WHITE));
        placeNewPiece('e', 1, new King(bord, Color.WHITE));

        placeNewPiece('a', 8, new Rook(bord, Color.BLACK));
        placeNewPiece('e', 8, new King(bord, Color.BLACK));
    }
    
}
