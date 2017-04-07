package patterns;

public class Chess extends Game {
	private int playersAmount;
	private String prize;

	public void accept(IVisitor v) {
		v.visit(this);
	}

	@Override
	protected void initializeGame() {
	}

	@Override
	protected void playGame() {
	}

	@Override
	protected void endGame() {
	}

	@Override
	protected void printWinner() {
	}

	@Override
	public void setPlayersAmount(int num) {
	}

	@Override
	public void print() {
	}
}