package problem2.copy;

public class Bishop extends Piece{

	public Bishop(Position p, boolean isWhite) {
		super(p, isWhite);
	}

	@Override
	public boolean isLegalMove(Position b) {
		return (Math.abs(a.x - b.x) == Math.abs(a.y - b.y));
	}

}
