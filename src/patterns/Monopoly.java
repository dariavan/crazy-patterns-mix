package patterns;

public class Monopoly extends Game {
	public int playersAmount;

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
	public void print() {
	}
}
