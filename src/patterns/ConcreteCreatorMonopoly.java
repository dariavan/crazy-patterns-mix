package patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcreteCreatorMonopoly extends Creator {

	ConcreteProductMonopoly productMonopoly = new ConcreteProductMonopoly();
	Game game;

	@Override
	public Product factoryMethod() {
		GamesManager.game = new Monopoly();
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

		productMonopoly.setPlayersAmount(playersAmount);
		System.out.println("Number of players: " + productMonopoly.getPlayersAmount());
		productMonopoly.setPrize("no prize lol");
		System.out.println(productMonopoly.getPrize());
		return new ConcreteProductMonopoly();
	}
}
