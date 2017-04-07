package patterns;

public class ChessGameBuilder extends GameBuilder {

	@Override
	public void buildPlayers() {
		int i = 2;
		game.setPlayersAmount(i);
		System.out.println("The amount of players equels " + i);
	}

	@Override
	public void buildPrizes() {
		game.setPrize("medal");
		System.out.println("Prize is a " + game.getPrize());
	}
}