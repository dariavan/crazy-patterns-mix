package patterns;

import java.util.ArrayList;
import java.util.List;

class CompositeGames implements IComponent {

	private List<IComponent> mChildGame = new ArrayList<IComponent>();

	public void print() {
		for (IComponent aGame : mChildGame) {
			aGame.print();
		}
		System.out.println("Number of played games = " + mChildGame.size());
		System.out.println("We are printing this using Composite pattern");
	}

	// Adds to the composition.
	public void add(IComponent aGame) {
		mChildGame.add(aGame);
	}

	// Removes from the composition.
	public void remove(IComponent aGame) {
		mChildGame.remove(aGame);
	}
}