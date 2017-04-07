package patterns;

interface IVisitor {
	public void visit(Chess game);

	public void visit(Monopoly game);
}