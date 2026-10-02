package chess;

import boardgame.Bord;

public class ChessMatch {

    private Bord bord;

    public ChessMatch(){
        bord = new Bord(8, 8);
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
    
}
