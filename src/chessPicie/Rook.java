package chessPicie;

import boardgame.Bord;
import chess.ChessPicie;
import chess.Color;

public class Rook extends ChessPicie{

    public Rook(Bord bord, Color color) {
        super(bord, color);
        
    }

    @Override 
    public String toString(){
        return " R";
    }
    
}
