package problem2;

public class Queen extends Piece{

	public Queen(Position p, boolean isWhite) {
		super(p, isWhite);
	}

	@Override
	public boolean isLegalMove(Position b) {
		boolean diagMove = (Math.abs(a.x - b.x) == Math.abs(a.y - b.y));
		boolean strMove = (a.x == b.x || a.y == b.y);
		
		return diagMove || strMove;
	}

}
