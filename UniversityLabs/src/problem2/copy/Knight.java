package problem2.copy;

public class Knight extends Piece{

	public Knight(Position p, boolean isWhite) {
		super(p, isWhite);
	}

	@Override
	public boolean isLegalMove(Position b) {
		int x1 = Math.abs(a.x - b.x);
		int y1 = Math.abs(a.y - b.y);
		return (x1 == 2 && y1 == 1) || (x1 == 1 && y1 == 2);
	}

}
