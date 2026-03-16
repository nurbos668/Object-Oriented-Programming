package problem2;


public class King extends Piece{
	public King(Position p, boolean isWhite) {
		super(p, isWhite);
	}	

	@Override
	public boolean isLegalMove(Position b) {
		int x1 = Math.abs(a.x - b.x);
		int y1 = Math.abs(a.y - b.y);
		return (x1 <= 1 && y1 <= 1);
	}

}
