package boardgame;

import boardgame.Position;

public class Picie {
    
    protected Position position;
    private Bord bord;

    public Picie(Bord bord) {
        this.position = null;
        this.bord = bord;
    }

    protected Bord getBord(){
        return bord;
    }

}
