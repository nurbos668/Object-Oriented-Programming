package problem2.copy;

public class Rook extends Piece{

	public Rook(Position p, boolean isWhite) {
		super(p, isWhite);
	}

	@Override
	public boolean isLegalMove(Position b) {
		return (b.x == a.x || b.y == a.y);
	}

}
