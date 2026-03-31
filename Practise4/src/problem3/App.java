package problem3;

public class App {
	
	public void getStatistics(Game g) {
		g.a();
		g.b();
		g.c();
		if (g instanceof IGame) {
			((IGame)g).d();
		}
	}
}
