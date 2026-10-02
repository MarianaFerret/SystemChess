package chessPicie;

import boardgame.Bord;
import chess.ChessPicie;
import chess.Color;

public class King extends ChessPicie {

    public King(Bord bord, Color color) {
        super(bord, color);
        //TODO Auto-generated constructor stub
    }

    @Override 
    public String toString(){
        return " K";
    }
    
}
