package patterns;

public class ConcreteCreatorChess extends Creator {

	 ConcreteProductChess productChess = new ConcreteProductChess();
	 
		@Override
		public Product factoryMethod() {			
			GamesManager.game = new Chess();
			productChess.setPlayersAmount("2");
			System.out.println("Number of players required: " + productChess.getPlayersAmount());
			productChess.setPrize("No money for prizes now. Sorry");
			System.out.println(productChess.getPrize());
			return new ConcreteProductChess();
		}
		
	}