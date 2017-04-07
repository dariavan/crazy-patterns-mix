package patterns;

import java.awt.Composite;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GamesManager {
	public static String choice = null, choice2 = null, choice3 = null,
			creatorChoise = null, choiceEndOrNot = null;
	static DirectorBuilder directorBuilder = new DirectorBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in)); // decorator
	public static Game game;
	static Creator[] creators = { new ConcreteCreatorChess(),
			new ConcreteCreatorMonopoly() };
	static Product product;
	public Composite aGame;

	
	
	public static void main(String[] args) {
		CompositeGames aGame = new CompositeGames();
		playingAgainOrNo();
		while (choiceEndOrNot.equalsIgnoreCase("exit") != true) {
			gameChoice();
			patternChoice();
			game.playOneGame();
			IVisitor visitor = new Judge(); // паттерн поведения Посетитель
			game.accept(visitor);
			System.out.println(game.getScores());
			aGame.add(game);
			aGame.print();
			playingAgainOrNo();
		}
	}

	// структурный паттерн Фасад, позволяющий скрыть сложность системы путём
	// сведения всех возможных внешних вызовов к одному объекту
	public static void patternChoice() {
		System.out.println("Factory or builder pattern?");
		try {
			creatorChoise = br.readLine();
		} catch (IOException e) {
		}
		System.out.println("creatorChoise = " + creatorChoise);
		if (creatorChoise.equalsIgnoreCase("FACTORY")) {
			factoryCreating();
		} else {
			builderCreating();
		}
	}

	public static void factoryCreating() {
		switch (choice3.toUpperCase()) {
		case "CHESS":
			System.out
					.println("we decided to play CHESS and use FACTORY Method ");
			product = creators[0].factoryMethod();
			break;
		case "MONOPOLY":
			System.out
					.println("we decided to play MONOPOLY and use FACTORY Method ");
			product = creators[1].factoryMethod();
			break;
		default:
			product = creators[0].factoryMethod();
		}
	}

	public static void builderCreating() {
		switch (choice2.toUpperCase()) {
		case "CHESS":
			System.out
					.println("we decided to play CHESS and use BUILDER Method ");
			buildingCases();
			break;
		case "MONOPOLY":
			System.out
					.println("we decided to play MONOPOLY and use BUILDER Method ");
			buildingCases();
			break;
		default:
			System.out
					.println("We do NOT have a game like this. Let's play chess!");
			buildingCases();
		}
	}

	public static void buildingCases() {
		GameBuilder aGame1;
		if (choice2.toUpperCase().equals("CHESS")) {
			aGame1 = new ChessGameBuilder();
			directorBuilder.setGameBuilder(aGame1);
			directorBuilder.constructGameChess();
			game = directorBuilder.getGame();
		} else {
			aGame1 = new MonopolyGameBuilder();
			directorBuilder.setGameBuilder(aGame1);
			directorBuilder.constructGameMonopoly();
			game = directorBuilder.getGame();
		}
	}

	public static void gameChoice() {
		System.out.println("Which one to play? Chess or monopoly?");
		try {
			choice2 = br.readLine();
		} catch (IOException e) {
		}
		choice3 = choice2;
		System.out.println("Searcing for games...");
	}

	public static void playingAgainOrNo() {
		System.out.println(" ");
		System.out.println("Do you really wanna play? Type \"exit\" to exit");
		try {
			choiceEndOrNot = br.readLine();
		} catch (IOException e) {
		}
	}

}