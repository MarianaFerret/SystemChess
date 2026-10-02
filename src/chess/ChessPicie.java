package chess;

import boardgame.Bord;
import boardgame.Picie;

public class ChessPicie extends Picie {

    private Color color;

    public ChessPicie(Bord bord, Color color) {
        super(bord);
        this.color = color;
        
    }

    public Color getColor(){
        return color;
    }
    
}
