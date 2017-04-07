package patterns;

public class ConcreteProductChess extends Product {
	public String playersAmount;
	public String prize;

	public void setPlayersAmount(String playersAmount) {
		this.playersAmount = playersAmount;
	}

	public String getPlayersAmount() {
		return playersAmount;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getPrize() {
		return prize;
	}
}
