package boardgame;

public class BoardExepction extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BoardExepction(String msg){
        super(msg);
    }
}
