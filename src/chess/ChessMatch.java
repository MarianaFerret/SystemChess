package chess;

import boardgame.Bord;
import boardgame.Position;
import chessPicie.King;
import chessPicie.Rook;

public class ChessMatch {

    private Bord bord;

    public ChessMatch(){
        bord = new Bord(8, 8);
        initialSetup();
    }

    public ChessPicie[][] getPieces(){
        ChessPicie[][] mat = new ChessPicie[bord.getRows()][bord.getColumns()];
        for(int i = 0; i < bord.getRows(); i++){
            for(int j = 0; j <bord.getColumns(); j++){
                mat[i][j] = (ChessPicie) bord.picie(i, j);
            }
        }

        return mat;
    }

    private void placeNewPicie(char column, int row, ChessPicie picie){
        bord.placePicie(picie, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPicie('b', 6, new Rook(bord, Color.WHITE));
        placeNewPicie('e', 8, new King(bord, Color.BLACK));
        placeNewPicie('e',1,  new King(bord, Color.WHITE));
    }
    
}
