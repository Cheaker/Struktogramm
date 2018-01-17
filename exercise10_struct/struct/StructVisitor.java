package exercise10_struct.struct;

public interface StructVisitor {
	public void visitSequence(Sequence s);
	public void visitAssignZeroCommand(AssignZeroCommand c);
	public void visitAssignPlusOneCommand(AssignPlusNCommand c);
	public void visitLessThanConditional(LessThanConditional c);
}
