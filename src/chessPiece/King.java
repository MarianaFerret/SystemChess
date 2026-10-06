package chessPiece;

import boardgame.Bord;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Bord bord, Color color) {
        super(bord, color);
        //TODO Auto-generated constructor stub
    }

    @Override 
    public String toString(){
        return " K";
    }
    
}
