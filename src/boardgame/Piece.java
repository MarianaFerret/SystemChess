package boardgame;

import boardgame.Position;

public abstract class  Piece {
    
    protected Position position;
    private Board bord;

    public Piece(Board bord) {
        this.position = null;
        this.bord = bord;
    }

    protected Board getBoard(){
        return bord;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; i++){
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
