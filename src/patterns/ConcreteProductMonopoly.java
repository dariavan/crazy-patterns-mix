package patterns;

public class ConcreteProductMonopoly extends Product {
	public int playersAmount;
	public String prize;

	public void setPlayersAmount(int playersAmount) {
		this.playersAmount = playersAmount;
	}

	public int getPlayersAmount() {
		return playersAmount;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getPrize() {
		return prize;
	}
}
