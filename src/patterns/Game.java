package patterns;

public abstract class Game implements IComponent {

	public int playersAmount;
	private String prize;
	private String scores;

	protected abstract void initializeGame();
	protected abstract void playGame();
	protected abstract void endGame();
	protected abstract void printWinner();

	public final void playOneGame() {
		initializeGame();
		playGame();
		endGame();
		printWinner();
	}

	public abstract void accept(IVisitor v);

	public String getScores() {
		return scores;
	}

	public void setScores(String scores) {
		this.scores = scores;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public void setPlayersAmount(int playersAmount) {
		this.playersAmount = playersAmount;
	}

	public int getPlayersAmount() {
		return playersAmount;
	}

	public String getPrize() {
		return prize;
	}
}