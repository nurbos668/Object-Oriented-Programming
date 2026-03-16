package problem2.copy;

public abstract class Piece {
	protected Position a;
	protected boolean isWhite;
	protected boolean hasMoved;
	
	public Piece(Position p, boolean isWhite) {
		this.a = p;
		this.isWhite = isWhite;
		this.hasMoved = false;
	}
	public abstract boolean isLegalMove(Position b);
	
	
		
}
 