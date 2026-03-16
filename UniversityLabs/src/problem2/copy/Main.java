package problem2.copy;

public class Main {

	public static void main(String[] args) {
		Position p1 = new Position(3, 2);
		Position p2 = new Position(3, 4);
		Piece rook = new Pawn(p1, true);
		System.out.print(rook.isLegalMove(p2));
	}

}
