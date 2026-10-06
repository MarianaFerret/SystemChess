package boardgame;

public class Bord {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Bord(int rows, int columns){
        if(rows < 1 || columns < 1){
            throw new BordExepction("Erro ao criar tabuleiro: o tabuleiro precisa ter pelo menos 1 linha e 1 coluna");
        }

        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];

    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public Piece piece(int rows, int columns){
        if(!PositionExists(rows, columns)){
            throw new BordExepction("A posição não existe no tabuleito");
        }
        return pieces[rows][columns];
    }

    public Piece piece(Position position){
        if(!PositionExists(position)){
            throw new BordExepction("A posição não existe no tabuleito");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(ThereIsAPiece(position)){
            throw new BordExepction("já existe uma peça nessa posição");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

     public boolean PositionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
     }

    public boolean PositionExists(Position position){
        return PositionExists(position.getRow(), position.getColumn());

    }

    public boolean ThereIsAPiece(Position position){
        if(!PositionExists(position)){
            throw new BordExepction("A posição não existe no tabuleito");
        }
        return piece(position) != null;
    }
}
