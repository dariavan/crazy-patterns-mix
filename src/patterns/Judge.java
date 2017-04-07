package patterns;

public class Judge implements IVisitor {

	@Override
	public void visit(Chess game) {
		game.setScores("Judge said: \"Friendship wins!\"");		
	}

	@Override
	public void visit(Monopoly game) {
		game.setScores("Judge said: \"Friendship wins! Love and peace for everybody!\"");		
	}

}