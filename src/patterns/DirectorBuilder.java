package patterns;

public class DirectorBuilder {
	private GameBuilder gameBuilder;

	public void setGameBuilder(GameBuilder gb) {
		gameBuilder = gb;
	}

	public void setCheesGameBuilder(ChessGameBuilder gb) {
		gameBuilder = gb;
	}

	public Game getGame() {
		return gameBuilder.getGame();
	}

	public void constructGameMonopoly() {
		System.out.println("We are playing MONOPOLY");
		gameBuilder.createNewGameMonopoly();
		gameBuilder.buildPlayers();
		gameBuilder.buildPrizes();
	}

	public void constructGameChess() {
		System.out.println("We are playing CHESS");
		gameBuilder.createNewGameChess();
		gameBuilder.buildPlayers();
		gameBuilder.buildPrizes();
	}
}

