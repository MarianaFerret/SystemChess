package boardgame;

public class Bord {
    
    private int rows;
    private int columns;
    private Picie[][] pieces;

    public Bord(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        pieces = new Picie[rows][columns];
    }

    public int getRows(){
        return rows;
    }

    public void setRows(int rows){
        this.rows = rows;
    }

    public int getColumns(){
        return columns;
    }

    public void setColumns(int columns){
        this.columns = columns;
    }

    public Picie picie(int rows, int columns){
        return pieces[rows][columns];
    }

    public Picie picie(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
