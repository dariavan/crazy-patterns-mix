package patterns;

abstract class GameBuilder {
	protected Game game;

	public Game getGame() {
		return game;
	}

	public void createNewGameChess() {
		game = new Chess();
	}

	public void createNewGameMonopoly() {
		game = new Monopoly();
	}

	public abstract void buildPlayers();

	public abstract void buildPrizes();

}