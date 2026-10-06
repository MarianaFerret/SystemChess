package boardgame;

import boardgame.Position;

public class Piece {
    
    protected Position position;
    private Bord bord;

    public Piece(Bord bord) {
        this.position = null;
        this.bord = bord;
    }

    protected Bord getBord(){
        return bord;
    }

}
