package problem2;

public class Pawn extends Piece{

	public Pawn(Position p, boolean isWhite) {
		super(p, isWhite);
	}

	@Override
	public boolean isLegalMove(Position b) {
		int direction = isWhite ? 1 : -1;
		int start = isWhite ? 2 : 7;
		
		int x1 = b.x  - a.x;
		int y1 = b.y - a.y;
		
		if (x1 == 0 && y1 == direction) {
			return true;
		}
		
		if (x1 == 0 && y1 == 2 * direction && a.y == start) {
			return true;
		}
		
		if (Math.abs(x1) == 0 && y1 == direction) {
			return true;
		}
		return false;
	}

}
