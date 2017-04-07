package patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonopolyGameBuilder extends GameBuilder {

	@Override
	public void buildPlayers() {
		int playersAmount = 0;
		String text = null;
		BufferedReader br1 = new BufferedReader(
				new InputStreamReader(System.in)); // decorator
		System.out.println("Enter the amount of players:");
		try {
			text = br1.readLine();
		} catch (IOException e) {
		}
		playersAmount = Integer.parseInt(text);
		System.out.println("The amount of players equels " + playersAmount);
		if (playersAmount > 6)
			System.out
					.println("Better go outside and enjoy the fresh air! Or get some people out of here!");

		game.setPlayersAmount(playersAmount);
	}

	@Override
	public void buildPrizes() {
		game.setPrize("The prize is respect from the other players! Be grateful for that");
		System.out.println(game.getPrize());
	}
}