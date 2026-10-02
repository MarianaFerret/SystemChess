package boardgame;

public class BordExepction extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BordExepction(String msg){
        super(msg);
    }
}
